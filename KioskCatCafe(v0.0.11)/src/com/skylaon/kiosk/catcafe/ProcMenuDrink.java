package com.skylaon.kiosk.catcafe;

import com.skylaon.kiosk.catcafe.product.Product;
import com.skylaon.util.Cw;

public class ProcMenuDrink {
	
	public static void run() {
		for(Product p:KioskObj.products) {	//메뉴출력
			Cw.wn(p.name+" "+p.price +"원");
		}
		yy:while(true) {
			
			Cw.wn("[1.커피/2.오렌지쥬스/x.이전메뉴로]");
			KioskObj.cmd = KioskObj.sc.next();
			switch(KioskObj.cmd) {
			case "1":
				ProcMenuOptionHotCold.run(KioskObj.products.get(0));
				break;
			case "2":
				ProcMenuOptionHotCold.run(KioskObj.products.get(1));
				break;
			case "x":
				Cw.wn("이전 메뉴 이동");
				break yy;
			}
		}
	}
}