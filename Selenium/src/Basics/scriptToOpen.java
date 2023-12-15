package Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class scriptToOpen {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver"
				,"./Drivers/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://demoapps.qspiders.com/");
		Thread.sleep(2000);
       driver.findElement(By.cssSelector("input[id='name']")).sendKeys("anil");
       Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[id='email']")).sendKeys("anil@12");
       driver.quit();
	}

}
