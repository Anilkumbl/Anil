package Synchronisation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.firefox.FirefoxDriver;

import okio.Timeout;

public class Implicity_Wait {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "./Drivers/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        driver.get("https://www.amazon.in/");
        driver.findElement(By.xpath("//a[text()='Fresh']")).click();
        driver.findElement(By.xpath("//a[text()='Amazon miniTV']")).click();
        driver.findElement(By.xpath("//a[text()='Mobiles']")).click();
	
		
	}

}
