/**
 *
 */
package org.training;

import de.hybris.platform.converters.Populator;
import de.hybris.platform.core.model.product.ProductModel;
import de.hybris.platform.servicelayer.dto.converter.ConversionException;


/**
 * @author tyszewr
 *
 */
public class RafalProductPopulator implements Populator<ProductModel, RafalDataProduct>
{


	/*
	 * (non-Javadoc)
	 *
	 * @see de.hybris.platform.converters.Populator#populate(java.lang.Object, java.lang.Object)
	 */
	@Override
	public void populate(final ProductModel source, final RafalDataProduct target) throws ConversionException
	{

		target.setProductDescription(source.getDescription());
		target.setProductName(source.getName());
	}


}
