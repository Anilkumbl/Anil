package Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Root_Maps {

	public static void main(String[] args) throws InterruptedException {
      System.setProperty("webdriver.gecko.driver",
    		  "./Drivers/geckodriver.exe");
      WebDriver driver=new FirefoxDriver();
        driver.get("https://www.google.com/maps/@12.9989812,77.5504667,15z?entry=ttu");
	   Thread.sleep(2000);
        driver.findElement(By.xpath("//button[@id='hArJGc']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@dir='ltr'and@class='tactile-searchbox-input'and@placeholder='Choose destination...']")).sendKeys("bengaluru");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@dir='ltr'and@class='tactile-searchbox-input'and@placeholder='Choose starting point, or click on the map...']")).sendKeys("amarapuram");
        Thread.sleep(2000);
        driver.quit();
	}

}
