package com.collection.task1;



	import java.util.ArrayList;
	import java.util.List;

	public class ProductOperation1 {

	    List<Product> list = new ArrayList<>();

	    public String addProduct(Product product) {
	        // Check if the product already exists
	        for (Product dbProduct : list) {
	            if (dbProduct.getProductName().equalsIgnoreCase(product.getProductName())) {
	                return "Product already exists.";
	            }
	        }
	        // Add the product to the list
	        list.add(product);
	        return "Product added successfully!";
	    }

	    public String getAllProduct() {
	        if (list.isEmpty()) {
	            return "No products in the list.";
	        }

	        // Use StringBuilder inside the method
	        StringBuilder result = new StringBuilder("Product List:\n");
	        for (Product dbProduct : list) {
	            result.append(dbProduct).append("\n");
	        }
	        return result.toString();
	    }

	    public String getSpecificProduct(String productName) {
	        for (Product product : list) {
	            if (product.getProductName().equalsIgnoreCase(productName)) {
	                return getAllProduct();
	            }
	        }
	        return "Product does not exist.";
	    
	    }
	}



