package Autosuggestion;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alllink2 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.navigate().refresh();
		Thread.sleep(2000);
		List<WebElement> ele = driver.findElements(By.xpath("//a[@href]"));
	    int count=ele.size();
		System.out.println(count);
		for(int i=0;i<count;i++)
		{
			WebElement e1 = ele.get(i);
			System.out.println(e1);
		}
		driver.quit();
	}

}
