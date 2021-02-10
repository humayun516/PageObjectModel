package com.humayun.testcases;

import java.util.Hashtable;

import org.testng.annotations.Test;

import com.humayun.pages.HomePage;
import com.humayun.pages.SigninPage;
import com.humayun.utilities.Utilities;

public class LoginTest extends BaseTest {

	@Test(dataProviderClass = Utilities.class , dataProvider = "dp") 
	public void LoginTest(Hashtable<String, String> data) {

		HomePage home = new HomePage();
		SigninPage sip = home.goToSignIn();
		sip.doSignIn(data.get("username"), data.get("password"));

	}

}
