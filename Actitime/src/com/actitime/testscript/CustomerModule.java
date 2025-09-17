package com.actitime.testscript;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.actitime.generic.BaseClass;
import com.actitime.pom.HomePage;
import com.actitime.pom.TaskListPage;
@Listeners(com.actitime.generic.ListenerImplementation.class)
public class CustomerModule extends BaseClass{
	@Test
public void createCustomer() throws InterruptedException, EncryptedDocumentException, IOException {Thread.sleep(2000);
		HomePage h=new HomePage(driver);
		String custName = f.readExcelData("createCustomer", 1, 1);
		String custDesc = f.readExcelData("createCustomer", 1, 2);
		h.setTasks();
		//check task page is displayed or not
		TaskListPage t=new TaskListPage(driver);Thread.sleep(2000);
		t.getAddNewBtn().click();Thread.sleep(2000);
		t.getNewCustBtn().click();Thread.sleep(2000);
		//check popup is displayed or not
		t.getCustNameTbx().sendKeys(custName);Thread.sleep(2000);
		t.getCustDescTbx().sendKeys(custDesc);Thread.sleep(2000);
		t.getCustDropdown().click();Thread.sleep(2000);
		t.getOurCompLink().click();Thread.sleep(2000);
		t.getCreateCustBtn().click();Thread.sleep(2000);
		String msg = t.getVeificationMsgPopup().getText();Thread.sleep(2000);
		Assert.assertEquals(msg, "Customer '"+custName+"' has been created");
	}
}
