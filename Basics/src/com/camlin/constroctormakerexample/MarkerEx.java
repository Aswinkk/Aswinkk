package com.camlin.constroctormakerexample;

public class MarkerEx {
	String color;
	int price = 50;
	String brand = "Camlin";

	MarkerEx(String color) {
		this.color = color;

	}
 public static void main(String[] args) {
	MarkerEx m1 = new MarkerEx("Black");
	System.out.println(m1.color+" "+m1.price+" "+m1.brand);
			
}
}
