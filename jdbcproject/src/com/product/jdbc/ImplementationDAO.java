package com.product.jdbc;

import java.sql.Connection;
import java.sql.Statement;

public class ImplementationDAO implements DAO{
	Connection con = null;
	Statement st =null;
	public ImplementationDAO() {
	con = ConnectionTest.getInstanceOf();
	 }
	@Override
	public int insertProductData(Product product) {
	int count =0;
	String query ="insert into product_table values("+product.getProdcutPno()+","+"'"+product.getProductName()+"'"+","+product.getPrice()+","
	+product.getpmDate()+")";
	try{
	st = con.createStatement();
	count = st.executeUpdate(query);
	}catch (Exception e) {
		e.printStackTrace();
		}
		return 0;
	}
	@Override  
	public int updateProductData(Product product) {
		int count=0;
		// update product_table set pname='Appolo' where pno=400;
		String query = "update product_table set panme="+"'"+product.getProductName()+"'"+","+"price="+product.getPrice()+","
		+"where pno="+product.getProdcutPno();
		try{
		st = con.createStatement();
		count = st.executeUpdate(query);
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		return count;
	}
	@Override
	public int deleteProductData(int pno) {
		
		return 0;
	}
}
