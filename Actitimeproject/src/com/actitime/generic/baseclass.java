package com.actitime.generic;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import com.actitime.pom.home;
import com.actitime.pom.login;



public class baseclass {
	filelib f=new filelib();
	public static WebDriver driver;
 @BeforeTest
 public void openbrowser() throws IOException {
	    driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		String url=f.readPropertyData("url");
		driver.get(url);	 
 }
 @BeforeMethod
 public void login1() throws InterruptedException, IOException {
	 login l=new login(driver);
	 String un=f.readPropertyData("un");
	 String pwd=f.readPropertyData("pwd");
	 l.setlogin(un, pwd);
	 
//	    driver.findElement(By.id("username")).sendKeys("admin");
//		driver.findElement(By.name("pwd")).sendKeys("manager");
//		driver.findElement(By.xpath("//div[text()=\"Login \"]")).click();Thread.sleep(2000);
	 
 }
 @AfterMethod
 public void logout() {
	 home h=new home(driver);
	 h.setlog();
	// driver.findElement(By.id("logoutLink")).click();
	 
 }
 @AfterTest
 public void closebrowser() {
	 driver.quit();
 }
}


