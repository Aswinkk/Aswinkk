package com.camlin.markerapp;

public class TestMarker {
	public static void main(String[] args) {
		Marker m1 = new Marker();
		System.out.println(m1);
		System.out.println(m1.color + " " + m1.brand + " " + m1.price);
		m1.color = "Black";
		System.out.println(m1.color + " " + m1.brand + " " + m1.price);

		Marker m2 = new Marker();
		System.out.println(m2);
		m2.showDetails(); // calling the print statement
		m2.color = "red";
		m2.showDetails();

	}

}
