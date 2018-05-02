package com.quencha.bttlemanufacture;

public class WaterBottle {
	String color = "blue";
	String shape = "cylindrical";
	int value = 100;
	double height = 13.5;

	public static void main(String[] args) {
		WaterBottle w = new WaterBottle();
		System.out.println(w.color);
		System.out.println(w.height);
		System.out.println(w.shape);
		System.out.println(w.value);
		w.color = "purple";
		System.out.println(w.color);
		WaterBottle w1 = new WaterBottle();
		w1.color = "green";
		w1.shape = "round";
		System.out.println(w1.color);
		System.out.println(w1.shape);
	}
}
