package com.gtplBank.testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import com.gtplBank.utilities.readConfig;


public class baseClass {
	
	static readConfig readconfig= new readConfig();
	
	public static String url= readconfig.getURL();
	public static String uname=readconfig.getUserName();
	public static String password=readconfig.password();
	public static WebDriver driver;
	//public static Logger logger;
	
	@BeforeClass
	public void setUp(){
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		
	//Logger logger= Logger.getLogger("gtplBank");
	//PropertyConfigurator.configure("log4j.properties");
	
		
	}
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	

}
