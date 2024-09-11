package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DrybarHome  extends BaseClass
{

	public DrybarHome(WebDriver driver)
	{
		super(driver);
		// TODO Auto-generated constructor stub
	}
	@FindBy(xpath = "//button[text()='Accept All']")
	WebElement accept;
	
	@FindBy(xpath = "//span[text()='Shampoos']")
	WebElement shampoo;
	
	public void acceptAll() 
	{
		accept.click();
	}
	
	
	public void shamp() {
		// TODO Auto-generated method stub
		shampoo.click();
	}
}
