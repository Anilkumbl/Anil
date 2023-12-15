package Handling_Pop_Up;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Window;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Seleniumpage_Switch {

	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.selenium.dev/");
		List<WebElement> ele = driver.findElements(By.xpath("//li[.='Documentation']|//li[.='Downloads']|//li[.='Projects']"));
        System.out.println(ele.size());
		Actions act=new Actions(driver);
         Robot r=new Robot();
        for (WebElement w: ele) {
		act.contextClick(w).perform();
	      r.keyPress(KeyEvent.VK_T);
	      r.keyRelease(KeyEvent.VK_T);
        }
        Set<String> wh = driver.getWindowHandles();
        ArrayList<String>l=new ArrayList<String>(wh);
		driver.switchTo().window(l.get(2));
for (String s :wh) {
	driver.switchTo().window(s);
	driver.close();
	Thread.sleep(2000);
}
	}

}
