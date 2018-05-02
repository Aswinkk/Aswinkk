package com.mi.unlockapp;

public class TestMobile {
	public static void main(String[] args) {

		Mobile m = new Mobile();
		System.out.println("created an object of the mobile phone");
		Pattern p = new Pattern();
		System.out.println(" pattern is drawn");
		m.unlock(p);
		System.out.println("enter the pin");
		m.unlock(2354);
		

	}

}
