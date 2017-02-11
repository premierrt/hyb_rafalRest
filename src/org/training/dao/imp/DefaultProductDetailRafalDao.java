/**
 *
 */
package org.training.dao.imp;

import de.hybris.platform.core.model.product.ProductModel;
import de.hybris.platform.servicelayer.search.FlexibleSearchService;

import java.util.List;

import org.training.dao.ProductDetailRafalDao;


/**
 * @author tyszewr
 *
 */
public class DefaultProductDetailRafalDao implements ProductDetailRafalDao
{

	private FlexibleSearchService fs;

	/*
	 * (non-Javadoc)
	 *
	 * @see org.training.dao.ProductDetailRafalDao#getProductDetails()
	 */
	@Override
	public List<ProductModel> getProductDetails()
	{



		return null;
	}

	/**
	 * @return the fs
	 */
	public FlexibleSearchService getFs()
	{
		return fs;
	}

	/**
	 * @param fs the fs to set
	 */
	public void setFs(FlexibleSearchService fs)
	{
		this.fs = fs;
	}

}
