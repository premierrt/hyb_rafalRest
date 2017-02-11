/**
 *
 */
package org.training.imp;

import de.hybris.platform.core.model.product.ProductModel;

import org.training.ProductDetailRafalService;
import org.training.dao.ProductDetailRafalDao;


/**
 * @author tyszewr
 *
 */
public class DefaultProductDetailRafalService implements ProductDetailRafalService
{

	private ProductDetailRafalDao productDetailDao;

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.training.ProductDetailRafalService#getProductDetails()
	 */
	@Override
	public ProductModel getProductDetails()
	{
		// YTODO Auto-generated method stub
		return null;
	}

	/**
	 * @return the productDetailDao
	 */
	public ProductDetailRafalDao getProductDetailDao()
	{
		return productDetailDao;
	}

	/**
	 * @param productDetailDao the productDetailDao to set
	 */
	public void setProductDetailDao(ProductDetailRafalDao productDetailDao)
	{
		this.productDetailDao = productDetailDao;
	}

}
