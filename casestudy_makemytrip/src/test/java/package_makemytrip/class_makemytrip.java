package package_makemytrip;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class class_makemytrip extends javascript_util {
	public static String url="https://www.makemytrip.com/";
WebDriver driver;
ExtentHtmlReporter htmlReporter;
ExtentReports extent;
ExtentTest test;


@BeforeTest
public void beforetest() throws InterruptedException
{
WebDriverManager.chromedriver().setup();
driver = new ChromeDriver();
Thread.sleep(5000);
driver.get(url);

htmlReporter = new ExtentHtmlReporter("extent.html");
extent = new ExtentReports();
extent.attachReporter(htmlReporter);

	}	

//@Test
//public void tc1() throws InterruptedException {
//	Thread.sleep(6000);
//	driver.findElement(By.linkText("Holiday Packages")).click();
//	Thread.sleep(2000);
//	driver.findElement(By.xpath("//*[@class='appendBottom5 ']")).click();
//	Thread.sleep(2000);
//	driver.findElement(By.xpath("//*[text()='Bangalore']")).click();
//	Thread.sleep(2000);
//	driver.findElement(By.id("toCity")).click();
//	Thread.sleep(2000);
//	driver.findElement(By.xpath("//*[@class='dest-search-input']")).sendKeys("Singapore");
//	Thread.sleep(2000);
//	driver.findElement(By.xpath("//*[@class='dest-search-list']/div")).click();
//	Thread.sleep(6000);
//	
////	driver.findElement(By.xpath("//*[@for='departure_date']")).click();
////	Thread.sleep(2000);
////	driver.findElement(By.xpath("//*[@class='DayPicker-Day']/div/p"));
////	Thread.sleep(2000);
////	driver.findElement(By.xpath("//*[@class='appendBottom5 blue-font up-arrow']"));
////	Thread.sleep(2000);
//	driver.findElement(By.xpath("//*[@class='primaryBtn font24 latoBold widgetSearchBtn']")).click();
//	Thread.sleep(2000);
//	driver.findElement(By.xpath("//*[@class='skipBtn']")).click();
////	Thread.sleep(2000);
//	driver.findElement(By.xpath("//*[@class='DayPicker-Months']")).click();
//	Thread.sleep(2000);
//	driver.findElement(By.xpath("//*[@aria-label='Wed Nov 16 2022']")).click();
//	driver.findElement(By.xpath("//*[@class='primaryBtn big fill btn btn-top-nav btn-lg']")).click();
//	Thread.sleep(2000);
//}
@Test
	 public void test() throws InterruptedException
	    {   
	    test = extent.createTest("makemytrip test created");
	    test.pass("you are in MakeMytrip Website");
	    Thread.sleep(6000);
	    driver.findElement(By.linkText("Holiday Packages")).click();
	    Thread.sleep(6000);
	    driver.findElement(By.xpath("//*[@id='fromCity']")).click();
	    Thread.sleep(6000);
	    driver.findElement(By.xpath("//*[text()='Bangalore']")).click();
	    test.pass("you selected Bangalore");
	    Thread.sleep(6000);
	    driver.findElement(By.id("toCity")).click();
	    Thread.sleep(6000);
	    driver.findElement(By.xpath("//*[@class='dest-search-input']")).sendKeys("singapore");
	    Thread.sleep(6000);
	    driver.findElement(By.xpath("//div[text()='Singapore']")).click();
	    test.pass("you selected Singapore");
	    Thread.sleep(6000);
	    driver.findElement(By.xpath("//button[@data-cy='submit']")).click();
	    Thread.sleep(9000);
	    driver.findElement(By.xpath("//*[@id='departure_date']")).click();
	    Thread.sleep(9000);
	    driver.findElement(By.xpath("//div[@aria-label='Thu Nov 17 2022']")).click();
	    test.pass("you selected 17th NOV");
	    Thread.sleep(6000);
	    driver.findElement(By.xpath("//*[@class='primaryBtn big fill btn btn-top-nav btn-lg']")).click();
	    Thread.sleep(20000);
	    
	    WebElement slider=driver.findElement(By.xpath("//*[@class='flexOne makeFlex']/div[3]//div/div//div/div[5]"));
	    Thread.sleep(6000);
	    Actions ac=new Actions(driver);
	    Thread.sleep(6000);
	    ac.dragAndDropBy(slider,-170,0).build().perform();
	    test.info("you are selecting duration 2days and 3 nights");
	    Thread.sleep(5000);
	    WebElement ela = driver.findElement(By.xpath("//*[@class='Container']/div/div[4]/div/div[2]/div/div/div/div/div"));
	    ela.click();
	    javascript_util.scrollIntoView(ela, driver);
	    Thread.sleep(5000);
	    System.out.println(driver.getTitle());
	    
	    ArrayList<String> tabs = new ArrayList<String> (driver.getWindowHandles());
	    int s=tabs.size();
	    System.out.println(s);
	    driver.switchTo().window(tabs.get(1));  
	    Thread.sleep(5000);
	    
	    WebElement ele=driver.findElement(By.xpath("//*[@class='hotel-row-wrapper ']/div/div/div/span"));
	    ele.click();
	    javascript_util.scrollIntoView(ele, driver);
	    Thread.sleep(5000);
	    
	    WebElement ele1 =driver.findElement(By.xpath("//*[@class='sidePanelBody']/div[2]/div[2]/div[7]/span"));
	    ele1.click();
	    Thread.sleep(5000);
	    driver.findElement(By.xpath("//*[@class='makeFlex column packageUpdate']/div/p")).click();
	    Thread.sleep(5000);
	    
	    WebElement ele2=driver.findElement(By.xpath("//*[@class='add-activity-container']/div[2]"));
	    ele2.click();
	    javascript_util.scrollIntoView(ele2, driver);
	    Thread.sleep(5000);
	    
	    WebElement ele3=driver.findElement(By.xpath("//*[@class='sidePanelBody']/div[2]/div[2]/div[3]/span"));
	    ele3.click();
	    Thread.sleep(8000);
	    
	    driver.findElement(By.xpath("//*[@class='makeFlex column packageUpdate']/div/p")).click();
	    Thread.sleep(7000);
	    driver.findElement(By.xpath("//*[@class='initerary-nav']/li[2]")).click();
	    Thread.sleep(5000);
	    driver.findElement(By.xpath("//*[@class='initerary-nav']/li[3]")).click();
	    Thread.sleep(4000);
	    driver.findElement(By.xpath("//*[@class='initerary-nav']/li[4]")).click();
	    Thread.sleep(5000);
	    driver.findElement(By.xpath("//*[@class='initerary-nav']/li[5]")).click();
	    Thread.sleep(5000);
	    driver.quit();
	    test.info("you closed the browser");
	    extent.flush();
	    
	    }
	
		
	}
