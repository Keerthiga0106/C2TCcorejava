package com.c8.framework;

public class SavingAcc extends BankAcc {
	
	public boolean inSalary;

	public SavingAcc(int accNo, String accName, float accBal, boolean inSalary) {
		super(accNo, accName, accBal);
		this.inSalary = inSalary;
	}
	

	


	public void withdraw() {
		System.out.println("Hello customer, You saving account Balance is: " +accBal);
		
		
	}

	@Override
	public String toString() {
		return "SavingAcc [inSalary=" + inSalary + ", accNo=" + accNo + ", accName=" + accName + ", accBal=" + accBal
				+ "]";
	}

	
	
	
}
