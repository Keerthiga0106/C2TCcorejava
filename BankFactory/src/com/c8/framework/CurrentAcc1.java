package com.c8.framework;

public class CurrentAcc1 extends BankAcc {
	
	public float creditLimit;

	public CurrentAcc1(int accNo, String accName, float accBal, float creditLimit) {
		super(accNo, accName, accBal);
		this.creditLimit = creditLimit;
	}
	  
	public void withdraw() {
		System.out.println("Dear Customer, Your Current Account Balance is:" +accBal+ "And Your Credit limit is" +creditLimit);
		
		
	}

	@Override
	public String toString() {
		return "CurrentAcc1 [creditLimit=" + creditLimit + ", accNo=" + accNo + ", accName=" + accName + ", accBal="
				+ accBal + "]";
	}
}
	
	
	

	
	
  
	