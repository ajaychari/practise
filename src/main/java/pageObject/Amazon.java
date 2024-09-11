package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Amazon  extends BaseClass {

	public Amazon(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	@FindBy(xpath = "//select[@title='Search in']")
	WebElement drop;
	@FindBy(xpath = "//option[text()='Computers & Accessories']")
	WebElement ele1;
	@FindBy(xpath = "//input[@id='twotabsearchtextbox']")
	WebElement search;
	@FindBy(xpath = "//input[@id=\"nav-search-submit-button\"]")
	WebElement magnifier;
	@FindBy(linkText = "Get It by Tomorrow")
	WebElement checkbox;
	
	public void dropDown() {
		drop.click();
	}
	public void select() {
		ele1.click();
	}
	public void enterData() {
		search.sendKeys("laptops");
			}
	public void magClick() {
		magnifier.click();
	}
	public void check() {
		checkbox.click();
	}
	public void enterText() {
		search.sendKeys("mobiles");
	}

}
