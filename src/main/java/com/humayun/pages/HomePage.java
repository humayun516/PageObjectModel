package com.humayun.pages;

import org.openqa.selenium.By;

import com.humayun.base.Page;

public class HomePage extends Page {

	public void goToCustomers() {

		driver.findElement(By.xpath("//a[@class='zh-customers']")).click();
	}

	public void goToSupport() {

		driver.findElement(By.xpath("//a[@class='zh-support']")).click();
	}

	public void goToContactSales() {

		driver.findElement(By.xpath("//a[@class='zh-contact']")).click();
	}

	public void goToEvents() {

		driver.findElement(By.xpath("//a[@class='zh-events']")).click();
	}

	public SigninPage goToSignIn() {

		click("HomePage_XPATH");

		return new SigninPage();
	}

	public void goToFreeSignUp() {

		driver.findElement(By.xpath("//a[@class='zh-signup']")).click();
	}

	public void validateFooterLinks() {

	}
}
