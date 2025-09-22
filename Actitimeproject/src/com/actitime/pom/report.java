package com.actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class report {
	@FindBy(xpath ="//span[text()=\"New Report\"]" )
	private WebElement newreportbtn;
	@FindBy(xpath ="//span[text()=\"Staff Performance\"]" )
	private WebElement staffperform;
	@FindBy(id = "configureReportParametersButton")
	private WebElement configurereparabtn;

	@FindBy(xpath ="//span[text()='Current month']")
	private WebElement daterange ;
	@FindBy(xpath ="//div[text()='Current month']")
	private WebElement currentmonth ;

	@FindBy( className = "x-btn-center")
	private WebElement datagrouping;
	@FindBy(linkText ="Projects")
	private WebElement project;
	@FindBy(xpath ="//button[text()='Do not use 2nd grouping level']")
	private WebElement grouplevel;
	@FindBy(linkText = "Customers")
	private WebElement customer;
	@FindBy(xpath = "//button[text()='-- Hide details --']")
	private WebElement level3 ;
	@FindBy(linkText ="Tasks" )
	private WebElement task;

	@FindBy(xpath ="//span[text()='All Staff']" )
	private WebElement selectedstaff;
	@FindBy(xpath ="//label[text()='All Staff']")
	private WebElement allstaff;
	@FindBy(xpath ="//label[text()='Include users without reported time']")
	private WebElement tikbox;
	@FindBy(xpath ="//span[text()='Close']")
	private WebElement closebtn1 ;

	@FindBy(xpath ="//span[text()='All projects of all customers (active and archived)']" )
	private WebElement customerproject ;
	@FindBy(xpath = "//label[text()='All active projects of all active customers']")
	private WebElement activproject ;
	@FindBy(id = "ext-gen548")
	private WebElement closebtn2 ;

	@FindBy(xpath ="//button[text()=\"Show users in alphabetical order\"]" )
	private WebElement reportcolum;
	@FindBy(linkText ="Show time zone groups only" )
	private WebElement showtimezon ;

	@FindBy(linkText = "HH:MM")
	private WebElement timeformt1 ;
	@FindBy(linkText = "HH:MM")
	private WebElement timeformt2;

	@FindBy(id = "showLeavesCheckbox")
	private WebElement leavetimchekbox;
	@FindBy(xpath = "(//span[text()='Generate HTML Report'])[2]")
	private WebElement generatereport;
	
	public report(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	

	public WebElement getNewreportbtn() {
		return newreportbtn;
	}
	public WebElement getStaffperform() {
		return staffperform;
	}
	public WebElement getConfigurereparabtn() {
		return configurereparabtn;
	}
	public WebElement getDaterange() {
		return daterange;
	}
	public WebElement getCurrentmonth() {
		return currentmonth;
	}
	public WebElement getDatagrouping() {
		return datagrouping;
	}
	public WebElement getProject() {
		return project;
	}
	public WebElement getGrouplevel() {
		return grouplevel;
	}
	public WebElement getCustomer() {
		return customer;
	}
	public WebElement getLevel3() {
		return level3;
	}
	public WebElement getTask() {
		return task;
	}
	public WebElement getSelectedstaff() {
		return selectedstaff;
	}
	public WebElement getAllstaff() {
		return allstaff;
	}
	public WebElement getTikbox() {
		return tikbox;
	}
	public WebElement getClosebtn1() {
		return closebtn1;
	}
	public WebElement getCustomerproject() {
		return customerproject;
	}
	public WebElement getActivproject() {
		return activproject;
	}
	public WebElement getClosebtn2() {
		return closebtn2;
	}
	public WebElement getReportcolum() {
		return reportcolum;
	}
	public WebElement getShowtimezon() {
		return showtimezon;
	}
	public WebElement getTimeformt1() {
		return timeformt1;
	}
	public WebElement getTimeformt2() {
		return timeformt2;
	}
	public WebElement getLeavetimchekbox() {
		return leavetimchekbox;
	}
	public WebElement getGeneratereport() {
		return generatereport;
	}}


//	driver.findElement(By.linkText("REPORTS")).click();
//	driver.findElement(By.xpath("//span[text()=\"New Report\"]")).click();Thread.sleep(2000);
//	driver.findElement(By.xpath("//span[text()=\"Staff Performance\"]")).click();
//	driver.findElement(By.id("configureReportParametersButton")).click();Thread.sleep(2000);
//
//	driver.findElement(By.xpath("//span[text()=\"Current month\"]")).click();Thread.sleep(2000);
//	driver.findElement(By.xpath("//div[text()='Current month']")).click();Thread.sleep(2000);
//	System.out.println("---");
//
//	driver.findElement(By.className("x-btn-center")).click();Thread.sleep(2000);
//	driver.findElement(By.linkText("Projects")).click();Thread.sleep(2000);
//	driver.findElement(By.xpath("//button[text()='Do not use 2nd grouping level']")).click();Thread.sleep(2000);
//	driver.findElement(By.linkText("Customers")).click();Thread.sleep(2000);
//	driver.findElement(By.xpath("//button[text()='-- Hide details --']")).click();Thread.sleep(2000);
//	driver.findElement(By.linkText("Tasks")).click();
//
//	Thread.sleep(2000);
//	driver.findElement(By.xpath("//span[text()='All Staff']")).click();Thread.sleep(2000);
//	driver.findElement(By.xpath("//label[text()='All Staff']")).click();Thread.sleep(2000);
//	driver.findElement(By.xpath("//label[text()='Include users without reported time']")).click();Thread.sleep(2000);
//	driver.findElement(By.xpath("//span[text()='Close']")).click();
//
//	Thread.sleep(2000);
//	driver.findElement(By.xpath("//span[text()='All projects of all customers (active and archived)']")).click();
//	Thread.sleep(2000);
//	driver.findElement(By.xpath("//label[text()='All active projects of all active customers']")).click();
//	Thread.sleep(2000);
//	driver.findElement(By.id("ext-gen548")).click();
//	//driver.findElement(By.xpath("(//span[text()='All projects of all customers (active and archived)']/following::span[text()='Close'])[2]\r\n"
//	//+ "")).click();
//
//	Thread.sleep(2000);
//	driver.findElement(By.xpath("//button[text()=\"Show users in alphabetical order\"]")).click();
//	Thread.sleep(2000);
//	driver.findElement(By.linkText("Show time zone groups only")).click();
//
//	Thread.sleep(2000);
//	driver.findElement(By.linkText("HH:MM")).click();
//	Thread.sleep(2000);
//	driver.findElement(By.linkText("HH:MM")).click();
//
//	Thread.sleep(2000);
//	driver.findElement(By.id("showLeavesCheckbox")).click();
//	Thread.sleep(2000);
//	driver.findElement(By.xpath("(//span[text()='Generate HTML Report'])[2]")).click();
//	Thread.sleep(2000);	



