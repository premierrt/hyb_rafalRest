/**
 *
 */
package org.training;

import de.hybris.platform.core.model.product.ProductModel;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;


/**
 * @author tyszewr
 *
 */
@Controller
@RequestMapping(value = "/rest", method = RequestMethod.GET)
//, headers = "Accept=application/json"
public class RafalProductController
{

	@Resource
	private ProductDetailRafalService rafalProductDetailService;

	@RequestMapping(value = "/rafal/products", method = RequestMethod.GET)
	public @ResponseBody List<ProductModel> showProducts()
	{
		return rafalProductDetailService.getProductDetails();
	}

}
