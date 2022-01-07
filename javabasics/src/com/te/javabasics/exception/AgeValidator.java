package com.te.javabasics.exception;

import java.util.Scanner;

public class AgeValidator {

	public void vote() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your age");
		int age = scanner.nextInt();

		if (age >= 18) {
			System.out.println("Eligible to vote");
		} else {
			throw new AgeValidatorException("Not eligible to vote");
		}

	}
}
