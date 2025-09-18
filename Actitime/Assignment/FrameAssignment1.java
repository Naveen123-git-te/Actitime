package FRAME;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameAssignment1 {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
	driver.get("https://demoapps.qspiders.com/");
	driver.findElement(By.xpath("//p[text()='Experience the seamless interactions and responsive designs']")).click();
    driver.findElement(By.xpath("//section[text()='Frames']")).click();
    driver.findElement(By.xpath("//section[text()='iframes']")).click();
    driver.findElement(By.linkText("Nested iframe")).click();
    Thread.sleep(2000);
    driver.switchTo().frame(0);
     WebElement ele1 = driver.findElement(By.xpath("//p[text()='Admin@gmail.com']"));
     String email = ele1.getText();
     driver.switchTo().frame(0);
     Thread.sleep(2000);
    WebElement first = driver.findElement(By.id("email"));
    first.sendKeys(email);
    Thread.sleep(2000);
    driver.switchTo().parentFrame();
    String pwd = driver.findElement(By.xpath("//p[text()='Admin@1234'][1]")).getText();
    Thread.sleep(2000);
    driver.switchTo().frame(0);
    WebElement second = driver.findElement(By.id("password"));
    second.sendKeys(pwd);
    Thread.sleep(2000);
    driver.switchTo().parentFrame();
   String cnfrm = driver.findElement(By.xpath("//p[text()='Admin@1234'][2]")).getText();
   Thread.sleep(2000);
   driver.switchTo().frame(0);
  WebElement third = driver.findElement(By.id("confirm-password"));
  third.sendKeys(cnfrm);
  
   
   
   
   
   
   
    
    
    
    
    





}
}
