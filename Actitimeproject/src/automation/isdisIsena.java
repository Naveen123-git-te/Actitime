package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class isdisIsena {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		
			
		
		boolean ele= driver.findElement(By.xpath("//button[@name=\"login\"]")).isDisplayed();
		boolean ele1= driver.findElement(By.xpath("//button[@name=\"login\"]")).isEnabled();
		boolean ele2=driver.findElement(By.xpath("//button[@name=\"login\"]")).isSelected();
		System.out.println(ele);
		System.out.println(ele1);
		System.out.println(ele2);
		
				//ele.sendKeys("naveen");

	}

}
