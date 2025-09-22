package com.actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class login {
	@FindBy(id="username")
	private WebElement untbx;

	@FindBy(name="pwd")
	private WebElement pwdbx;

	@FindBy(xpath ="//div[text()=\"Login \"]")
	private WebElement loginbx;

	public login(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void setlogin(String un, String pwd) {
		untbx.sendKeys(un);
		pwdbx.sendKeys(pwd);
		loginbx.click();
	}
}
 
