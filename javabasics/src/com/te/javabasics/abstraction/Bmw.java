package com.te.javabasics.abstraction;

public class Bmw implements Car {

	@Override
	public void start() {
		System.out.println("BMW is started");
	}

	@Override
	public void accelerate() {
		System.out.println("BMW is accelerated");

	}

	@Override
	public void brake() {
		System.out.println("BMW is stopped");
	}

}
