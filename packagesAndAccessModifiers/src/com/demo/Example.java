package com.demo;

public class Example {

	public void hello() {
		System.out.println("hello");

		display();
	}

	private void display() {
		for (int i = 0; i < 3; i++) {
			System.out.println(i);
		}
	}

	protected void welcome() {
		System.out.println("welcome");
		display();
	}

	void bird() {
		System.out.println("bird");
	}
}
