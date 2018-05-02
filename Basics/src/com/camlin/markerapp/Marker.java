package com.camlin.markerapp;

public class Marker {
	String color;
	int price = 50;
	String brand = "Camlin";
	void showDetails() {
		System.out.println(color+" "+ brand +" "+ price);// method to call print statement instead of writing it again and again 
	}

}
