// 키오스크 입력 로직
package com.skylaon.kiosk.catcafe.V8;
import com.skylaon.kiosk.catcafe.V8.menu.KioskObj;
import com.skylaon.kiosk.catcafe.V8.proc.ProcMenuDesert;
import com.skylaon.kiosk.catcafe.V8.proc.ProcMenuDrink;
import com.skylaon.kiosk.catcafe.util.Cw;
public class Kiosk {
	ProcMenuDrink procMenuDrink = new ProcMenuDrink();
	ProcMenuDesert procMenuDesert = new ProcMenuDesert();
	void run() {
		Disp.d_title();
		KioskObj.menuLoad();
		loop_main:
		while(true) {
			Disp.d_mainMenu();
			KioskObj.cmd = KioskObj.sc.next();
			switch(KioskObj.cmd) {
			case "1":
				procMenuDrink.run();
				break;
			case "2":
				procMenuDesert.run();
				break;
			case "e":
				Disp.d_receipt(KioskObj.basket);
				break loop_main;
			default:
				Disp.d_err();
				break;
			}
		}
		Cw.wn("프로그램 종료");
	}
}
