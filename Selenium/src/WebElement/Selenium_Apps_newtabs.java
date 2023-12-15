package WebElement;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Selenium_Apps_newtabs {

	public static void main(String[] args) throws AWTException {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.selenium.dev/");
		List<WebElement> ele = driver.findElements(By.xpath("//a[.='Downloads']"
				+ "|//a[.='Documentation']|//a[.='Projects']|//a[.='Support']"));
		System.out.println(ele.size());
		Robot r=new Robot();
		Actions act=new Actions(driver);
       for (WebElement webElement : ele) {
		
		act.contextClick(webElement).perform();
		r.keyPress(KeyEvent.VK_T);
		r.keyRelease(KeyEvent.VK_T);
    	  	}
       r.keyPress(KeyEvent.VK_WINDOWS);
       r.keyPress(KeyEvent.VK_M);
       r.keyRelease(KeyEvent.VK_WINDOWS);
       r.keyRelease(KeyEvent.VK_M);
       driver.manage().window().maximize();
        
	}

}
