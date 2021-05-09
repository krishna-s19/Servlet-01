package com.product.jdbc;

public class Product {
	private int prodcutPno;
	private String productName;
	private double price;
	private String pmDate;
	public int getProdcutPno() {
		return prodcutPno;
	}
	public void setProdcutPno(int prodcutPno) {
		this.prodcutPno = prodcutPno;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getpmDate() {
		return pmDate;
	}
	public void setmDate(String mDate) {
		this.pmDate = mDate;
	}
}
