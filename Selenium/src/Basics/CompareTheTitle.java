package Basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CompareTheTitle {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","./Drivers/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("anilkumbleh@gmail.com");
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("Anil@123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		driver.quit();
	}

}
