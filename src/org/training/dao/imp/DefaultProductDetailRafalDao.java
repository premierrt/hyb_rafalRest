/**
 *
 */
package org.training.dao.imp;

import de.hybris.platform.core.model.product.ProductModel;
import de.hybris.platform.servicelayer.search.FlexibleSearchService;
import de.hybris.platform.servicelayer.search.SearchResult;

import java.util.List;

import javax.annotation.Resource;

import org.training.dao.ProductDetailRafalDao;


/**
 * @author tyszewr
 *
 */
public class DefaultProductDetailRafalDao implements ProductDetailRafalDao
{
	@Resource
	private FlexibleSearchService fs;

	/*
	 * (non-Javadoc)
	 *
	 * @see org.training.dao.ProductDetailRafalDao#getProductDetails()
	 */
	@Override
	public List<ProductModel> getProductDetails()
	{

		final String queryString = new String("select {PK} from {Product}");
		final SearchResult<ProductModel> sr = fs.search(queryString);
		return sr.getResult();
	}

	/**
	 * @return the fs
	 */
	public FlexibleSearchService getFs()
	{
		return fs;
	}

	/**
	 * @param fs
	 *           the fs to set
	 */
	public void setFs(final FlexibleSearchService fs)
	{
		this.fs = fs;
	}

}
