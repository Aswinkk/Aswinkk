package com.brue.drinkmaker;

public class TestVendorMachine {
	public static void main(String[] args) {
		System.out.println("Creating new Vendor machine");
		VendorMachine v = new VendorMachine();
		System.out.println("Creating Coffeebean");
		Coffeebean cb = new Coffeebean();
		System.out.println("filling the machine with coffee bean");
		Coffee f = v.fill(cb);
		System.out.println("Recieved coffee");
		System.out.println("Creating Watter");
		Water w = new Water();
		System.out.println("filling the machine with water");
		ColdWater cw = v.fill(w);
		System.out.println("recieved water");
		System.out.println("Creating Apple");
		Apple a = new Apple();
		System.out.println("filling the machine with apple");
		AppleJuice aj = v.fill(a);
		System.out.println("Recieved apple juice");

	}

}
