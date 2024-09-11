package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OpencartHome extends BaseClass {

	public OpencartHome(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	@FindBy(xpath = "(//a[contains(text(),'Register')])[2]")
	WebElement reg;
	//@FindBy(xpath = "//input[@name='username']")
	//WebElement user;
	
	public void regAccount() {
		reg.click();
	}
	/*public void userName() {
		user.sendKeys("ajay");
	}*/
	

}
