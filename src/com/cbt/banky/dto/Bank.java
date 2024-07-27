package com.cbt.banky.dto;


public interface Bank {
	public void deposit(int balance,AccountHolder accountHolder);
	public double withdraw(int balance,AccountHolder accountHolder);
	public double checkBalance(String password,AccountHolder accountHolder);
}