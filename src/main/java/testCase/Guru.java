package testCase;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.sikuli.api.Screen;

import pageObject.HomePage;

public class Guru {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/v4/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		HomePage  page=new HomePage(driver);
		page.uname();
		page.password();
		page.buttonClick();
		Thread.sleep(1000);
		page.addname();
		Actions act=new Actions(driver);
        act.doubleClick().perform(); 
		
		//Screen s=new Screen();
		
        page.firstName();
        page.dateOfBirth();
        page.tempAddress();
        page.city();
        Thread.sleep(5000);
        page.state();
        page.pin();
        page.Phn();
        page.mail();
        page.namePass();

		
		
		
	}

}
