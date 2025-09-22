package automation;

import org.bouncycastle.oer.its.ieee1609dot2.basetypes.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class synchron {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
	//driver.manage().timeouts().implicitlyWait(Duration.microseconds(10));
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//a[text()=\"Become a Seller\"]")).click();
		for(int i=0; i<100; i++) {
			try {
		driver.findElement(By.xpath("//a[@href=\"#helpAndSupport\"]")).click();
		break;
			}
			catch (NoSuchElementException e) {
				System.out.println(e);
			}
			
			}
	}

}
