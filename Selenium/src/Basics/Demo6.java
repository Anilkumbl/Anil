package Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo6 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver",
				"./Drivers/geckodriver.exe");
       WebDriver driver=new FirefoxDriver();
       driver.get("https://www.facebook.com/");
       Thread.sleep(2000);
       WebElement pass = driver.findElement(By.cssSelector("input[ id='pass']"));
       Thread.sleep(2000);
       pass.sendKeys("dkiysjyk7ekysk");
       Thread.sleep(2000);
       driver.quit();
	}

}
