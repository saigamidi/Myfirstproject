package ReUse;

import java.io.IOException;

import CustCommands.ActionDriver;
import HybridFrameworkConfig.StartBrowser;
import ObjectRepositoryOR.HomePage;
import ObjectRepositoryOR.LandingPage;
import ObjectRepositoryOR.PassengerdetailsPage;

public class CommonFuncLogin {
	
	public ActionDriver aDriver;
	
	public CommonFuncLogin(){
		aDriver = new ActionDriver();
	}
	
	/*
	 * Sign in to application
	 */
	public void Signin() throws Exception{
		
		StartBrowser.ChildTest = StartBrowser.ParentTest.createNode("Sign in to Costco");
		/*aDriver.launchapplication("https://www.costco.com/");
		aDriver.Click(HomePage.lnkSignin , "Sign in Link");
	*/
	}
	
	/*
	 * Sign out from the application 
	 */
	public void SignOut() throws Exception{
		
		StartBrowser.ChildTest = StartBrowser.ParentTest.createNode("Sign Out from Costco");
		/*aDriver.mouseHover(PassengerdetailsPage.lnkMyAccount, "My Account");
		aDriver.Click(PassengerdetailsPage.btnSignout, "Sign Out link");
	*/
	}

}
