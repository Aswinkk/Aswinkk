package com.qspiders.calculatorapp;

public class TestCalculator {
	public static void main(String[] args) {
		Calculator c = new Calculator();
		System.out.println(c.add(10, 20));
		int res = c.cube(3);
		System.out.println(res);
	}

}
