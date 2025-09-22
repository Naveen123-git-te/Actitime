package automation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class flipcartLinks {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		List<WebElement> eles=driver.findElements(By.tagName("a"));
		int count=eles.size();
		System.out.println(count);
		
		for(WebElement sele:eles) {
			String links=sele.getAttribute("href");
			System.out.println(links);
			
		}
		
		
	}

}
