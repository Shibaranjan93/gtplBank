package com.gtplBank.pageObjetcs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginPage {
	WebDriver ldriver;
	public loginPage(WebDriver rdriver) {
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	@FindBy(name="uid")
	WebElement textUserName;
	
	@FindBy(name="password")
	WebElement textPassword;	
	
	@FindBy(name="btnLogin")
	WebElement btnlogin;
	
	public void setUserName(String uname) {
		textUserName.sendKeys(uname);
	}
	public void setPassword(String password) {
		textPassword.sendKeys(password);
	}
	public void clickSubmit() {
		btnlogin.click();
	}
}
