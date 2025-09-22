package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class xyz {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/");
		Thread.sleep(2000);
		WebElement ele= driver.findElement(By.xpath("//div[contains(@class,\"x6s0dn4 xnz67gz x19gtwsn xhpglom x1xp9za0 x1fqc88y x1f\")]"
				+ "//span[text()=\"Phone number, username, or email\"]"));
		//ele.click();
		ele.sendKeys("naveen");
		driver.quit();
	}

}
