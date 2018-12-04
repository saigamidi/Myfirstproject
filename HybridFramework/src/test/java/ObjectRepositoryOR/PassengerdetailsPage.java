package ObjectRepositoryOR;

import org.openqa.selenium.By;

public class PassengerdetailsPage {
	
	public static By overlayheader = By.xpath("//button[contains(text(),'Guest details')]");
	public static By middlenamefld = By.className("form-input-container");
	public static By dommiddlenamefld = By.cssSelector("div.form-input--valid:nth-child(2)");
	public static By xpathmiddlenamefld = By.xpath("/html/body/et-root/div[2]/et-checkin/main/div/et-trip-summary/div[2]/pax-detail/div/div/div[2]/div[3]/form/div[1]/div/div[2]/div/div[2]/div/input");
	public static By MonthDOB = By.id("ui-selectdateOfBirthMonth");
	public static By DayDOB = By.id("ui-selectdateOfBirthDay");
	public static By yearDOB = By.id("ui-selectdateOfBirthYear");
	public static By gendermale = By.xpath("/html/body/et-root/div[2]/et-checkin/main/div/et-trip-summary/div[2]/pax-detail/div/div/div[2]/div[3]/form/div[3]/div/div[2]/div/div/div[1]/div/div/div/label/input");
	public static By genderfemale = By.xpath("/html/body/et-root/div[2]/et-checkin/main/div/et-trip-summary/div[2]/pax-detail/div/div/div[2]/div[3]/form/div[3]/div/div[2]/div/div/div[2]/div/div/div/label/input");
	public static By Nationality = By.id("ui-selectnationalityCode");
	public static By passportnumber = By.xpath("/html/body/et-root/div[2]/et-checkin/main/div/et-trip-summary/div[2]/pax-detail/div/div/div[2]/div[3]/form/div[5]/div/div[2]/div/div[1]/div/input");
	public static By ppIssuingcountry = By.id("ui-selectissuingCountryCode");
	public static By ppexpmonth = By.id("ui-selectdateOfExpiryMonth");
	public static By ppexpday = By.id("ui-selectdateOfExpiryDay");
	public static By ppexpyear = By.id("ui-selectdateOfExpiryYear");
	public static By EmerContactcheckbox = By.xpath("/html/body/et-root/div[2]/et-checkin/main/div/et-trip-summary/div[2]/pax-detail/div/div/div[2]/div[3]/form/div[7]/div/div[2]/div/div[1]/label/i");
	public static By updatebutton = By.xpath("/html/body/et-root/div[2]/et-checkin/main/div/et-trip-summary/div[2]/pax-detail/div/div/div[2]/div[3]/form/div[8]/button[2]");
	
}
