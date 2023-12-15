package Basics;

import org.apache.commons.exec.launcher.CommandLauncherImpl;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
;

public class Demo5 {

    public static void main(String[] args) throws InterruptedException {
    	 System.setProperty("webdriver.gecko.driver",
    			 "./Drivers/geckodriver.exe");
         WebDriver driver=new FirefoxDriver();
         driver.get("https://www.facebook.com/");
       Thread.sleep(3000);
//  driver.findElement(By.id("email")).sendKeys("MSJYKJYTNH@gmail.com");
//  Thread.sleep(3000);
//  driver.findElement(By.id("pass")).sendKeys("JYKJSYUJ5YH");
//  Thread.sleep(3000);
//  driver.findElement(By.name("login")).click();
//  Thread.sleep(3000);
   driver.findElement(By.linkText("Forgotten password?")).click();
  driver.quit();
    }
}
