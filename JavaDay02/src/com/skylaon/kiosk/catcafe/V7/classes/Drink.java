package com.skylaon.kiosk.catcafe.V7.classes;

public class Drink extends Product {
	
	public static int drink_num = 0;
	
	public Drink(int price, String name){
		super(price, name);
		drink_num++;
	}
	public Drink(String name, int price){
		super(name, price);
		drink_num++;	
	}
}
