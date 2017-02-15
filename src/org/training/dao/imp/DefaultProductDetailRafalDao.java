/**
 *
 */
package org.training.dao.imp;

import de.hybris.platform.catalog.CatalogVersionService;
import de.hybris.platform.core.model.product.ProductModel;
import de.hybris.platform.servicelayer.search.FlexibleSearchService;
import de.hybris.platform.servicelayer.search.SearchResult;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;
import org.training.dao.ProductDetailRafalDao;


/**
 * @author tyszewr
 *
 */
@Component(value = "productDetailDao")
public class DefaultProductDetailRafalDao implements ProductDetailRafalDao
{
	@Resource
	private FlexibleSearchService flexibleSearchService;

	@Resource
	CatalogVersionService catalogVersionService;

	/*
	 * (non-Javadoc)
	 *
	 * @see org.training.dao.ProductDetailRafalDao#getProductDetails()
	 */
	@Override
	public List<ProductModel> getProductDetails()
	{
		catalogVersionService.setSessionCatalogVersion("hybrisProductCatalog", "Online");
		final String queryString = new String("select {PK} from {Product}");
		final SearchResult<ProductModel> sr = getFlexibleSearchService().search(queryString);
		return sr.getResult();
	}

	/**
	 * @return the flexibleSearchService
	 */
	public FlexibleSearchService getFlexibleSearchService()
	{
		return flexibleSearchService;
	}

	/**
	 * @param flexibleSearchService
	 *           the flexibleSearchService to set
	 */
	public void setFlexibleSearchService(final FlexibleSearchService flexibleSearchService)
	{
		this.flexibleSearchService = flexibleSearchService;
	}


}
