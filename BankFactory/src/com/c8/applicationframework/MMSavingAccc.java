package com.c8.applicationframework;

import com.c8.framework.SavingAcc;

public class MMSavingAccc extends SavingAcc{

	public MMSavingAccc(int accNo, String accName, float accBal, boolean inSalary) {
		super(accNo, accName, accBal, inSalary);
		// TODO Auto-generated constructor stub
	}
	
	



	void withdraw(float accBal) {
		
		System.out.println("Hello customer, You saving account Balance is: " +accBal);
		
	}


	@Override
	public String toString() {
		return "MMSavingAccc [inSalary=" + inSalary + ", accNo=" + accNo + ", accName=" + accName + ", accBal=" + accBal
				+ "]";
	}
	

	

}
