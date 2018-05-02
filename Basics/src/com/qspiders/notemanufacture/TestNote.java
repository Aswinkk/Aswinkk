package com.qspiders.notemanufacture;

public class TestNote {
	public static void main(String[] args) {
		Note n1 = new Note();
		n1.color = "blue";
		n1.value = 50;
		n1.lenght = 9;
		System.out.println(n1.value);
		System.out.println(n1.color);
		System.out.println(n1.lenght);
		Note n2 = new Note();
		n2.color = "green";
		n2.value = 100;
		n2.lenght = 11;
		System.out.println(n2.value);
		System.out.println(n2.color);
		System.out.println(n2.lenght);
	}

}
