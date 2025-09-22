package automation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class locate {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//driver.get("https://www.instagram.com/");
		//driver.findElement(By.linkText("Forgot password?")).click();
		driver.get("https://www.facebook.com/");
		driver.navigate().refresh();
		// driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")).click();
		driver.findElement(By.cssSelector("a[href='/r.php?entry_point=login']")).click();
		WebElement ele= driver.findElement(By.xpath("//input[@name='firstname']"));
		ele.click();
		 ele.sendKeys("Naveen");
		
		 WebElement ee= driver.findElement(By.xpath("//input[@name='lastname']"));
	
		 ee.sendKeys("S");
		Thread.sleep(200);
		 driver.findElement(By.className("_1lch")).click();
		driver.findElement(By.xpath("//button[contains(text(), 'Sign Up')][1]")).click();
		
		driver.findElement(By.linkText("Forgotten password?")).click();
			//	driver.findElement(By.xpath("//div[@class='tnb-mobile-nav-section-toggle-btn tnb-paid-service w3-button ga-top ga-top-menu-cert-and-course']")).click();
	}

}
