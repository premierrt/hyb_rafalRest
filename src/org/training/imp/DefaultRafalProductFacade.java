/**
 *
 */
package org.training.imp;

import de.hybris.platform.core.model.product.ProductModel;
import de.hybris.platform.servicelayer.dto.converter.Converter;

import java.util.List;

import javax.annotation.Resource;

import org.training.ProductDetailRafalService;
import org.training.RafalDataProduct;
import org.training.RafalProductFacade;


/**
 * @author tyszewr
 *
 */
public class DefaultRafalProductFacade implements RafalProductFacade
{

	@Resource
	private ProductDetailRafalService rafalProductDetailService;

	@Resource
	private Converter<ProductModel, RafalDataProduct> rafalProductConverter;

	/*
	 * (non-Javadoc)
	 *
	 * @see org.training.RafalProductFacade#getProducts()
	 */
	@Override
	public RafalDataProduct getProducts()
	{
		// YTODO Auto-generated method stub
		final List<ProductModel> productModels = rafalProductDetailService.getProductDetails();

		///tymczasowe
		final RafalDataProduct rdp = rafalProductConverter.convert(productModels.get(0));

		return rdp;
	}

}
