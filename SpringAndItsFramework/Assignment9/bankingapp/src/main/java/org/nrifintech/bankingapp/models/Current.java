package org.nrifintech.bankingapp.models;

import org.nrifintech.bankingapp.interfaces.Account;
import org.springframework.stereotype.Component;

@Component("current")
public class Current implements Account{

	public void showAccount() {
		// TODO Auto-generated method stub
		System.out.println("CURRENT ACCOUNT");
	}

}
