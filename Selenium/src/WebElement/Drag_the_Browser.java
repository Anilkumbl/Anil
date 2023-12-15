package WebElement;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Drag_the_Browser {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver",
				"./Drivers/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.navigate().to("https://www.youtube.com/");
		Thread.sleep(2000);
		Point p=new Point(200, 300);
		driver.manage().window().setPosition(p);
		Thread.sleep(2000);
		driver.quit();
	}

}
