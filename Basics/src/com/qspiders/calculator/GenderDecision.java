package com.qspiders.calculator;

public class GenderDecision {
	String genderDecision(int a) {
		if (a == 1) {
			return "Boy";
		} else if (a == 2) {
			return "Girl";
		} else {
			return "Nill";
		}

	}

	public static void main(String[] args) {
		GenderDecision g = new GenderDecision();
		System.out.println(g.genderDecision(1));
		System.out.println(g.genderDecision(10));
		System.out.println(g.genderDecision(2));
		System.out.println(g.genderDecision(5));
	}
}
