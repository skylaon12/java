package com.skylaon.kiosk.catcafe.V8.proc;

import com.skylaon.kiosk.catcafe.V8.Disp;
import com.skylaon.kiosk.catcafe.V8.classes.Product;
import com.skylaon.kiosk.catcafe.V8.menu.KioskObj;

public class Order {
	
	public static void DrinkOrder(Product p) {
		KioskObj.basket.add(p);
		KioskObj.basket.get(KioskObj.basket.size()-1).checkIce();
		Disp.d_order(p.name);
	}
	
	public static void DesertOrder(Product p) {
		KioskObj.basket.add(p);
		Disp.d_order(p.name);
	}
	
	
}
