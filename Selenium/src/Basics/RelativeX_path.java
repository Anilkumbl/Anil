package Basics;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class RelativeX_path {

	public static void main(String[] args) throws InterruptedException {
     System.setProperty("webdriver.gecko.driver",
    		 "./Drivers/geckodriver.exe");
     WebDriver driver=new FirefoxDriver();
//     driver.get("https://www.facebook.com/");
//      Thread.sleep(2000);
//      driver.findElement(By.xpath("//input[@id='email']")).sendKeys("anil");
//      Thread.sleep(2000);
//      driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("123");
//      Thread.sleep(2000);
//     driver.findElement(By.xpath("//button[@name='login']")).click();
     driver.get("https://www.youtube.com/");
     Thread.sleep(3000);
     //driver.findElement(By.xpath("")) 
     driver.quit();
      
	}

}
