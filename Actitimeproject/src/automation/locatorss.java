package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class locatorss {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/navee/Downloads/mynew12.html");
		WebElement ele= driver.findElement(By.tagName("a"));
		ele.click();
		driver.navigate().back();
		WebElement ele1=driver.findElement(By.id("d2"));
		ele1.click();
		driver.navigate().back();
		WebElement ele3=driver.findElement(By.name("n1"));
		ele3.click();
		driver.navigate().back();
		driver.findElement(By.className("c2")).click();
		driver.quit();
		

	}

}
