package webdrivermethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfGetMethod {
	public static void main(String[] args) {
		// ChromeDriver driver = new ChromeDriver();
		WebDriver driver = new ChromeDriver();
		// org.openqa.selenium.InvalidArgumentException
		driver.get("https://www.flipkart.com/");
		
	}
}
