package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover_action {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "./Drivers/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
        driver.get("https://www.myntra.com/");
        Thread.sleep(2000);
	   WebElement ele = driver.findElement(By.xpath("(//a[text()='Men'])[1]"));
	   Actions act=new Actions(driver);
	   act.moveToElement(ele).perform();
	   driver.quit();
	   }

}
