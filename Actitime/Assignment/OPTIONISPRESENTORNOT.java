package HANDLINGDROPDOWN;

import java.time.Duration;
import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class OPTIONISPRESENTORNOT {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the option");
		String value=sc.next();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
		driver.get("https://demoapps.qspiders.com/");
		driver.findElement(By.xpath("//p[text()='Experience the seamless interactions and responsive designs']")).click();
		driver.findElement(By.xpath("//section[text()='Dropdown']")).click();
		driver.findElement(By.linkText("Multi Select")).click();
		WebElement options = driver.findElement(By.id("select-multiple-native"));
		Select s= new Select(options);
		List<WebElement> sugg = s.getOptions();
		int count1 = 0;
		int count = sugg.size();
		for(int i=0;i<count;i++)
		{
			WebElement ele1 = sugg.get(i);
			 String text = ele1.getText();
			 if(text.equals(value)) {
				 count1++;
			 }
			
			 }
		
		if(count1>0)
		System.out.println("element is present");
		
		
		else {
			System.out.println("element is not present");
		}
		
		
			
		
		
		}
		
		
	}

