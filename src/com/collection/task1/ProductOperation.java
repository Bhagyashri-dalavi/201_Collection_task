package com.collection.task1;

import java.util.ArrayList;
import java.util.List;

public class ProductOperation {

	List<Product> list = new ArrayList<Product>();

	public String addProduct(Product product) {    //in return it gives String 

//If not exists, add the product
		list.add(product);
		return "Product added Successfully!";
	}
	
		public Object getAllProduct() {
			try {
				if(list.isEmpty()) {
					return "Product not exists in list";
				}else {
					return list;
				}
			} catch (Exception e) {
				return "Something went wrong";
			}
	}
		public Object getSpecificProduct(String productName) {
			for(Product product:list)
			if(product.getProductName().equalsIgnoreCase(productName)) {
				return product;
			
			}
			return "Product not exists";
		}
}
