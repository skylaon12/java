// 디저트 주문 로직

package com.skylaon.kiosk.catcafe.V8.proc;

import com.skylaon.kiosk.catcafe.V8.Disp;
import com.skylaon.kiosk.catcafe.V8.classes.Desert;
import com.skylaon.kiosk.catcafe.V8.classes.Product;
import com.skylaon.kiosk.catcafe.V8.menu.KioskObj;
import com.skylaon.kiosk.catcafe.util.Cw;

public class ProcMenuDesert {
	
	public void run() {
		Disp.d_desertMenu();
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
					Order.DesertOrder(KioskObj.total_desert.get(0));		
					break;
				case "2":
					Order.DesertOrder(KioskObj.total_desert.get(1));
					break;
				case "3":
					Order.DesertOrder(KioskObj.total_desert.get(2));
					break;
				case "x":
					break loop_desert;
				default:
					Disp.d_err();
					break;
				}
			}
	}
}
