/**
 *
 */
package org.training;

import de.hybris.platform.core.model.product.ProductModel;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


/**
 * @author tyszewr
 *
 */
@Controller
public class RafalProductController
{

	@Resource
	private ProductDetailRafalService rafalProductDetailService;

	@RequestMapping(value = "/rafal/products")
	public @ResponseBody List<ProductModel> showProducts()
	{
		return rafalProductDetailService.getProductDetails();
	}

}
