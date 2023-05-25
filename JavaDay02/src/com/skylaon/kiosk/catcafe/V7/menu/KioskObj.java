package com.skylaon.kiosk.catcafe.V7.menu;

import java.util.ArrayList;
import java.util.Scanner;

import com.skylaon.kiosk.catcafe.V7.classes.Desert;
import com.skylaon.kiosk.catcafe.V7.classes.Drink;
import com.skylaon.kiosk.catcafe.V7.classes.Product;

public class KioskObj {

	public static ArrayList<Product> basket = new ArrayList<Product>();
	public static ArrayList<Drink> total_drink = new ArrayList<Drink>();
	public static ArrayList<Desert> total_desert = new ArrayList<Desert>();
	
	public static Scanner sc = new Scanner(System.in);
	public static String cmd;
	
	public static void menuLoad() {
		total_drink.add(new Drink("아메리카노",2500));
		total_drink.add(new Drink("카푸치노",3500));
		total_drink.add(new Drink("오렌지쥬스",3000));
		total_desert.add(new Desert("마카롱",2000));
		total_desert.add(new Desert("치즈케이크",4800));
		total_desert.add(new Desert("딸기케이크",4500));
		
	}
}
