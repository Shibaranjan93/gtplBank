package com.gtplBank.testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.gtplBank.pageObjetcs.loginPage;

public class TC_Login_Test_001 extends baseClass{
	
	@Test
	public void loginTest() throws InterruptedException  {
		driver.get(url);
		Thread.sleep(3000);
		System.out.println("Opened URL");
		
		loginPage lp= new loginPage(driver);
		lp.setUserName(uname);
		Thread.sleep(3000);
		
		lp.setPassword(password);
		Thread.sleep(3000);
		
		lp.clickSubmit();
		Thread.sleep(3000);
		System.out.println("Login Passed");
		
		if(driver.getTitle().equals("Guru99 Bank Manager HomePage")) {
			Assert.assertTrue(true);
		}
		else {
			Assert.assertTrue(false);
		}
	}
	
	

}
