package com.c8.main;

import com.c8.applicationframework.MMBankFactory;
import com.c8.framework.CurrentAcc1;
import com.c8.framework.SavingAcc;

public class BankFactoryMain {

	public static void main(String[] args) {
		
		MMBankFactory obj = new MMBankFactory();
	    obj.getNewSavingAccount(5025,"surya",44000, true);
		obj.getNewCurrentAccount(5057, "Ajay", 5500, 5000 );
		
		SavingAcc mmsaving =  new SavingAcc (5025,"surya",44000, true);
		mmsaving.withdraw();
		
		CurrentAcc1 mmcurrent =  new CurrentAcc1 (5057, "Ajay", 5500, 5000);
		mmcurrent.withdraw();
		
		mmsaving.toString();
		
		mmcurrent.toString();
		}
	
		
	}

	

