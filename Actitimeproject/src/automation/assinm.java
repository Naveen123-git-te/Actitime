package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class assinm {

	public static void main(String[] args) throws InterruptedException {
	
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.facebook.com/");
		driver.navigate().refresh();
		
		 driver.findElement(By.xpath("//button[@class='_42ft _4jy0 _6lth _4jy6 _4jy1 selected _51sy']")).click();
		 
		 WebElement ele= driver.findElement(By.className("_9ay7"));
		 System.out.println(" err message => "+ele.getText());
		 String cssvalue=ele.getCssValue("color");
		 System.out.println("color of err message =>"+cssvalue);
		 
		 WebElement ele1= driver.findElement(By.xpath("//a[@title='Sign up for Facebook']"));
		 String tooltip=ele1.getAttribute( "title");
		 System.out.println("Get tooltip text =>"+ tooltip);
		 System.out.println(ele1.getText());
	}}
