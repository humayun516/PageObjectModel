package com.humayun.rough;

import com.humayun.base.Page;
import com.humayun.pages.HomePage;
import com.humayun.pages.SigninPage;
import com.humayun.pages.ZohoAppPage;
import com.humayun.pages.crm.accounts.AccountsPage;
import com.humayun.pages.crm.accounts.CreateAccountPage;

public class LoginTest {

	public static void main(String[] args) {

		
		
		HomePage home = new HomePage();
		SigninPage sip = home.goToSignIn();
		ZohoAppPage Zp = sip.doSignIn("way2automation.com", "123456");
		Zp.goToCRM();
		AccountsPage ap = Page.menu.goToAccounts();
		CreateAccountPage cap =  ap.goToCreateAccount();
		cap.createAccount("Humayun");
 	}

}
