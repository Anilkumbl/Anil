package WebElement;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Drog_drop_Action {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "./Drivers/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		WebElement a = driver.findElement(By.xpath("//div[@id='box3']"));
		WebElement b = driver.findElement(By.xpath("//div[@id='box103']"));
		Actions act=new Actions(driver);
		act.dragAndDrop(a,b).perform();
		driver.quit();
	}

}
