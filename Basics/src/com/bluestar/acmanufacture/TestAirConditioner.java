package com.bluestar.acmanufacture;

public class TestAirConditioner {
	public static void main(String[] args) {
		System.out.println("creating new object of ac");
		AirConditioner ac = new AirConditioner();
		Water w = new Water();
		Air a = ac.blow(w);
	}

}
