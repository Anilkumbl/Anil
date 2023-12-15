package Basics;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Xpath {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver",
    		 "./Drivers/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.youtube.com");
		Thread.sleep(2000);
		driver.quit();
	}
     
	}


