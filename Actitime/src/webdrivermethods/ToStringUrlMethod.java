package webdrivermethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToStringUrlMethod {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.dassault-aviation.com/en/");
		Thread.sleep(2000);
		driver.navigate().to("https://www.dassault-aviation.com/en/space/");
		Thread.sleep(2000);
		driver.navigate().to("https://www.dassault-aviation.com/en/defense/");
		Thread.sleep(2000);
		driver.navigate().to("https://www.dassault-aviation.com/en/civil/");
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().forward();
		Thread.sleep(2000);
		driver.navigate().to("https://www.dassault-aviation.com/en/passion/");
		Thread.sleep(2000);
		driver.navigate().to("https://www.dassault-aviation.com/en/group/");
		Thread.sleep(2000);
		driver.navigate().refresh();

	}
}
