package com.collection.task1;

public class Product {
	private int productID;
	private String productName;
	private int productQty;
	private double productPrice;
	private String productMGFDate;
	private String productEXPDate;
	
	public Product() {
		// TODO Auto-generated constructor stub
	}

	public Product(int productID, String productName, int productQty, double productPrice, String productMGFDate,
			String productEXPDate) {
		super();
		this.productID = productID;
		this.productName = productName;
		this.productQty = productQty;
		this.productPrice = productPrice;
		this.productMGFDate = productMGFDate;
		this.productEXPDate = productEXPDate;
	}

	public int getProductID() {
		return productID;
	}

	public void setProductID(int productID) {
		this.productID = productID;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public int getProductQty() {
		return productQty;
	}

	public void setProductQty(int productQty) {
		this.productQty = productQty;
	}

	public double getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(double productPrice) {
		this.productPrice = productPrice;
	}

	public String getProductMGFDate() {
		return productMGFDate;
	}

	public void setProductMGFDate(String productMGFDate) {
		this.productMGFDate = productMGFDate;
	}

	public String getProductEXPDate() {
		return productEXPDate;
	}

	public void setProductEXPDate(String productEXPDate) {
		this.productEXPDate = productEXPDate;
	}
 
	@Override
	public String toString() {
		return "Product [productID=" + productID + ", productName=" + productName + ", productQty=" + productQty
				+ ", productPrice=" + productPrice + ", productMGFDate=" + productMGFDate + ", productEXPDate="
				+ productEXPDate + "]";
	}

	
}
