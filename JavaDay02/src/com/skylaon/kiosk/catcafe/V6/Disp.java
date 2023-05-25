package com.skylaon.kiosk.catcafe.V6;

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
		
		public static void title() {
			line();
			Cw.wn("************** 고양이 카페   ***************");
			line();
		}
		
		public static void mainMenu() {
			Cw.wn("명령:[1.음료/2.디저트/e.종료]");
		}
		public static void drinkMenu() {
			Cw.wn("================= 음료 리스트 =================");
		}
		public static void desertMenu() {
			Cw.wn("================= 디저트 리스트 =================");
		}
		// 유효하지 않은 입력 시
		public static void err() {
			Cw.wn("올바르지 않은 입력값입니다. 다시 입력하십시오.");
		}
		// 주문 시
		public static void order(String s) {
			Cw.wn(s + "가 1개 선택됐습니다.");
		}
}
