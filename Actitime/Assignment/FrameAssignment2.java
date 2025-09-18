package FRAME;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FrameAssignment2 {
	public static void main(String[] args) throws InterruptedException, AWTException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
		driver.get("https://www.google.com/");
		driver.findElement(By.xpath("//a[@role='button']")).click();
		Thread.sleep(2000);
		driver.switchTo().frame(0);
		WebElement ele1 = driver.findElement(By.xpath("//span[text()='YouTube']"));
		Actions a=new Actions(driver);
		Thread.sleep(1000);
		//a.doubleClick(ele1);
		a.contextClick(ele1);
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_W);
		r.keyRelease(KeyEvent.VK_CONTROL);
		//driver.switchTo().
		//driver.findElement(By.xpath("//span[text()='Stay signed out']")).click();
		
	}

}
