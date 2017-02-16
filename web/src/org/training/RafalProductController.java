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

	@RequestMapping(value = "/rafal/products", method = RequestMethod.GET)
	public @ResponseBody List<RafalDataProduct> showProducts()
	{

		final ArrayList<RafalDataProduct> lista = new ArrayList<RafalDataProduct>();
		lista.add(defaultRafalProductFacade.getProducts());
		//to_do tmp
		return (lista);
	}

}
