package automation;

import java.time.Duration;
import java.time.Instant;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class pageLoadTime {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(2000));
	//	driver.manage().timeouts().pageLoadTimeout(1, TimeUnit.MINUTES); //older version
		Instant starttime=Instant.now();
		System.out.println("start"+starttime.toString());
		driver.get("https://www.facebook.com/");
		Instant endtime=Instant.now();
		System.out.println("end"+endtime.toString());
		Duration duration =Duration.between(starttime, endtime);
		System.out.println(duration.toString());
		System.out.println(driver.getTitle());
		driver.quit();
	}

}
