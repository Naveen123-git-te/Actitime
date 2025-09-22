package automation;

import javax.swing.text.Highlighter.Highlight;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class rect {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		
			
		
		WebElement ele= driver.findElement(By.xpath("//input[@name=\"email\"]"));
		
				ele.sendKeys("naveen");
	//	WebElement ele1= driver.findElement(By.xpath("(//label[@class=\"_aa48\"])[2]"));
				Thread.sleep(2000);
		 Dimension de= ele.getSize();
		 int hig=de.getHeight();
		 System.out.println("hight"+hig);
		 int wid=de.getWidth();
		 System.out.println("width"+wid);
		 
		 System.out.println("---------------");
		 
		Point p= ele.getLocation();
		int x=p.getX();
		 System.out.println("x"+x);
		int y=p.getY();
		 System.out.println("y"+y);
		 System.out.println("--------------");
		 Thread.sleep(2000);
		Rectangle re= ele.getRect();
		int ree=re.getHeight();
		 System.out.println("hig"+ree);
		int ree1=re.getWidth();
		 System.out.println("wid"+ree1);
		int reex=re.getX();
		 System.out.println("x"+reex);
		int reey=re.getY();
		 System.out.println("y"+reey);
		int x1=re.x;
		 System.out.println("rectx"+x1);
		int x2=re.y;
		Thread.sleep(2000);
		 System.out.println("recty"+x2);
		 Point poi=re.getPoint();
		 System.out.println("point"+poi);
   Class<? extends Rectangle> cla=re.getClass();
  System.out.println("clas"+cla);
  Dimension dee= re.getDimension();
  System.out.println("dimension"+dee);
		 driver.quit();
		
	}

}
