package com.levis.jeanmanufacture;

public class Apparel {
	String type;
	String color;
	char size;

	
	Apparel(String type, String color, char size) {
		this.type = type;
		this.color = color;
		this.size = size;


	}
	

	Apparel(String type, char size) {
		this.type = type;
		this.size = size;
		this.color= "Black"; // if the customer gives two input and color is constant
	}


	void showDetails() {
		System.out.println(this.type + " " + this.color + " " + this.size);

	}

	public static void main(String[] args) {
		Apparel a = new Apparel("jean", "Blue", 'l');
		a.showDetails();
		Apparel a2 = new Apparel("shirt", "red", 'm');
		a2.showDetails();
		Apparel a3 = new Apparel("shirt", 'L');
		a3.showDetails();

	}

}
