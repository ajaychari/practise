package testCase;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pageObject.Home;

public class FaceBook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Home page=new Home(driver);
		page.creClick();
		page.firstName();
		page.lastName();
		page.nameEmail();
		page.password();
		page.genderName();
		page.selectDate();
		page.selectmonth();
		page.selectYear();
		
	}

}
