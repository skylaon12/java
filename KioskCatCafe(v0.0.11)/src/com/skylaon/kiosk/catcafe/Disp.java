package com.skylaon.kiosk.catcafe;

import com.skylaon.util.Cw;

public class Disp {
	String x = "x";	//일반 멤버 변수.
	
	//final 키워드를 붙이면 변수가 상수가 됨. 처음에 값이 들어가면 이후 값을 못 바꿈.
	//상수 명명 국룰 = 이름을 다 대문자로 씀.
	//static 변수:Disp.DOT 식으로 객체 생성없이 아무데서 사용 가능.
	//	> 같은 식구 ex. line() 들은 그냥 DOT 이라고 쓸 수 있음.
	final static String DOT = "★";	
	final static int DOT_COUNT = 48;	
	public static void line() {		//static 함수:Disp.line() 식으로 객체 생성없이 아무데서 사용 가능.
//		Cw.w(x);	// 일반 멤버 변수는 못씀.
		for(int i=0;i<DOT_COUNT;i=i+1) {
			Cw.w(DOT);	// static 멤버 변수는 사용 가능.
		}
		Cw.wn();
	}
	
	public static void d_title() {
		System.out.print("\r\n"
				+ " /$$      /$$           /$$  /$$$$$$                                          /$$\r\n"
				+ "| $$  /$ | $$          | $$ /$$__  $$                                        | $$\r\n"
				+ "| $$ /$$$| $$  /$$$$$$ | $$| $$  \\__/  /$$$$$$  /$$$$$$/$$$$   /$$$$$$       | $$\r\n"
				+ "| $$/$$ $$ $$ /$$__  $$| $$| $$       /$$__  $$| $$_  $$_  $$ /$$__  $$      | $$\r\n"
				+ "| $$$$_  $$$$| $$$$$$$$| $$| $$      | $$  \\ $$| $$ \\ $$ \\ $$| $$$$$$$$      |__/\r\n"
				+ "| $$$/ \\  $$$| $$_____/| $$| $$    $$| $$  | $$| $$ | $$ | $$| $$_____/          \r\n"
				+ "| $$/   \\  $$|  $$$$$$$| $$|  $$$$$$/|  $$$$$$/| $$ | $$ | $$|  $$$$$$$       /$$\r\n"
				+ "|__/     \\__/ \\_______/|__/ \\______/  \\______/ |__/ |__/ |__/ \\_______/      |__/\r\n\n"
);		
		line();
		dot(10);
		Cw.w(" 고양이 카페 (v."+Kiosk.VERSION+" by sm.ahn & skylaon) ");
		dot(10);
		Cw.wn();
		line();
	}
	
	public static void d_main() {
		Cw.wn("명령 입력[1.음료선택/2.디저트선택/e.프로그램종료]:");
	} 
	
	
	
	public static void d_PayCheck() {
		Cw.wn("장바구니에 담긴 상품 갯수:"+KioskObj.basket.size());
		int sum = 0;
		
		
		Cw.wn("=============영수증=============");	////	산거 리스팅	////
		for(Order o:KioskObj.basket) {
			if(o.optionHotCold == 2) {  // 아이스로 선택하면?
				Cw.w(o.selectedProduct.name + "(ICE)\t\t\t");
				Cw.wn(o.selectedProduct.price + 500);
				sum += (o.selectedProduct.price + 500);// 500원 추가해줌
			}
			else { // ice선택 아닌 음료는 그냥 기본 값 추가
				Cw.w(o.selectedProduct.name + "\t\t\t");
				Cw.wn(o.selectedProduct.price);
				sum = sum + o.selectedProduct.price;
			}
		}
		Cw.wn("------------------------------");
		Cw.wn("합계\t\t\t" + sum);
		Cw.wn("==============================");
		Cw.wn("프로그램종료");
		
		
	}
	
	
	
	public static void dot(int n) {
		for(int i=0;i<n;i++) {
			Cw.w(DOT);
		}
	}

}
