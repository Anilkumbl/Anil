package Basics;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.GeckoDriverInfo;
import org.openqa.selenium.remote.server.handler.GetAlertText;

public class Demo2 {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.gecko.driver", "./Drivers/geckodriver.exe/");
	WebDriver  driver=new FirefoxDriver();
	driver.get("https://www.facebook.com/");
	Thread.sleep(2000);
	driver.findElement(By.id("email")).sendKeys("anilkumbleh@gmail.com");
	Thread.sleep(2000);
	driver.findElement(By.name("pass")).sendKeys("Anil@123");
	Thread.sleep(2000);
	driver.findElement(By.name("login")).click();
	driver.getTitle();
	Thread.sleep(2000);
	//driver.findElement(By.partialLinkText("for")).click();
}
}