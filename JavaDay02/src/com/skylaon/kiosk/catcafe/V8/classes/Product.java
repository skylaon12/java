// 제품 class
package com.skylaon.kiosk.catcafe.V8.classes;

import java.util.InputMismatchException;

import com.skylaon.kiosk.catcafe.V8.menu.KioskObj;
import com.skylaon.kiosk.catcafe.util.Cw;

public class Product {
	//변수들
	public String name;
	public int price;
	public boolean h_option;
	//오버로딩 : 함수이름이 같지만 매개변수의 갯수나 형만 달리해서 중복 추가하는 것.
	
	//생성자함수 - 그중에 매개변수 2개짜리
	Product(int price, String name){
		this.name = name;
		this.price = price;
		this.h_option = false;
	}
	Product(String name, int price){
		this.name = name;
		this.price = price;
		this.h_option = false;
	}
	Product(int price, String name,boolean h_option){
		this.name = name;
		this.price = price;
		this.h_option = h_option;
	}
	Product(String name, int price, boolean h_option){
		this.name = name;
		this.price = price;
		this.h_option = h_option;
	}

	Product(){
		
	}
	
	public void info() {
		System.out.println(name+" 가격:"+price+"원");
	}
	
	// ice or hot
	public void checkIce() {
		try {
			if(this.h_option) {
				Cw.wn("ICE로 주문하려면 0번을 입력하시오.(+500) // HOT: 아무 키 입력");
				if(KioskObj.sc.nextInt() == 0) {
					this.price+=500;
				}
			}
		} catch (InputMismatchException e) {
			KioskObj.sc.nextLine();
		}
		
	}
	
	
}
