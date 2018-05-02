package com.qspiders.calculatorapp;

public class GSTCaclulator {
	void calculateGST(double rupees) {
		double gst = rupees*0.18;
		double totalPrice = rupees + gst;
		System.out.println("Base price of the product is" + rupees+ "Rupees");
		System.out.println("GST for product is"+ gst + "Rupees");
		System.out.println("Total price of the product is"+ totalPrice+ "Rupees");
				
	}

}
