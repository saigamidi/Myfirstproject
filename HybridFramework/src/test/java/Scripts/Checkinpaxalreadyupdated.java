package Scripts;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import CustCommands.ActionDriver;
import HybridFrameworkConfig.StartBrowser;
import ObjectRepositoryOR.HazmatPage;
import ObjectRepositoryOR.HomePage;
import ObjectRepositoryOR.LandingPage;
import ObjectRepositoryOR.PassengerdetailsPage;
import ObjectRepositoryOR.Seatspage;

public class Checkinpaxalreadyupdated extends StartBrowser {


	@Test
  public void Basicflow() throws Exception {
		ActionDriver aDriver = new ActionDriver();
		
		StartBrowser.ChildTest = StartBrowser.ParentTest.createNode("Launching Web Check-in portal");
		aDriver.launchapplication("https://ppe-wci.etihad.com/app#/check-in/search");
		aDriver.type(HomePage.pnrdetails, "UKENZU", "PNR ");
		aDriver.type(HomePage.lastname, "WCI", "last name");
		aDriver.waitForLoad(StartBrowser.driver, "Wait Function");
		aDriver.Click(HomePage.btnsearchflight, "Search Flight Button");
		aDriver.Click(LandingPage.Checkinallguestbtn, "Check-in all guests");
		aDriver.Click(HazmatPage.HazmatNotcarrying, "Hazmat - Not Carrying");
		//aDriver.Click(Seatspage.Seatsselectionone, "Seat Selection");
		//aDriver.Click(Seatspage.confirmseatselection, "Confirm Selection");
		
		aDriver.waitForLoad(StartBrowser.driver, "Wait Function");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		//aDriver.Click(Seatspage.confirmcheckinxpath, "Confirm Check-in");
		//aDriver.Clickxpath(Seatspage.confirmcheckinclsname, "Confirm Check-in");
		//aDriver.Click(Seatspage.confirmcheckin, "Confirm Check-in");
	
	//	aDriver.Click(Seatspage.confirmcheckinCSSselector, "Confirm Check-in");
		aDriver.Clickxpath(StartBrowser.driver,Seatspage.confirmcheckinxpath, "Confirm Check-in");
		//aDriver.Clickxpath(StartBrowser.driver,Seatspage.confirmcheckinxpath, "Confirm Check-in");
		
		
	
}
}
