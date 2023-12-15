package Drop_down;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Drop_downAssignment_inDemoApps {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "./Drivers/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://demoapps.qspiders.com/dropdown");
		Thread.sleep(2000);
          WebElement drop_down=driver.findElement(By.id("//select[@id='select3']"));
        // Select sel=new Select(drop_down);
		//sel.selectByIndex(1);
        //driver.quit();
	}

}
