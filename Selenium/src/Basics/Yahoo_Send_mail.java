package Basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Yahoo_Send_mail {

	public static void main(String[] args) {
       System.setProperty("webdriver.gecko.driver",
    		  "./Drivers/geckodriver.exe");
       WebDriver driver=new FirefoxDriver();
       driver.get("https://login.yahoo.com/?.src=ym&.intl=in");
	}

}
