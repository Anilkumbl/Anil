package Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo {
public static void main(String[]args) {
System.setProperty("webdriver.gecko.driver", 
		"./Drivers/geckodriver.exe");
WebDriver driver=new FirefoxDriver();
driver.get("https://www.facebook.com/");
//driver.findElement(By.tagName("input")).sendKeys("hii");
//driver.findElement(By.id("a1"));	
//driver.findElement(By.name("n1"));
driver.findElement(By.linkText("Forgotten password?")).click();
}

}
