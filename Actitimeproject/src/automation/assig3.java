

package automation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class assig3 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.navigate().refresh();
		List<WebElement> allele = driver.findElements(By.tagName("a"));
		int count = allele.size();
		System.out.println("Total links: " + count);
		
		for (int i=0; i<count; i++) {
			WebElement links = allele.get(i);
			String url = links.getAttribute("href");
			//String url = links.getText();
			//if (url != null && !url.isEmpty()) {
				System.out.println(url);
			}
		
		
	}
	
	}
//package automation;
//
//import java.util.List;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//public class assig3 {
//
//	public static void main(String[] args) {
//		WebDriver driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("https://www.facebook.com/");
//		driver.navigate().refresh();
//
//		List<WebElement> allele = driver.findElements(By.tagName("a"));
//		int count = allele.size();
//		System.out.println("Total links: " + count);
//
//		for (WebElement ele : allele) {
//			String url = ele.getAttribute("href");
//			if (url != null && !url.isEmpty()) {
//				System.out.println(url);
//			}
//		}
//
//		driver.quit();
//	}
//}


