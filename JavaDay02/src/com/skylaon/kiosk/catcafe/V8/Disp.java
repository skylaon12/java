// 화면 출력용 class
package com.skylaon.kiosk.catcafe.V8;

import java.util.ArrayList;

import com.skylaon.kiosk.catcafe.V8.classes.Product;
import com.skylaon.kiosk.catcafe.V8.menu.KioskObj;
import com.skylaon.kiosk.catcafe.util.Cw;

public class Disp {
	//일반 변수.
		String x = "x";
		
		////	static 변수	////
		//final 키워드를 붙이면 변수가 상수가 됨. 처음에 값이 들어가면 이후 값을 못 바꿈.
		//상수 명명 국룰 = 이름을 다 대문자로 씀.
		final static String DOT = "★";	
		public static void line() {
//			Cw.w(x);	// 일반 멤버 변수는 못씀.
			for(int i=0;i<32;i++) {
				Cw.w(DOT);	// static 멤버 변수는 사용 가능.
			}
			Cw.wn("");
		}
		
		public static void d_title() {
			line();
			Cw.wn("************** 고양이 카페   ***************");
			line();
		}
		
		public static void d_mainMenu() {
			Cw.wn("명령:[1.음료/2.디저트/e.종료]");
		}
		public static void d_drinkMenu() {
			Cw.wn("================= 음료 리스트 =================");
		}
		public static void d_desertMenu() {
			Cw.wn("================= 디저트 리스트 =================");
		}
		// 유효하지 않은 입력 시
		public static void d_err() {
			Cw.wn("올바르지 않은 입력값입니다. 다시 입력하십시오.");
		}
		// 주문 시
		public static void d_order(String s) {
			Cw.wn(s + "가 1개 선택됐습니다.");
		}
		
		// 영수증 출력
		public static void d_receipt(ArrayList<Product> bag) {
			int total_price = 0; // 총 금액
			Cw.wn("==========영수증==========");
			for(Product p: KioskObj.basket) {
				Cw.wn(p.name + "\t" + p.price + "원");
				total_price += p.price;
			}
			Cw.wn("===========================");
			Cw.wn("\t\t\t총 합 : " + total_price + "원");
			Cw.wn("총 구매 상품 개수 : " + KioskObj.basket.size());
		}
}
