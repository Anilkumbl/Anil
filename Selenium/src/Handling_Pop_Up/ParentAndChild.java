package Handling_Pop_Up;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ParentAndChild {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.get("https://skpatro.github.io/demo/links/");
        Thread.sleep(2000);
         driver.findElement(By.name("NewWindow")).click();
        Thread.sleep(2000);
        Set<String> al=driver.getWindowHandles();
        System.out.println(al.size());
        for (String ab: al) {
			driver.switchTo().window(ab);
			System.out.println(driver.getTitle());
			Thread.sleep(2000);
			driver.close();
			
		}
               

	}

}
