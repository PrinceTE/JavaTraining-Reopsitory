package com.te.javabasics.banl;

public class Account {
double balance;
public Account(int balance) {
	this.balance=balance;
}
public void withdraw(int amount) throws AccountException {
	if(balance>=amount) {
		System.out.println(amount +" " +"withdrawn succesfully");
		balance=balance-amount;
	}else {
		throw new AccountException("Insuficient fund");
	}
}
}
