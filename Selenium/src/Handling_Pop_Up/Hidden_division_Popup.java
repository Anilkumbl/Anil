package Handling_Pop_Up;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Hidden_division_Popup {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "./Drivers/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.redbus.com/");
		Thread.sleep(2000);
		driver.findElement(By.id("onward_cal")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[@class='DayTiles__CalendarDaysSpan-sc-14em0t0-1 xaHaF' and .='25']	")).click();
	}

}
