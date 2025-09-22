package automation;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;

public class demoDriver {
public static void test(WebDriver driver)
{driver.manage().window().maximize();
driver.get("https://jspiders.com/");
driver.navigate().to("https://qspiders.com/");
driver.navigate().back();
driver.navigate().forward();
driver.navigate().refresh();

String actualtitle = driver.getTitle();
String actualurl = driver.getCurrentUrl();

System.out.println(actualtitle);
System.out.println(actualurl );

String expectedtitle="QSpiders | Empowering IT & Software Careers with Comprehensive Courses";
String expectedurl="https://qspiders.com/";
 
if (actualtitle.equals(expectedtitle)&&(actualurl.contains(expectedurl))) {
	System.out.println("-----pass----- it navigated to QSPIDER WEB PAGE");}
else {
	System.out.println("----fail------------ it not navigated any web page");}

driver.manage().deleteAllCookies();
//System.out.println(driver.getPageSource());
driver.manage().window().fullscreen();
driver.manage().window().setSize(new Dimension(200, 100));
driver.manage().window().setPosition(new org.openqa.selenium.Point(100,100));
driver.manage().window().minimize();
driver.quit();      }}
