//package automation;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//public class gettext {
//
//	public static void main(String[] args) {
//		WebDriver driver=new ChromeDriver();
//		driver.manage().window().maximize();
//		
//		driver.get("https://www.facebook.com/");
//		driver.navigate().refresh();
//		WebElement ele= driver.findElement(By.name("email"));
//		String tagname= ele.getTagName();
//		
//		String text=ele.getText();
//		ele.sendKeys("navven@gmail.com");
//		String attributeval=ele.getAttribute("class");
//		String cssvalue=ele.getCssValue("background"); 
//		 
//		System.out.println(tagname);
//	System.out.println(".......");
//	System.out.println(text);
//	System.out.println(".......");
//	System.out.println(attributeval);
//	System.out.println(".......");
//	System.out.println(cssvalue);
//
//	}
//
//}
package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class gettext {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.facebook.com/");
		driver.navigate().refresh();

		// This is the element with actual visible text
		WebElement loginButton = driver.findElement(By.name("login"));

		String tagname = loginButton.getTagName(); // should return "button" or "input"
		String text = loginButton.getText();       // should return "Log in"
		String attributeval = loginButton.getAttribute("class");
		String cssvalue = loginButton.getCssValue("background");

		System.out.println("Tag name: " + tagname);
		System.out.println("Text: " + text);
		System.out.println("Class attribute: " + attributeval);
		System.out.println("Background CSS: " + cssvalue);

		driver.quit(); // Close the browser
	}
}
