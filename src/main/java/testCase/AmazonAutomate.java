package testCase;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import pageObject.Amazon;

public class AmazonAutomate {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		Amazon azh=new Amazon(driver);
		azh.dropDown();
		azh.select();
		azh.enterData();
		azh.magClick();
		Thread.sleep(2000);
		azh.check();
		Actions action = new Actions(driver);
		WebElement searching=driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		action.keyDown(Keys.CONTROL).sendKeys("a").perform();
		Action act= action.moveToElement(searching).click()
				          .keyDown(Keys.CONTROL)
				          .sendKeys("a")
				          .keyUp(Keys.CONTROL)
				          .keyDown(Keys.DELETE).build();
	     act.perform();
	     Thread.sleep(2000);
	     azh.enterText();
	     azh.magClick(); 
		
		 driver.quit();
	}

}
