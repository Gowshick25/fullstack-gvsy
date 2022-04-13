package com.training;

public class Product {
	private int productId;
	private String productName;
	private int ratePerUnit;
	
	
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public int getRatePerUnit() {
		return ratePerUnit;
	}
	public void setRatePerUnit(int ratePerUnit) {
		this.ratePerUnit = ratePerUnit;
	}
	public Product(int productId, String productName, int ratePerUnit) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.ratePerUnit = ratePerUnit;
	}
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + ", ratePerUnit=" + ratePerUnit
				+ "]";
	}

}
