package com.humayun.pages.crm.accounts;

import com.humayun.base.Page;

public class CreateAccountPage extends Page {

	public void createAccount(String AccountName) {
		
		type("AccountName_XPATH", AccountName);
		
	}
	
}
