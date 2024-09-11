package testCase;

import java.time.Duration;

import org.apache.poi.sl.draw.geom.GuideIf.Op;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pageObject.OpencartHome;

public class OpenCart {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		//long start = System.currentTimeMillis();
		driver.get("https://www.opencart.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		OpencartHome oph= new OpencartHome(driver);
		oph.regAccount();
		Thread.sleep(2000);
		//oph.userName();
		//long finish = System.currentTimeMillis();
		//long totalTime = finish - start;
       // System.out.println("Total Page Load Time: " + totalTime + " milliseconds");
		//driver.close();
	}

}
