package automation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class classAssign1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
	
		WebElement ele =driver.findElement(By.xpath("//input[contains(@placeholder,\"Search \")]"));
		ele.sendKeys("iphone 14 pro max");
		Thread.sleep(5000);
		List<WebElement> allele = driver.findElements(By.xpath("//span[contains(text(),'iphone 14 pro')]/.."));
		Thread.sleep(2000);
		int count=allele.size();
		System.out.println(count);
		for(WebElement one:allele) {
		String sugg = one.getText();
			System.out.println(sugg);
			
		}
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(2000);
		//Wait.until(ExpectedConditions.visibilityOfElementLocated(
			//	By.xpath("//div[contains(@class,'_4rR01T')]")));
		
		List<WebElement> eleall2=driver.findElements(By.xpath("//div[contains(text(),'Apple iPhone')]"));
		//List<WebElement> eleall2 = driver.findElements(By.xpath("//div[contains(@class,'_4rR01T')]"));
		
		
		Thread.sleep(2000);
		int count1=eleall2.size();
	System.out.println(count1);
	List<WebElement> eleall3=driver.findElements(By.xpath("//div[contains(text(),'Apple iPhone')]/following::div[7]"));
	//List<WebElement> eleall3 = driver.findElements(By.xpath("//div[contains(@class,'_30jeq3')]"));
		Thread.sleep(2000);
	int count2=eleall3.size();
	System.out.println(count2);
	for(int i=0; i<count2; i++) {
		WebElement myele1=eleall2.get(i);
		WebElement myele2=eleall3.get(i);
		String name=myele1.getText();
		String price=myele2.getText();
		
		System.out.println("the price of- --"+name+"is------"+price);
	}
//		for(WebElement nav:eleall2) {
//			String data=nav.getText();
//			System.out.println(data);
		}
		
		
	}


