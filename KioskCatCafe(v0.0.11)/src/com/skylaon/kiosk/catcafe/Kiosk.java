package com.skylaon.kiosk.catcafe;

//자동임포트 단축키: ctrl+shift+o(영문자O)
public class Kiosk {
	
	public static final String VERSION = "0.0.11";	//버전 표시용.

	void run() {
		KioskObj.productLoad();	//상품로드
		Disp.d_title();
		xx:while(true) {
			Disp.d_main();
			KioskObj.cmd = KioskObj.sc.next();
			switch(KioskObj.cmd) {
			case "1":
				ProcMenuDrink.run();
				break;
			case "2":
				ProcMenuDessert.run();
				break;
			case "e":
				Disp.d_PayCheck();
				break xx;
			}
		}		
	}
}