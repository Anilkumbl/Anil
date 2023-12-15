package Handling_Pop_Up;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TabSwitching {

	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.get("https://www.facebook.com/");
        WebElement ele = driver.findElement(By.xpath("//a[.='ಕನ್ನಡ']"));
         Actions act=new Actions(driver);
         act.contextClick(ele).perform();
         Robot r=new Robot();
         r.keyPress(KeyEvent.VK_T);
         r.keyRelease(KeyEvent.VK_T);
         Set<String> allwh = driver.getWindowHandles();
         ArrayList<String>l=new ArrayList<String>(allwh);
         String wh = l.get(1);
         driver.switchTo().window(wh);
         Thread.sleep(2000);
         driver.close();
         Thread.sleep(2000);
         driver.quit();
	}

}
