package ObjectRepositoryOR;

import org.openqa.selenium.By;
public class Seatspage {
	
	public static By Seatsselectionone = By.xpath("/html/body/et-root/div[2]/et-checkin/main/div/et-personalise/div/div/div/div/div/div[2]/div[2]/div/div/div[2]/div[3]/div/div[2]/div[2]/div[9]/seat[1]/div/button");
	public static By confirmseatselection = By.xpath("/html/body/et-root/div[2]/et-checkin/main/div/et-personalise/div/div/div/div/div/div[2]/div[2]/div/div/div[3]/div/div/div[2]/div/div/button");
	public static By confirmcheckin = By.xpath("//button[@class,'personalise__booking-info--checkin-passengers--button et-ui-button et-ui-button--primary ng-star-inserted'] and [contains(text(),'Text: CONFIRM & CHECK IN')]");
	public static By confirmcheckinCSSselector = By.cssSelector(".content__seating-summary > div:nth-child(1) > div:nth-child(2) > div:nth-child(1)");
	public static By confirmcheckinclsname = By.className("personalise__booking-info--checkin-passengers--button");
	public static By confirmcheckinxpath = By.xpath("//button[text()='CONFIRM & CHECK IN']");
}
