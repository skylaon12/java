// 음료 주문 로직
package com.skylaon.kiosk.catcafe.V8.proc;

import com.skylaon.kiosk.catcafe.V8.Disp;
import com.skylaon.kiosk.catcafe.V8.classes.Drink;
import com.skylaon.kiosk.catcafe.V8.classes.Product;
import com.skylaon.kiosk.catcafe.V8.menu.KioskObj;
import com.skylaon.kiosk.catcafe.util.Cw;
public class ProcMenuDrink {
	
	public void run() {
		Disp.d_drinkMenu();
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
				Order.DrinkOrder(KioskObj.total_drink.get(0));		
				break;
			case "2":// 카푸치노 선택 시
				Order.DrinkOrder(KioskObj.total_drink.get(1));
				break;
			case "3":// 오렌지 쥬스 선택 시
				Order.DrinkOrder(KioskObj.total_drink.get(2));
				break;
			case "x":
				break loop_drink;
			default:
				Disp.d_err();
				break;
			}
		}
	}
}
