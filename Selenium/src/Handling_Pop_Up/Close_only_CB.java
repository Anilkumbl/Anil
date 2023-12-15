package Handling_Pop_Up;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Close_only_CB {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.get("https://skpatro.github.io/demo/links/");
       driver.findElement(By.name("NewWindow")).click();
        String p_id = driver.getWindowHandle();
        Set<String> allwh = driver.getWindowHandles();
        System.out.println(allwh.size());
       allwh.remove(p_id);
    System.out.println(allwh.size());
    for (String wh : allwh) {
    	driver.switchTo().window(wh);
		
	}
	}

}
