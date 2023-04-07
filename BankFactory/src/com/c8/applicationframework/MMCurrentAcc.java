package com.c8.applicationframework;

import com.c8.framework.CurrentAcc1;

public class MMCurrentAcc extends CurrentAcc1 {

	public MMCurrentAcc(int accNo, String accName, float accBal, float creditLimit) {
		super(accNo, accName, accBal, creditLimit);
		// TODO Auto-generated constructor stub
	}

	void withdraw(float accBal, float creditLimit) {
		System.out.println("Dear Customer, Your Current Account Balance is:" +accBal+ "And Your Credit limit is" +creditLimit);
		
	}

	@Override
	public String toString() {
		return "MMCurrentAcc [creditLimit=" + creditLimit + ", accNo=" + accNo + ", accName=" + accName + ", accBal="
				+ accBal + "]";
	}

	
}
