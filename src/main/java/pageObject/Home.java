package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Home extends BaseClass
{

	public Home(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	@FindBy(xpath = "//a[text()='Create new account']")
	WebElement crenew;
	@FindBy(name = "firstname")
	WebElement fname;
	@FindBy(name = "lastname")
	WebElement lname;
	@FindBy(name = "reg_email__")
	WebElement reMail;
	@FindBy(xpath = "//input[@name='reg_passwd__']")
	WebElement pwd;
	@FindBy(xpath = "//input[@value='2']")
	WebElement gender;
	@FindBy(xpath = "//select[@name='birthday_day']")
	WebElement date;
	@FindBy(xpath = "//select[@name='birthday_month']")
	WebElement month;
	@FindBy(xpath = "//select[@name='birthday_year']")
	WebElement year;
	public void creClick() 
	{
		crenew.click();
	}
	public void firstName() {
		fname.sendKeys("ajay");
	}
	public void lastName() {
		lname.sendKeys("meessaragandla");
	}
	public void nameEmail() {
		reMail.sendKeys("meeesar@gmail.com");
	}
	public void password() {
		pwd.sendKeys("fadgsgha");
	}
	public void genderName() {
		gender.click();
	}
	public void selectDate() {
		date.sendKeys("4");
	}
	public void selectmonth() {
		month.sendKeys("May");
	}
	public void selectYear() {
		year.sendKeys("1999");
	}
}
