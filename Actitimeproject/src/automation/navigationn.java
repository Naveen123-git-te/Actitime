package automation;

import org.openqa.selenium.chrome.ChromeDriver;

public class navigationn {

	public static void main(String[] args) {
		ChromeDriver driver =new ChromeDriver();
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		driver.get("https://www.instagram.com/#");
		driver.navigate().to("https://www.facebook.com/");
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
		driver.close();
	

	}

}
