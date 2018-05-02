package com.nexa.catapp;

public class TestCat {
	public static void main(String[] args) {
		Cat c = new Cat();
		Fish f = new Fish();
		c.eat(f);
		Cheese ch = new Cheese();
		Rat r = new Rat();
		c.eat(ch);
		c.eat(r);
	}
}
