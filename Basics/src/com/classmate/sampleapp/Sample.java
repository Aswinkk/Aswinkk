package com.classmate.sampleapp;

public class Sample {
	void show() {
		disp();
		System.out.println("show method");

	}

	void disp() {

		System.out.println("display method");
	}

	public static void main(String[] args) {
		Sample s = new Sample();
		s.show();
	}

}
