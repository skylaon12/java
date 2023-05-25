package com.skylaon.kiosk.catcafe.V7.proc;

import com.skylaon.kiosk.catcafe.V7.Disp;
import com.skylaon.kiosk.catcafe.V7.classes.Desert;
import com.skylaon.kiosk.catcafe.V7.classes.Product;
import com.skylaon.kiosk.catcafe.V7.menu.KioskObj;
import com.skylaon.kiosk.catcafe.util.Cw;

public class ProcMenuDesert {
	
	public void run() {
		Disp.desertMenu();
		for(Product p: KioskObj.total_desert) {
			p.info();
		}
		loop_desert:
			while(true) {
				Cw.w("명령:[");
				for(int i=0; i < Desert.desert_num; i++) {
					Cw.w((i+1) + "." + KioskObj.total_desert.get(i).name + "/");
				}
				Cw.w("x.이전메뉴]");
				KioskObj.cmd = KioskObj.sc.next();

				switch (KioskObj.cmd) {
				case "1":
					KioskObj.basket.add(KioskObj.total_desert.get(0));
					Disp.order(KioskObj.total_desert.get(0).name);
					break;
				case "2":
					KioskObj.basket.add(KioskObj.total_desert.get(1));
					Disp.order(KioskObj.total_desert.get(1).name);
					break;
				case "3":
					KioskObj.basket.add(KioskObj.total_desert.get(2));
					Disp.order(KioskObj.total_desert.get(2).name);
					break;
				case "x":
					break loop_desert;
				default:
					Disp.err();
					break;
				}
			}
	}
}
