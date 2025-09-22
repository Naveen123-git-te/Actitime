package automation;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class autoSuggGoogle {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		//driver.manage().timeouts().implicitlyWait(Duration.se);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		driver.findElement(By.xpath("//textarea[@class=\"gLFyf\"]")).sendKeys("java");
	
		List<WebElement> eles=driver.findElements(By.xpath("//div[@class=\"wM6W7d\"]"));

		int count=eles.size();
		System.out.println(count);
		for(WebElement sele:eles) {
			String links=sele.getText();
			System.out.println(links);
		}
		List<WebElement> eles2=driver.findElements(By.xpath("//div[@class='wM6W7d']/span[text()='java']"
				
));
		
		int count1=eles2.size();
		System.out.println(count1);
		for(WebElement sele1:eles2) {
			String links1=sele1.getText();
			System.out.println(links1);
		}
	}

}
