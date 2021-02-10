package com.humayun.pages;

import com.humayun.base.Page;

public class SigninPage extends Page {

	

	public ZohoAppPage doSignIn(String username, String password) {

		type("EmailAddress_XPATH",username);
		click("NextBtn_XPATH");
		type("Password_XPATH",password);
		click("SignInBtn_XPATH");
	
		return new ZohoAppPage();
	
	}

}
