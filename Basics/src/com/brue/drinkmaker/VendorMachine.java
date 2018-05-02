package com.brue.drinkmaker;

public class VendorMachine {
	Coffee fill(Coffeebean c) {
		System.out.println("Making Coffee");
		Coffee co = new Coffee();
		return co;
	}

	ColdWater fill(Water w) {
		System.out.println("making cold water");
		ColdWater cw = new ColdWater();
		return cw;
	}

	AppleJuice fill(Apple a) {
		System.out.println("Making Apple juice");
		AppleJuice aj = new AppleJuice();
		return aj;
	}

}
