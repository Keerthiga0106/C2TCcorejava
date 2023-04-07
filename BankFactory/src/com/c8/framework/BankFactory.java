package com.c8.framework;

public interface BankFactory {
	
	public SavingAcc getNewSavingAccount(int accNo, String accName, float accBal, boolean inSalary);
	
	public CurrentAcc1 getNewCurrentAccount(int accNo, String accName, float accBal, float creditLimit);
	

}
