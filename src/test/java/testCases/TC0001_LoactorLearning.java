package testCases;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import base.driverSetup;

public class TC0001_LoactorLearning extends driverSetup{
	
	@Test
	public void locatorLearning() throws InterruptedException{
		String baseUrl="https://rahulshettyacademy.com/locatorspractice/";
		
	driver.get(baseUrl);
	driver.manage().window().maximize();
	
	Thread.sleep(2000);
	
	driver.findElement(By.id("inputUsername")).sendKeys("Shishir");
	Thread.sleep(2000);
	
	driver.findElement(By.name("inputPassword")).sendKeys("ahishir123");
	driver.findElement(By.className("signInBtn")).click();
	Thread.sleep(2000);
	
	String errorMessage=driver.findElement(By.cssSelector("p.error")).getText();
	//FORMULA:   targetname.value (if class name is given)
	//           targetname#value (if id is given)
	
	System.out.println(errorMessage);
	
	driver.findElement(By.linkText("Forgot your password?")).click();
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("//input[@type='text']")).sendKeys("rifat khan");
	//tagname[@atrribute='value']
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("//input[@type='text'][2]")).sendKeys("rifatkhan@gmail.com");
	//tagname[@atrribute='value']
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@type='text'][3]")).sendKeys("01645411352");
	//tagname[@atrribute='value']
	Thread.sleep(2000);
	
	driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("//div[@class='forgot-pwd-btn-conainer']/button[1]")).click();
	Thread.sleep(2000);
	
	driver.findElement(By.cssSelector("#inputUsername")).sendKeys("Tanvir");
	driver.findElement(By.cssSelector("input[type*='pass']")).sendKeys("rahulshettyacademy");
	
	driver.findElement(By.id("chkboxOne")).click();
	
	driver.findElement(By.xpath("//button[contains(@class,'submit')]")).click();
	Thread.sleep(2000);
	
	}
	
	

}
