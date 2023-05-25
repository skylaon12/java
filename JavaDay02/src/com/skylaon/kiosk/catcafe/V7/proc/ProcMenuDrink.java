package com.skylaon.kiosk.catcafe.V7.proc;

import com.skylaon.kiosk.catcafe.util.Cw;
import com.skylaon.kiosk.catcafe.V7.*;
import com.skylaon.kiosk.catcafe.V7.classes.Desert;
import com.skylaon.kiosk.catcafe.V7.classes.Drink;
import com.skylaon.kiosk.catcafe.V7.classes.Product;
import com.skylaon.kiosk.catcafe.V7.menu.KioskObj;

public class ProcMenuDrink {
	
	public void run() {
		Disp.drinkMenu();
		for(Product p: KioskObj.total_drink) {
			p.info();
		}
		loop_drink:
		while(true) {
			
			// 명령: [1. 아메리카노/2.카푸치노/3.오렌지쥬스/x.이전메뉴]
			Cw.w("명령:[");
			for(int i=0; i < Drink.drink_num; i++) {
				Cw.w((i+1) + "." + KioskObj.total_drink.get(i).name + "/");
			}
			Cw.w("x.이전메뉴]");
			
			KioskObj.cmd = KioskObj.sc.next();
			
			switch(KioskObj.cmd) {
			case "1":// 아메리카노 선택 시
				KioskObj.basket.add(KioskObj.total_drink.get(0));
				Disp.order(KioskObj.total_drink.get(0).name);
				break;
			case "2":// 카푸치노 선택 시
				KioskObj.basket.add(KioskObj.total_drink.get(1));
				Disp.order(KioskObj.total_drink.get(1).name);
				break;
			case "3":// 오렌지 쥬스 선택 시
				KioskObj.basket.add(KioskObj.total_drink.get(2));
				Disp.order(KioskObj.total_drink.get(2).name);
				break;
			case "x":
				break loop_drink;
			default:
				Disp.err();
				break;
			}
		}
	}
}
