package com.te.javabasics.abstraction;

public class Benz implements Car {

	@Override
	public void start() {
		System.out.println("Benz is started");
	}

	@Override
	public void accelerate() {
		System.out.println("Benz is accelerated");
	}

	@Override
	public void brake() {
		System.out.println("Benz is stopped");
	}

}
