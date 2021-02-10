package com.humayun.testcases;

import org.testng.annotations.AfterSuite;

import com.humayun.base.Page;

public class BaseTest {
	@AfterSuite
	public void tearDown() {

		Page.quit();

	}

}
