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

public class sampletest extends StartBrowser {
	
	@Test
	  public void Basicflow() throws Exception {
			ActionDriver aDriver = new ActionDriver();
			
			StartBrowser.ChildTest = StartBrowser.ParentTest.createNode("Launching Web Check-in portal");
			aDriver.launchapplication("https://ppe-wci.etihad.com/app#/check-in/search");
			aDriver.type(HomePage.pnrdetails, "GGOKDC", "PNR ");
			aDriver.type(HomePage.lastname, "WCI", "last name");
			aDriver.waitForLoad(StartBrowser.driver, "Wait Function");
			aDriver.Click(HomePage.btnsearchflight, "Search Flight Button");
			aDriver.Click(LandingPage.updtguestinformation, "Update Passenger Details");
			aDriver.type(PassengerdetailsPage.xpathmiddlenamefld, "Middle name test" ,"Updating middle name");
			aDriver.selectdropdwn(PassengerdetailsPage.MonthDOB,"February", "Month of DOB");
			aDriver.selectdropdwn(PassengerdetailsPage.DayDOB,"15", "Day of DOB");
			aDriver.selectdropdwn(PassengerdetailsPage.yearDOB,"1988", "Year of DOB");	
			aDriver.radiobutton(PassengerdetailsPage.gendermale, "Selecting gender");
			aDriver.selectdropdwn(PassengerdetailsPage.Nationality,"India", "Nationality");	
			aDriver.type(PassengerdetailsPage.passportnumber, "HHJJYY78" ,"Updating Passportdetails");
			aDriver.selectdropdwn(PassengerdetailsPage.ppIssuingcountry,"India", "Passport issuing Country");	
			aDriver.selectdropdwn(PassengerdetailsPage.ppexpmonth,"February", "Month of Passport Expiry");
			aDriver.selectdropdwn(PassengerdetailsPage.ppexpday,"15", "Day of Passport Expiry");
			aDriver.selectdropdwn(PassengerdetailsPage.ppexpyear,"2023", "Year of Passport Expiry");
			aDriver.checkbox(PassengerdetailsPage.EmerContactcheckbox, "Emergency Contact Checkbox");
	

}
}

