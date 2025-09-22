package com.actitime.testscript;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.actitime.generic.baseclass;
import com.actitime.pom.home;
import com.actitime.pom.report;


@Listeners(com.actitime.generic.listenerimplementation.class)

public class testscript extends baseclass {
	@Test
	public void createreport() throws InterruptedException {
		home hh=new home(driver);
		hh.sethomepag();Thread.sleep(2000);

		report rr=new report(driver);
		Thread.sleep(2000);
		rr.getNewreportbtn().click();
		Thread.sleep(2000);
        rr.getStaffperform().click(); 
        Thread.sleep(2000);
		rr. getConfigurereparabtn().click(); 
		Thread.sleep(2000);
		rr.getDaterange().click(); 
		Thread.sleep(2000);
		rr.getCurrentmonth().click();
		Thread.sleep(2000);
		rr.getDatagrouping().click();Thread.sleep(2000);
		rr.getProject().click();Thread.sleep(2000);
		rr.getGrouplevel().click();Thread.sleep(2000); 
		rr.getCustomer().click();Thread.sleep(2000);
		rr.getLevel3().click();Thread.sleep(2000);
		
		rr.getTask().click(); Thread.sleep(2000);
		rr.getSelectedstaff().click(); Thread.sleep(2000);
		rr.getAllstaff().click(); Thread.sleep(2000);
		rr. getTikbox().click();  Thread.sleep(2000);
		rr.getClosebtn1().click(); Thread.sleep(2000);
		rr.getCustomerproject().click();  Thread.sleep(2000);
		rr.getActivproject().click();   Thread.sleep(2000);
		rr.getClosebtn2().click();   Thread.sleep(2000);
		rr.getReportcolum().click();  Thread.sleep(2000);
		rr.getShowtimezon().click();  Thread.sleep(2000);

		rr.getTimeformt1().click();Thread.sleep(2000);
		rr.getTimeformt2().click();  Thread.sleep(2000);
		rr.getLeavetimchekbox().click(); Thread.sleep(2000);
		rr.getGeneratereport() .click(); Thread.sleep(2000);



		//driver.findElement(By.linkText("REPORTS")).click();
		//		driver.findElement(By.xpath("//span[text()=\"New Report\"]")).click();Thread.sleep(2000);
		//		driver.findElement(By.xpath("//span[text()=\"Staff Performance\"]")).click();
		//
		//		driver.findElement(By.id("configureReportParametersButton")).click();Thread.sleep(2000);
		//
		//		driver.findElement(By.xpath("//span[text()=\"Current month\"]")).click();Thread.sleep(2000);
		//
		//		driver.findElement(By.xpath("//div[text()='Current month']")).click();Thread.sleep(2000);
		//		System.out.println("---");
		//		driver.findElement(By.className("x-btn-center")).click();Thread.sleep(2000);
		//		driver.findElement(By.linkText("Projects")).click();Thread.sleep(2000);
		//		driver.findElement(By.xpath("//button[text()='Do not use 2nd grouping level']")).click();Thread.sleep(2000);
		//		driver.findElement(By.linkText("Customers")).click();Thread.sleep(2000);
		//		driver.findElement(By.xpath("//button[text()='-- Hide details --']")).click();Thread.sleep(2000);
		//		driver.findElement(By.linkText("Tasks")).click();
		//
		//		Thread.sleep(2000);
		//		driver.findElement(By.xpath("//span[text()='All Staff']")).click();Thread.sleep(2000);
		//		driver.findElement(By.xpath("//label[text()='All Staff']")).click();Thread.sleep(2000);
		//		driver.findElement(By.xpath("//label[text()='Include users without reported time']")).click();Thread.sleep(2000);
		//		driver.findElement(By.xpath("//span[text()='Close']")).click();
		//
		//		Thread.sleep(2000);
		//		driver.findElement(By.xpath("//span[text()='All projects of all customers (active and archived)']")).click();
		//		Thread.sleep(2000);
		//		driver.findElement(By.xpath("//label[text()='All active projects of all active customers']")).click();
		//		Thread.sleep(2000);
		//		driver.findElement(By.id("ext-gen548")).click();
		//		//driver.findElement(By.xpath("(//span[text()='All projects of all customers (active and archived)']/following::span[text()='Close'])[2]\r\n"
		//		//+ "")).click();
		//
		//		Thread.sleep(2000);
		//		driver.findElement(By.xpath("//button[text()=\"Show users in alphabetical order\"]")).click();
		//		Thread.sleep(2000);
		//		driver.findElement(By.linkText("Show time zone groups only")).click();
		//
		//		Thread.sleep(2000);
		//		driver.findElement(By.linkText("HH:MM")).click();
		//		Thread.sleep(2000);
		//		driver.findElement(By.linkText("HH:MM")).click();
		//
		//		Thread.sleep(2000);
		//		driver.findElement(By.id("showLeavesCheckbox")).click();
		//		Thread.sleep(2000);
		//		driver.findElement(By.xpath("(//span[text()='Generate HTML Report'])[2]")).click();
		//		Thread.sleep(2000);	


	}
}
