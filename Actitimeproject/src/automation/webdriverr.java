package automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class webdriverr {

	public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	demoDriver.test( driver);
	WebDriver driver1=new EdgeDriver();
	demoDriver.test( driver1);
    WebDriver driver2=new FirefoxDriver();
    demoDriver.test(driver2);
    }

}
