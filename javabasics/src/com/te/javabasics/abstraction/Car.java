package com.te.javabasics.abstraction;

public interface Car {

	public abstract void start();
	
	public abstract void accelerate();
	
	public abstract void brake();
	
	default void gps() {
		System.out.println("gps is runnig");
	}
}
