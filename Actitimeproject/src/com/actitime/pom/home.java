package com.actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class home {
	  public void homepage() {
	    	
	    }
		@FindBy(linkText = "REPORTS")
		private WebElement reportbt;

		@FindBy(xpath = "//a[text()='Logout']")
		private WebElement logout;

		public home(WebDriver driver) {
			PageFactory.initElements(driver, this);
		}

		public void sethomepag() {
			reportbt.click();
		}
		public  void setlog() {
			logout.click();
		}

	}



