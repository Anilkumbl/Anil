package javaScriptexecuter;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScroleDown_UP {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		Thread.sleep(2000);
		JavascriptExecutor js=(JavascriptExecutor)driver;
		WebElement ele = driver.findElement(By.xpath("//a[.='Brazil']"));
		   Point l = ele.getLocation();
             int X = l.getX();
             int y = l.getY();
             System.out.println(X);
             System.out.println(y);
             Thread.sleep(2000);
             js.executeScript("window.scrollBy("+X+","+y+")");
             Thread.sleep(2000);
             ele.click();
	}
}
