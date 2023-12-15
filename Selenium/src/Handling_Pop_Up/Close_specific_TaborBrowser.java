package Handling_Pop_Up;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Close_specific_TaborBrowser {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.get("https://skpatro.github.io/demo/links/");
        Thread.sleep(2000);
        driver.findElement(By.name("NewWindow")).click();
        Thread.sleep(2000);
        String p_id = driver.getWindowHandle();
        Set<String> allwh = driver.getWindowHandles();
        for (String wh :allwh) {
			driver.switchTo().window(wh);
			String title = driver.getTitle();
			 Thread.sleep(2000);
			 if (title.equals("About me - qavalidation"))
			 {
			  driver.close();	
			}
		}
	}

}
