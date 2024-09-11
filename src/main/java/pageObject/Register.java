package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Register extends BaseClass {
	
	public Register(WebDriver driver)
	{
		super(driver);
	}
	@FindBy(xpath="//input[@name='emailid']")
	WebElement  email;

	public void emailEnter() 
	{
		email.sendKeys("ajajgdj@gmail.com");
	}
}
