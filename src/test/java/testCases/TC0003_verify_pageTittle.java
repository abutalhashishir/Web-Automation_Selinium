package testCases;

import java.time.Duration;

import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import base.driverSetup;

public class TC0003_verify_pageTittle extends driverSetup{
	
	public static String baseUrl="https://rahulshettyacademy.com/locatorspractice/";
	
	
	@Test(priority=1)
	public void verifyPageTitle_shouldPass() {
		driver.get(baseUrl);
		new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		String foundTitleFromWebsiteString=driver.getTitle();
		System.out.println("The Title of the site is: "+ foundTitleFromWebsiteString);
		SoftAssert softly = new SoftAssert();
		softly.assertEquals(foundTitleFromWebsiteString, "Rahul Shetty Academy - Login page");
		
		softly.assertAll();
		
		
	}
	@Test(priority=2)
	public static void isWebsiteSecured() {
		String y=driver.getCurrentUrl();
		if (y.contains("https")) {
			System.out.println("Site is Secured");
		}
		else {
			System.out.println("Site is not Sequred");
		}
		
		
	}
}
