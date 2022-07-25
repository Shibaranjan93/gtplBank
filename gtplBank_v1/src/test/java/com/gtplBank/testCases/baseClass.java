package com.gtplBank.testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

public class baseClass {
	public static String url="https://demo.guru99.com/v4/";
	public static String uname="mngr26593";
	public static String password="1299guru@";
	public static WebDriver driver;
	
	@BeforeClass
	public void setUp() {
		driver= new ChromeDriver();
	}
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	

}
