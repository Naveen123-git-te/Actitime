package automation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class explicitWait {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		
			driver.manage().window().maximize();
			driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		//	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
			WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name=\"username\"]"))).sendKeys("Admin");
		//	driver.findElement(By.xpath("//input[@name=\"username\"]")).sendKeys("Admin");
			wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@name=\"password\"]"))).sendKeys("admin123");
		//	driver.findElement(By.xpath("//input[@name=\"password\"]")).sendKeys("admin123");
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@type=\"submit\"]"))).click();
			//driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
			
			Boolean url=wait.until(ExpectedConditions.urlMatches(driver.getCurrentUrl()));
		
			System.out.println(url);
			System.out.println(driver.getCurrentUrl());
			
	}
//input[@name="password"]
}
//input[@name="username"]//button[@type="submit"]