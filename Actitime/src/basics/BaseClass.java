package basics;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import com.actitime.pom.HomePage;
import com.actitime.pom.LoginPage;
//kiran's assignment
public class BaseClass {
	
	public static WebDriver driver;
	
	public FileLib f =new FileLib();
	 
	
	 @BeforeClass
	  public void OpenBrowser() throws IOException {
	
		 driver= new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		 
		 String url=f.readPropertyData("url");
		 System.out.println("The url is"+url);
		 driver.get(url);
	//	 driver.get("http://localhost:3434/login.do");
		 }
	  
	  @AfterClass
	  public void CloseBrowser() {
		  
		  driver.quit();
		//  System.out.println("Close Browser ");
		
	}
	
@BeforeMethod	
public void Login() throws IOException {
	
	LoginPage loginpage= new LoginPage(driver);
	String username=f.readPropertyData("username");
	String password =f.readPropertyData("password");
	
	loginpage.setLogin(username, password);

	/* without POM  code 
	
	driver.findElement(By.id("username")).sendKeys("admin");
	driver.findElement(By.name("pwd")).sendKeys("manager");
	driver.findElement(By.xpath("//div[text()='Login ']")).click();
	
	without POM Code */
	
	
}

@AfterMethod
public void Logout() {
	
	HomePage homepage =new HomePage(driver);
//	homepage.setLogoutBtn();
	/* Handled in HomePage POM Class 
	driver.findElement(By.id("logoutLink")).click();;
	 */
}

}
