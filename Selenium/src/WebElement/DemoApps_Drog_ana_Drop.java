package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class DemoApps_Drog_ana_Drop {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "./Drivers/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://demoapps.qspiders.com/dragDrop?sublist=0");
		WebElement mobilecharger= driver.findElement(By.xpath("//div[text()='Mobile Charger']"));
		WebElement accesories = driver.findElement(By.xpath("//div[text()='Mobile Accessories']"));
		Actions act=new Actions(driver);
		act.dragAndDrop(mobilecharger, accesories);
	}

}
