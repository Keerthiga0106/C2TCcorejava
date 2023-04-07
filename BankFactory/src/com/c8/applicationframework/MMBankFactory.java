package com.c8.applicationframework;

import com.c8.framework.BankFactory;
import com.c8.framework.CurrentAcc1;
import com.c8.framework.SavingAcc;

public class MMBankFactory implements BankFactory {

	@Override
	public SavingAcc getNewSavingAccount(int accNo, String accName, float accBal, boolean inSalary) {
		MMSavingAccc mmsaving= new MMSavingAccc (accNo, accName, accBal, inSalary);
		return mmsaving;
	}

	@Override
	public CurrentAcc1 getNewCurrentAccount(int accNo, String accName, float accBal, float creditLimit) {
		MMCurrentAcc mmcurrent = new MMCurrentAcc (accNo, accName, accBal, creditLimit);
		return mmcurrent;
	}


	
	
}
