package com.skylaon.kiosk.catcafe.V5;

import java.util.ArrayList;
import java.util.Scanner;

public class Kiosk {
	void run() {
		System.out.println("================= 고양이카페 =================");
		//ctrl + shift + o(영문자). 자동 임포트.
		ArrayList<Product> basket = new ArrayList<Product>();
		Product p1 = new Product("아아",1000);
		Product p2 = new Product("뜨아",2000);
		Product p3 = new Product("오렌지쥬스",4000);
		Product p4 = new Product(5000,"마카롱");
	
		Scanner sc = new Scanner(System.in);
		String cmd;
		loop_main:
		while(true) {
			System.out.print("명령:[1.음료/2.디저트/e.종료]");
			cmd = sc.next();
			switch(cmd) {
			case "1":
				System.out.println("================= 음료 리스트 =================");
				p1.info();
				p2.info();
				p3.info();
				loop_drink:
				while(true) {
					System.out.print("명령:[1.아아/2.뜨아/3.오렌지쥬스/x.이전메뉴]");
					cmd = sc.next();					
					switch(cmd) {
					case "1":
						basket.add(p1);
						System.out.println("아아가 1개 선택됐습니다.");
						break;
					case "2":
						basket.add(p2);
						System.out.println("뜨아가 1개 선택됐습니다.");
						break;
					case "3":
						basket.add(p3);
						System.out.println("오렌지쥬스가 1개 선택됐습니다.");
						break;
					case "x":
						break loop_drink;
					}
				}
				
				break;
			case "2":
				System.out.println("================= 디저트 리스트 =================");
				p4.info();
				loop_desert:
					while(true) {
						System.out.println("명령:[1.마카롱/x.이전메뉴]");
						cmd = sc.next();
						switch (cmd) {
						case "1":
							basket.add(p4);
							System.out.println("마카롱이 1개 선택됐습니다.");
							break;
						case "x":
							break loop_desert;
						}
					}
				break;
			case "e":
				int total_price = 0;
				for(int i = 0; i < basket.size(); i++) {
					total_price += basket.get(i).price;
				}
				System.out.println("총 구매 상품 개수 : " + basket.size());
				System.out.println("가격 : " + total_price);
				break loop_main;
			}
		}
		System.out.println("프로그램 종료");
	}
}
