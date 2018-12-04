package CustCommands;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import HybridFrameworkConfig.StartBrowser;

public class ActionDriver {
	WebDriver driver;
	
	public ActionDriver(){
		driver = StartBrowser.driver;
		
		}
	
	/**
	 * Used to launch the application 
	 * @param url -- Application url
	 * Example  ----https://example.com
	 * @throws Exception 
	 */
	public void launchapplication(String url) throws Exception{
		try {
			
			driver.get(url);
			StartBrowser.ChildTest.pass("Navigated to Application URL is successful: "+url);
			//driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		} catch (Exception e) {
			// TODO: handle exception
			
			StartBrowser.ChildTest.fail("Navigated to Application URL is Unsuccessful: "+url + StartBrowser.ChildTest.addScreenCaptureFromPath(Screenshot(driver)));
		}
	}
	
	/**
	 * Perform Click operation on Links, buttons, Radio Buttons, Check box
	 * @param locator -- Get it from Object Repository , Example : Homepage.lnkSignin
	 * @throws Exception 
	 */
	public void Click(By locator, String eleName) throws Exception{
		try {
			driver.findElement(locator).click();
			StartBrowser.ChildTest.pass("Able to perform Click action on " +  eleName);
			//driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
			
		} catch (Exception e) {
			
			// TODO: handle exception
			
			StartBrowser.ChildTest.fail("Unable to perform Click action on " +  eleName + StartBrowser.ChildTest.addScreenCaptureFromPath(Screenshot(driver)));
			throw e;
		}
	}
	
	public void Clickxpath(WebDriver driverval,By locator, String eleName) throws Exception{
		try {
			
			List<WebElement> bttn=driverval.findElements(locator);
			for(int i=0;i<bttn.size();i++)
	    	{
				System.out.println("Button Size "+bttn.size() );
	    		if(bttn.get(i).isDisplayed() && bttn.get(i).isEnabled())
	    		{
	    			System.out.println("Button number is  "+bttn.get(i) +" i is "+  i);
	    			bttn.get(i).click();
	    		
	    			/*int x=bttn.get(i).getLocation().getX();
	    			int y=bttn.get(i).getLocation().getY();

	    			Actions builder = new Actions(driverval);   
	    			builder.moveToElement(bttn.get(i), x, y).click().build().perform();*/
	    			
	    	

	    			break;
	    		}
	    	} 
			/*List<WebElement> bttn=driverval.findElements(locator);
			
			for(int i=0;i<bttn.size();i++ )
	    	{
	    		if(bttn.get(i).isDisplayed() && bttn.get(i).isEnabled())
	    		{
	    			
	    			bttn.get(i).click();
	    			break;
	    		}
	    	} */
			
	/*		int ok_size=driver.findElements(locator).size();
			System.out.println(ok_size);
			 
			System.out.println(driver.findElements(locator).get(ok_size-1));
			driver.findElements(locator).get(ok_size-2).click();*/
			
			//driver.findElement(locator).click();
			StartBrowser.ChildTest.pass("Able to perform Click action on " +  eleName);
			//driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
			
		} catch (Exception e) {
			
			// TODO: handle exception
			
			StartBrowser.ChildTest.fail("Unable to perform Click action on " +  eleName + StartBrowser.ChildTest.addScreenCaptureFromPath(Screenshot(driver)));
			throw e;
		}
	}
	
	/**
	 * Set text in the text box
	 * @param locator - get it from Object Repository Example : Homepage.txtLogin
	 * @param testData 	- get it from a external file or hard code the value as required
	 * @throws Exception 
	 */
	
	public void radiobutton(By locator, String eleName) throws Exception{
		try {
			boolean radiobuttonstatus = driver.findElement(locator).isSelected();
			if (radiobuttonstatus!= true){
				driver.findElement(locator).click();
				//driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
			}
			StartBrowser.ChildTest.pass("Able to perform Click action on " +  eleName);
			
		} catch (Exception e) {
			
			// TODO: handle exception
			
			StartBrowser.ChildTest.fail("Unable to perform Click action on " +  eleName + StartBrowser.ChildTest.addScreenCaptureFromPath(Screenshot(driver)));
			throw e;
		}
	}
	
	public void checkbox(By locator, String eleName) throws Exception{
		try {
			boolean checkboxstatus = driver.findElement(locator).isSelected();
			if (checkboxstatus!= true){
				driver.findElement(locator).click();
				//driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
			}
			StartBrowser.ChildTest.pass("Able to perform Click action on " +  eleName);
			
		} catch (Exception e) {
			
			// TODO: handle exception
			
			StartBrowser.ChildTest.fail("Unable to perform Click action on " +  eleName + StartBrowser.ChildTest.addScreenCaptureFromPath(Screenshot(driver)));
			throw e;
		}
	}
	
	public void type(By locator, String testData, String eleName) throws Exception{
		try {
			/*for (String windowName : driver.getWindowHandles()) {
			driver.switchTo().window(windowName);
			System.out.println(windowName );*/
			driver.findElement(locator).clear();
			driver.findElement(locator).sendKeys(testData);
			//driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
						
			StartBrowser.ChildTest.pass("Able to perform type in " +  eleName + "Data is "+testData);
		} catch (Exception e) {
			// TODO: handle exception
			StartBrowser.ChildTest.fail("Unable to perform type in " +  eleName + "Data is "+testData + StartBrowser.ChildTest.addScreenCaptureFromPath(Screenshot(driver)));
			throw e;
		}
	}
	
	/**
	 * Perform Mouse Hover on a given element
	 * @param locator - get it from Object Repository Example : Homepage.txtLogin
	 * @throws Exception 
	 * 
	 */
	public void mouseHover(By locator, String eleName) throws Exception{
		
		try {
			
			Actions a = new Actions(driver);
			WebElement mo = driver.findElement(locator);
			a.moveToElement(mo).build().perform();
			StartBrowser.ChildTest.pass("Able to perform Mouse hover " +  eleName );
			
		} catch (Exception e) {
			// TODO: handle exception
			//String filepath = Screenshot(driver);
			//System.out.println(filepath);
			
			StartBrowser.ChildTest.fail("Unable to perform Mouse Hover " +  eleName + StartBrowser.ChildTest.addScreenCaptureFromPath(Screenshot(driver)));
			throw e;
		}
		
			
	}
	
	public void waitForLoad(WebDriver driverval, String eleName) {
		
        ExpectedCondition<Boolean> pageLoadCondition = new
                ExpectedCondition<Boolean>() {
                    public Boolean apply(WebDriver driverval) {
                        return ((JavascriptExecutor)driverval).executeScript("return document.readyState").equals("complete");
                    }
                };
                System.out.println("I am returning,..........");
        WebDriverWait wait = new WebDriverWait(driverval, 30);
        wait.until(pageLoadCondition);
        System.out.println("after 30 Sec,..........");
    }
	
	public void selectdropdwn(By locator, String testData, String eleName) throws Exception{
		try {
			WebElement dropdwnbox = driver.findElement(locator);
			Select dropdown = new Select(dropdwnbox);
			dropdown.selectByVisibleText(testData);
			//dropdown.selectByIndex(25); // Afghanisthan
			//String drpdwnslctval = dropdwnbox.getAttribute(testData);
			
			//driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

			StartBrowser.ChildTest.pass("Able to perform type in " +  eleName + "Data is "+testData);
			
			}
			
		 catch (Exception e) {
			// TODO: handle exception
			StartBrowser.ChildTest.fail("Unable to perform type in " +  eleName + "Data is "+testData + StartBrowser.ChildTest.addScreenCaptureFromPath(Screenshot(driver)));
			throw e;
		}
	}
	
	
	public void popuptype(By locator, String testData, String eleName) throws Exception{
		String parentWindow,childWindow,windowName;
		
		try {
			
			//List<WebElement> frames = driver.findElements(By.tagName("frame"));
			driver.switchTo().frame(0);
	        driver.findElement(locator).clear();
	        driver.findElement(locator).sendKeys(testData);
	       // driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
	        StartBrowser.ChildTest.pass("Able to perform type in " +  eleName + "Data is "+testData);			
			
		}
			catch (Exception e) {
				// TODO: handle exception
				StartBrowser.ChildTest.fail("Unable to perform type in " +  eleName + "Data is "+testData + StartBrowser.ChildTest.addScreenCaptureFromPath(Screenshot(driver)));
				throw e;
			}	
	}
	
		public String Screenshot(WebDriver driver) throws Exception{
		
		String src_path= "C:/Sai/Personal/Learning/Selenium/Worspace/SeleniumLunaWS/HybridFramework/Screenshots/";
		UUID uuid = UUID.randomUUID();
		File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		//File targetfilename = new File(src_path+uuid+".jpeg");
		
		try {
			FileUtils.copyFile(srcFile, new File(src_path+uuid+".jpeg"));
			//System.out.println("Screenshot Path is "+src_path+uuid+".jpeg");
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Unable to capture the screenshot");
			
		}
	
		return src_path+uuid+".jpeg";
	}
	

}
