package automation;

import org.openqa.selenium.chrome.ChromeDriver;

public class drverselenium {

	public static void main(String[] args) {
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.instagram.com");
		System.out.println(driver.getCurrentUrl());
		
	System.out.println(driver.getTitle());
	driver.close();
	}

}
