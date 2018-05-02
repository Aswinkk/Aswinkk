package com.amazon.paymentapp;

public class TestAmazon {
	public static void main(String[] args) {
		System.out.println("Opening the amazone website");
		Amazon a = new Amazon();
		System.out.println("we have the debitcard");
		DebitCard d = new DebitCard();
		Product pro = a.pay(d);
		System.out.println(pro);
		System.out.println("recieved the product");

	}

}
