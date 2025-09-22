package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class assignment2 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.facebook.com/");
		driver.navigate().refresh();
		WebElement ele= driver.findElement(By.partialLinkText("/r.php?entry_point=login"));
		System.out.println(ele.getTagName());
		System.out.println(ele.getText());
		System.out.println(ele.getAttribute("href"));
		System.out.println(ele.getCssValue("font-weight"));
		
		WebElement ele2=driver.findElement(By.xpath("//"));
		
	}

}
