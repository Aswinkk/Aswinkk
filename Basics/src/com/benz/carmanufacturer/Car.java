package com.benz.carmanufacturer;

public class Car {
	Smoke fill(Petrol p) {
		System.out.println("creating smoke");
		Smoke s = new Smoke();
		return s;
	}

	Smoke fill(Diesel d) {
		System.out.println("Creating smoke");
		Smoke s = new Smoke();
		return s;

	}

	Smoke fill(Gasoline g) {
		System.out.println("creating smoke");
		Smoke s = new Smoke();
		return s;
	}

}
