package com.benz.carmanufacturer;

public class TestCar {
	public static void main(String[] args) {
		System.out.println("Creating car object");
		Car c = new Car();
				System.out.println("Creating petrol object");
				Petrol p= new Petrol ();
				System.out.println("filling the car with petrol");
				Smoke s = c.fill(p);
				System.out.println("recieved smoke");
	}

}
