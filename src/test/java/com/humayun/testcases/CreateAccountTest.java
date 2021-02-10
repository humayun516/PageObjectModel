package com.humayun.testcases;

import java.util.Hashtable;

import org.testng.annotations.Test;

import com.humayun.base.Page;
import com.humayun.pages.ZohoAppPage;
import com.humayun.pages.crm.accounts.AccountsPage;
import com.humayun.pages.crm.accounts.CreateAccountPage;
import com.humayun.utilities.Utilities;

public class CreateAccountTest {

	@Test(dataProviderClass = Utilities.class, dataProvider = "dp")
	public void createAccountTest(Hashtable<String, String> data) {

		ZohoAppPage Zp = new ZohoAppPage();
		Zp.goToCRM();
		AccountsPage ap = Page.menu.goToAccounts();
		CreateAccountPage cap = ap.goToCreateAccount();
		cap.createAccount(data.get("AccountName"));

	}

}
