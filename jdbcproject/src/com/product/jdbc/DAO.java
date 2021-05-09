package com.product.jdbc;

public interface DAO {
	public int insertProductData(Product product);
	public int updateProductData(Product product);
	public int deleteProductData(int pno);

}
