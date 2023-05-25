package com.skylaon.kiosk.catcafe.V7.classes;

public class Desert extends Product {
	
	public static int desert_num = 0;
	public Desert(int price, String name){
		super(price, name);
		desert_num++;
	}
	public Desert(String name, int price){
		super(name, price);
		desert_num++;
	}
}
