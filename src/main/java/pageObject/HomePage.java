package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BaseClass {

	public HomePage(WebDriver driver)
	{
		super(driver);
	}
	@FindBy(xpath="//a[text()='here']")
	WebElement here;
	@FindBy(xpath = "//input[@name='uid']")
	WebElement name;
	@FindBy(name = "password")
	WebElement pass;
	@FindBy(name="btnLogin")
	WebElement button;
	@FindBy(xpath = "//a[text()='New Customer']")
	WebElement addCustomer;
	@FindBy(xpath = "//input[@name='name']")
	WebElement ename;
	@FindBy(name = "dob")
	WebElement date;
	@FindBy(name="addr")
	WebElement address;
	@FindBy(name = "city")
	WebElement city;
	@FindBy(name="state")
	WebElement state;
	@FindBy(name = "pinno")
	WebElement pin;
	@FindBy(name = "telephoneno")
	WebElement phno;
	@FindBy(name = "emailid")
	 WebElement emailid;
	@FindBy(xpath = "//input[@type='password']")
	WebElement password;
	public void clickHere()
	{
		here.click();
	}
	public void uname()
	{
		name.sendKeys("mngr585406");
	}
	public void password()
	{
		pass.sendKeys("rehuvad");
	}
	public void buttonClick() 
	{
		button.click();
	}
	public void addname() 
	{
		addCustomer.click();
	}
	public void firstName() 
	{
		ename.sendKeys("ajay");
	}
	public void dateOfBirth() 
	{
		date.sendKeys("08081999");
	}
	public void tempAddress() 
	{
		address.sendKeys("8 arch road kanigiri");
	}
	public void city()
	{
		city.sendKeys("kanigiri");
	}
	public void state() 
	{
		state.sendKeys("Andhra Pradesh");
	}
	
	public void pin() {
		// TODO Auto-generated method stub
		pin.sendKeys("523230");
	}
	public void Phn() 
	{
		phno.sendKeys("7780478713");
	}
	
	public void mail() {
		// TODO Auto-generated method stub
		emailid.sendKeys("ajajadghjdh@gmail.com");
	}
	public void namePass() 
	{
		password.sendKeys("ajadjdgugw@12");
	}
}

