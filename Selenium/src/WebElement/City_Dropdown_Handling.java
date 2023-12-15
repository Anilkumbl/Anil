package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class City_Dropdown_Handling {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver",
				"./Drivers/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("file:///C:/Users/HP/OneDrive/Desktop/City_Drop_Down.html");
		Thread.sleep(2000); 
		WebElement drop_down=driver.findElement(By.xpath("//select[@id='city_dropdown']"));
	     Select sel=new Select(drop_down);
	     Thread.sleep(2000); 
	     sel.selectByIndex(0);
	     Thread.sleep(2000); 
	     sel.selectByValue("B");
	     Thread.sleep(2000); 
	     sel.selectByVisibleText("Goa");
	     driver.quit();
	     
	}

}
