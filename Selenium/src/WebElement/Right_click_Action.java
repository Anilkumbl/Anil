package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Right_click_Action {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "./Drivers/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		WebElement a = driver.findElement(By.xpath("//span[.='right click me']"));
		Actions act=new Actions(driver);
		act.contextClick(a).perform();
		driver.quit();
	}

}
