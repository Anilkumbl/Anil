package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class DemoApps_mouse_action {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "./Drivers/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://demoapps.qspiders.com/");
		WebElement srg = driver.findElement(By.xpath("//section[text()='Mouse Actions']"));
          Actions act=new Actions(driver);
          act.moveToElement(srg).perform();
	}

}
