package com.skylaon.kiosk.catcafe.V7;
import com.skylaon.kiosk.catcafe.V7.classes.Product;
import com.skylaon.kiosk.catcafe.V7.menu.KioskObj;
import com.skylaon.kiosk.catcafe.V7.proc.ProcMenuDesert;
import com.skylaon.kiosk.catcafe.V7.proc.ProcMenuDrink;
import com.skylaon.kiosk.catcafe.util.Cw;
public class Kiosk {
	ProcMenuDrink procMenuDrink = new ProcMenuDrink();
	ProcMenuDesert procMenuDesert = new ProcMenuDesert();
	void run() {
		Disp.title();
		KioskObj.menuLoad();
		loop_main:
		while(true) {
			Disp.mainMenu();
			KioskObj.cmd = KioskObj.sc.next();
			switch(KioskObj.cmd) {
			case "1":
				procMenuDrink.run();
				break;
			case "2":
				procMenuDesert.run();
				break;
			case "e":
				int total_price = 0;
				for(Product p:KioskObj.basket) {
					total_price += p.price;
				}
				Cw.wn("총 구매 상품 개수 : " + KioskObj.basket.size());
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
