/**
 *
 */
package org.training;

import static org.junit.Assert.assertEquals;

import de.hybris.platform.core.model.product.ProductModel;
import de.hybris.platform.servicelayer.ServicelayerTransactionalTest;
import de.hybris.platform.servicelayer.model.ModelService;

import java.util.List;
import java.util.Locale;

import javax.annotation.Resource;

import org.junit.Before;
import org.junit.Test;




/**
 * @author tyszewr
 *
 */

public class DefaultRafalServiceTest extends ServicelayerTransactionalTest
{

	@Resource(name = "defaultProductDetailService")
	private ProductDetailRafalService productService;

	@Resource
	private ModelService modelService;

	private ProductModel productModel;

	@Before
	public void setUp()
	{
		productModel = new ProductModel();
		productModel.setDescription("duap opia", Locale.ENGLISH);

	}

	@Test
	public void testService()
	{
		modelService.save(productModel);
		final List<ProductModel> pms = productService.getProductDetails();
		assertEquals(1, pms.size());
	}

}
