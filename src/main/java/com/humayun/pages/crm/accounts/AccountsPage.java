package com.humayun.pages.crm.accounts;

import com.humayun.base.Page;

public class AccountsPage extends Page {

	public CreateAccountPage goToCreateAccount() {

		click("CreateAccountBtn_XPATH");

		return new CreateAccountPage();
	}

	public void goToImportAccounts() {

	}

}
