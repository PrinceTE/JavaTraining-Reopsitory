package com.te.javabasics.banl;

import java.util.Scanner;

public class AccountTest {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter Amount to withdraw");
		int ammout=scanner.nextInt();
		Account account=new Account(20000);
		try {
			account.withdraw(ammout);
			account.withdraw(ammout);
			account.withdraw(ammout);
		} catch (Exception e) {

			System.out.println(e.getMessage());
		}
	}
}
