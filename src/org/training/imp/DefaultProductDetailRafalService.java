/**
 *
 */
package org.training.imp;

import de.hybris.platform.core.model.product.ProductModel;

import java.util.List;

import org.training.ProductDetailRafalService;
import org.training.dao.ProductDetailRafalDao;


/**
 * @author tyszewr
 *
 */
public class DefaultProductDetailRafalService implements ProductDetailRafalService
{

	private ProductDetailRafalDao productDetailDao;


	/**
	 * @param productDetailDao
	 *           the productDetailDao to set
	 */
	public void setProductDetailDao(final ProductDetailRafalDao productDetailDao)
	{
		this.productDetailDao = productDetailDao;
	}


	/*
	 * (non-Javadoc)
	 * 
	 * @see org.training.ProductDetailRafalService#getProductDetails()
	 */
	@Override
	public List<ProductModel> getProductDetails()
	{
		// YTODO Auto-generated method stub
		return productDetailDao.getProductDetails();
	}

}
