package WebElement;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Action_On_Browser {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver",
				"./Drivers/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		//driver.navigate().to("https://www.firefoxe.com");
		driver.navigate().to("https://www.firefox.com");
		Thread.sleep(2000);
		driver.navigate().to("https://www.facebook.com/");
		Thread.sleep(2000);
        driver.navigate().back();
        Thread.sleep(2000);
        driver.navigate().forward();
        Thread.sleep(2000);
        driver.navigate().refresh();
        Thread.sleep(2000);
		driver.quit();
	}

}
