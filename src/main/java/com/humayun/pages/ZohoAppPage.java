package com.humayun.pages;

import org.openqa.selenium.By;

import com.humayun.base.Page;
import com.humayun.pages.crm.CRMHomePage;

public class ZohoAppPage extends Page {


	public CRMHomePage goToCRM() {

		click("CRMlink_XPATH");

		return new CRMHomePage();
	}

	public void goToBooks() {

		driver.findElement(By.xpath("//body/div[2]/div[1]/div[1]/div[1]/div[1]/a[1]/span[1]")).click();

	}

	public void goToCalendar() {
		
		driver.findElement(By.xpath("//body/div[2]/div[1]/div[1]/div[2]/div[1]/a[1]/span[1]")).click();
		
	}
	
}
