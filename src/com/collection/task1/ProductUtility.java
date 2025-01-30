package com.collection.task1;

import java.util.Scanner;

public class ProductUtility {

	static Scanner sc = new Scanner(System.in);

	public static Product prepareProduct() { // method to take input from user

		System.out.println("Enter Product ID:");
		int id = sc.nextInt();
		sc.nextLine();

		System.out.println("Enter Product Name:");
		String name = sc.nextLine(); // for reading full names or multiple-word inputs.not only until space

		System.out.println("Enter Product QTY:");
		int qty = sc.nextInt();
		

		System.out.println("Enter Product Price:");
		double price = sc.nextDouble();
		sc.nextLine();

		System.out.println("Enter MFGDate:");
		String mfgDate = sc.nextLine();

		System.out.println("Enter EXPDate:");
		String expDate = sc.nextLine();

		Product product = new Product(id, name, qty, price, mfgDate, expDate);

		return product;
	}
}
