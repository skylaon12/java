package com.skylaon.kiosk.catcafe.V8.classes;

import com.skylaon.kiosk.catcafe.V8.menu.KioskObj;
import com.skylaon.kiosk.catcafe.util.Cw;

public class Drink extends Product {
	
	public static int drink_num = 0;
	// 얼음선택 옵션 유무
	public boolean h_option = false;
	public Drink(int price, String name){
		super(price, name);
		drink_num++;
	}
	public Drink(String name, int price){
		super(price, name);
		drink_num++;
	}
	public Drink(String name, int price, boolean option){
		super(name, price, option);
		drink_num++;
	}
	public Drink(int price, String name, boolean option){
		super(name, price, option);
		drink_num++;	
	}

	// ICE로 주문하면 500원 추가
	public void OptionHotCold() {
		if(h_option) { // 옵션 선택이 가능하다면?
			Cw.w("ICE로 주문하려면 0번을 입력하시오.(+500) // HOT: 아무 키 입력");
			int option = KioskObj.sc.nextInt();
			// 가격 500원 추가
			this.price = (option == 0)?this.price+500:this.price;
		}
		
	}
	
}
