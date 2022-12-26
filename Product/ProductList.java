package com.capstone.ecom.modal;

import java.util.Set;

public class ProductList {
	
	private static final ProductDetails[] Products=new ProductDetails[5];
	
	static {
		Products[0]=new ProductDetails("Iphone",50000);
		Products[1]=new ProductDetails("Samsung",18000);
		Products[2]=new ProductDetails("Redmi",10000);
		Products[3]=new ProductDetails("OnePlus",13000);
		Products[4]=new ProductDetails("Oppo",9000);
	}

	public ProductList() {
		super();
	}

	public static ProductDetails[] getProducts() {
		return Products;
	}
	
	}
	

