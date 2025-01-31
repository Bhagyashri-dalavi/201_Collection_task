package com.collection.task1;

import java.util.List;
import java.util.Scanner;

public class TestProduct {
	public static void main(String[] args) {

		int choice ;
		Scanner sc = new Scanner(System.in);
		ProductOperation operation = new ProductOperation();

		do {
			System.out.println("1. Add Product");
			System.out.println("2. Get specified Product");
			System.out.println("3. Get All Product");
			System.out.println("0. To terminate Application");

			System.out.println("Enter Your choice: ");
			choice = sc.nextInt();
			sc.nextLine();  //clear buffer  after integer input

			switch (choice) {
			case 0: {
				System.out.println("Existing..");
				break;
			}
			case 1: {
				Product product = ProductUtility.prepareProduct();
				String msg = operation.addProduct(product);
				System.out.println(msg);
			
				break;
			}
			case 2: {
				System.out.println("Enter Product Name To Search: ");
				String productName = sc.nextLine();  //use nextLine() to read full product name
				
				Object obj = operation.getSpecificProduct(productName);
				System.out.println(obj);
				
				break;
			}
			case 3: {
				Object obj = operation.getAllProduct();

				if (obj instanceof String) { // use indtanceof for check datatype
					System.out.println(obj);
				} else {
					List<Product> list = (List<Product>) obj;
					for (Product product : list) {
						System.out.println(product);
					}
				}

				break;
			}

			default:
				System.out.println("Invalid Option! Please try again");
			}

		} while (choice != 0);
		System.out.println("Application Terminated");

	}
}
