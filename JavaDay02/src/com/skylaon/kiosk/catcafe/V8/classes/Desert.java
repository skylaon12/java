// 디저트 class 
// 디저트는 hot ice가 따로 없으므로 추가하지 않음
package com.skylaon.kiosk.catcafe.V8.classes;

public class Desert extends Product {
	// 디저트 개수 세기 위함
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
