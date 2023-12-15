package WebElement;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import javax.swing.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import net.bytebuddy.dynamic.scaffold.inline.AbstractInliningDynamicTypeBuilder;

public class Chrome_langauge_Action {

	

	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	    driver.get("https://www.google.com/");
	    Thread.sleep(2000);
	    WebElement a= driver.findElement(By.xpath("//a[text()='ಕನ್ನಡ']"));
	   Actions act= new Actions(driver);
	   act.contextClick(a).perform();
	   Thread.sleep(2000);
	   Robot r=new Robot();	
	   r.keyPress(KeyEvent.VK_T);
	   r.keyRelease(KeyEvent.VK_T);
	   
	}

}
