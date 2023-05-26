package com.skylaon.kiosk.catcafe;

import com.skylaon.kiosk.catcafe.product.Drink;
import com.skylaon.kiosk.catcafe.product.Product;
import com.skylaon.util.Cw;

public class ProcMenuOptionHotCold {

	public static void run(Product p) {
		// p.option -> true면? 해당 음료는 ice hot을 선택할 수 있다는 뜻(뜨아,아아)
		// 			-> false면? 선택할 수 없는 음료(오렌지 쥬스)
		if (((Drink) p).option) {
			loop: while (true) {
				Cw.wn("[1.hot/2.cold(+500원)/x.이전메뉴로]");
				KioskObj.cmd = KioskObj.sc.next();
				switch (KioskObj.cmd) {
				case "1":
					Cw.wn("hot 선택됨. 이전 메뉴 이동");
					KioskObj.basket.add(new Order(p, 1)); // 오더 추가
					break loop;
				case "2":
					Cw.wn("ice 선택됨. 이전 메뉴 이동");
					KioskObj.basket.add(new Order(p, 2)); // 오더 추가
					break loop;
				case "x":
					Cw.wn("이전 메뉴 이동");
					break loop;
				}
			}	
		}
		else {
			Cw.wn(p.name+" 선택됨");
			KioskObj.basket.add(new Order(p));	//오더 추가
		}
		

	}
}
