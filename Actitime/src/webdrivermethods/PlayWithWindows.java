package webdrivermethods;

import java.util.Set;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class PlayWithWindows {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.get("https://www.myntra.com/");
		Set<String> allWids = driver.getWindowHandles();
		System.out.println(allWids);
		for (String wid : allWids) {
			String widUrl = driver.switchTo().window(wid).getCurrentUrl();
			System.out.println(widUrl);
			if (widUrl.equals("https://www.facebook.com/")) {
				String url = driver.getCurrentUrl();
				System.out.println(url);
			} else if (widUrl.equals("https://www.myntra.com/")) {
				String myntraHomepageTitle = driver.getTitle();
				System.out.println("myntraHomepageTitle = " + myntraHomepageTitle);
				int childWindowHeight = driver.manage().window().getSize().getHeight();
				System.out.println("childWindowHeight = " + childWindowHeight);
				int childWindowWidth = driver.manage().window().getSize().getWidth();
				System.out.println("childWindowWidth = " + childWindowWidth);
				int ChildWindowXAxis = driver.manage().window().getPosition().getX();
				System.out.println("ChildWindowXAxis = " + ChildWindowXAxis);
				int ChildWindowYAxis = driver.manage().window().getPosition().getY();
				System.out.println("ChildWindowYAxis = " + ChildWindowYAxis);
				Dimension definedSize = new Dimension(400, 300);
				driver.manage().window().setSize(definedSize);
				Thread.sleep(3000);
				Point definedPosition = new Point(300, 400);
				driver.manage().window().setPosition(definedPosition);
				Thread.sleep(3000);
				// driver.close();
			}
		}
		driver.quit();
	}
}
