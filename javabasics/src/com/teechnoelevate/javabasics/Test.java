package com.teechnoelevate.javabasics;

public class Test {
	static {
		System.out.println("static");
	}
	
	public Test() {
		System.out.println("Inside constructor");
	}
	{
		System.out.println("non-static");
	}

	public static void main(String[] args) {
		Test test=new Test();

	}
	

}
