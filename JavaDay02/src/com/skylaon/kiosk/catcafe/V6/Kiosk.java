package com.skylaon.kiosk.catcafe.V6;

import java.util.ArrayList;
import java.util.Scanner;
import com.skylaon.kiosk.catcafe.util.Cw;
public class Kiosk {
	void run() {
		Disp.title();

		ArrayList<Product> basket = new ArrayList<Product>();
		Product p1 = new Product("아아",1000);
		Product p2 = new Product("뜨아",2000);
		Product p3 = new Product("오렌지쥬스",4000);
		Product p4 = new Product(5000,"마카롱");
	
		Scanner sc = new Scanner(System.in);
		String cmd;
		loop_main:
		while(true) {
			Disp.mainMenu();
			cmd = sc.next();
			switch(cmd) {
			case "1":
				Disp.drinkMenu();
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
						Disp.order(p1.name);
						break;
					case "2":
						basket.add(p2);
						Disp.order(p2.name);
						break;
					case "3":
						basket.add(p3);
						Disp.order(p3.name);
						break;
					case "x":
						break loop_drink;
					default:
						Disp.err();
						break;
					}
				}
				
				break;
			case "2":
				Disp.desertMenu();
				p4.info();
				loop_desert:
					while(true) {
						System.out.println("명령:[1.마카롱/x.이전메뉴]");
						cmd = sc.next();
						switch (cmd) {
						case "1":
							basket.add(p4);
							Disp.order(p4.name);
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
				Cw.wn("총 구매 상품 개수 : " + basket.size());
				Cw.wn("가격 : " + total_price);
				break loop_main;
			default:
				Disp.err();
				break;
			}
		}
		Cw.wn("프로그램 종료");
	}
}
