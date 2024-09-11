package testCase;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import pageObject.DrybarHome;

public class DryBar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://www.drybar.com/website");
		Actions act=new Actions(driver);
        act.doubleClick().perform();
		DrybarHome drh=new DrybarHome(driver);
		drh.acceptAll();
		Actions action = new Actions(driver);
		WebElement product= driver.findElement(By.xpath("(//span[text()='Hair Products'])[1]"));
		action.moveToElement(product).perform();
		drh.shamp();
		System.out.println(driver.getCurrentUrl());
		
		
	}

}
