package com.capstone.ecom;

import com.capstone.ecom.modal.ProductDetails;
import com.capstone.ecom.modal.ProductList;

public class Product {
	
	public static void main(String[] args) {
		try {
			System.out.println("=====Display all Products=====");
			ProductDetails [] products=ProductList.getProducts();
			printProduct(products);
			System.out.println("=====Updated Price=====");
			final int product_id=5;
			ProductDetails product=findByProduct_id(products, product_id);
			
			if(product!=null) {
				System.out.println("Before updated :"+product);
				final double price=product.getPrice()+1000;
				product.setPrice(price);
				System.out.println("After updated :"+product);
			}
			final String msg=findByProduct_idAndDelete(products,product_id);
			System.out.println(msg);
			
			printProduct(products);
						
		}catch(Exception e) {
			
		}
	}

	private static String findByProduct_idAndDelete(ProductDetails[] products, int product_id) {
		for(int i=0;i<products.length;i++) {
			if(products[i].getProduct_id()==product_id) {
				products[i]=null;
				return product_id+" record is Deleted ";				
			}
		}
		return "Product not available";
	}

	private static ProductDetails findByProduct_id(ProductDetails[] products, final int Product_id) {
		for(ProductDetails product : products) {
			if(product.getProduct_id()==Product_id) {
				return product;				
			}
		}
		return null;
	}
	private static void printProduct(ProductDetails[] products) {
			for(ProductDetails productDetails : products) {
				System.out.println(productDetails);
			}
	}
	
	}
