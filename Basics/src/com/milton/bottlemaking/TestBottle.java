package com.milton.bottlemaking;

public class TestBottle {
	public static void main(String[] args) {
		System.out.println("Creating an object bottle");
		Bottle b = new Bottle();
		System.out.println("Creating water");
		Water w = new Water();
		b.store(w);
		System.out.println("Completed");

	}

}
