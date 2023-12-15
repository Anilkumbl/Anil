package Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Amajoncheckout {

	public static void main(String[] args) throws InterruptedException {
      System.setProperty("webdriver.gecko.driver", 
    		  "./Drivers/geckodriver.exe");
      WebDriver driver=new FirefoxDriver();
      driver.get("https://www.amazon.in/");
      Thread.sleep(2000);
      driver.findElement(By.xpath("//input[@type='text']")).sendKeys("oneplus nord ce 3 lite 5g");
      Thread.sleep(2000);
      driver.findElement(By.xpath("//input[@type='submit']")).click();
      Thread.sleep(2000);
      driver.findElement(By.xpath("//img[@src='https://m.media-amazon.com/images/I/61amb0CfMGL._AC_UY218_.jpg']")).click();
      Thread.sleep(2000);
      driver.quit();
	}

}
