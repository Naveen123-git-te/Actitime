package automation;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class assigme3 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/");
		driver.navigate().refresh();
		driver.findElement(By.xpath("(//a[@class=\"block w-[100%] h-full\"])[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//section[contains(text(),'Check Box')]")).click();
		Thread.sleep(2000);
		List<WebElement> allele= driver.findElements(By.xpath("//input[@type=\'checkbox\']"));
		Thread.sleep(2000);
	
				int count=allele.size();
				System.out.println(count);
				//for(WebElement ele: allele) {
				//	ele.click();
			//	}
				for (int i=0; i<count; i++) {
					WebElement links = allele.get(i);
					links.click();
				}
				
driver.quit();
	}

}


