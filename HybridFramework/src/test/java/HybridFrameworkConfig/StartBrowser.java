package HybridFrameworkConfig;

import java.lang.reflect.Method;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class StartBrowser {
	
	public static WebDriver driver;
	public ExtentHtmlReporter htmlReporter;
	public static ExtentReports extent;
	public static ExtentTest ParentTest;
	public static ExtentTest ChildTest;
	String method;
	
	
  @BeforeMethod
  public void methodName (Method method){
	  ParentTest = extent.createTest(method.getName());
  }
  
  
  
  @BeforeTest
  public void report(){
	  htmlReporter = new ExtentHtmlReporter("C:/Sai/Personal/Learning/Selenium/Worspace/SeleniumLunaWS/HybridFramework/Report/MyhtmlReport.html");
	  extent = new ExtentReports();// it will capture the input files to write the code in html report
	  extent.attachReporter(htmlReporter);
	  
  }
  
  @BeforeClass
  public void beforeClass() {
	  
	  System.setProperty("webdriver.chrome.driver", "C:/Sai/Personal/Learning/Selenium/Softwares/chromedriver_win32/chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	  driver.manage().window().maximize();
  }
  
  @AfterClass
  public void afterClass(){
	
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	//driver.quit();
	extent.flush(); // after closing of browser it will write code to html file
	
  }
	

}
