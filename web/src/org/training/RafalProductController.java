/**
 *
 */
package org.training;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;


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
	private RafalProductFacade defaultRafalProductFacade;

	@ApiOperation(value = "Returns product details", notes = "Returns a complete list of products", response = RafalDataProduct.class)
	@ApiResponses(value =
	{ @ApiResponse(code = 200, message = "Successful retrieval of user detail", response = RafalDataProduct.class),
			@ApiResponse(code = 404, message = "User with given username does not exist"),
			@ApiResponse(code = 500, message = "Internal server error") })
	@RequestMapping(value = "/rafal/products", method = RequestMethod.GET)
	public @ResponseBody List<RafalDataProduct> showProducts()
	{

		final ArrayList<RafalDataProduct> lista = new ArrayList<RafalDataProduct>();
		lista.add(defaultRafalProductFacade.getProducts());
		//to_do tmp
		return (lista);
	}

}
