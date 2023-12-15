package QSP;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class GenericScript {
  public WebDriver driver;
	@BeforeMethod
  public void openAppln()
  {
	System.setProperty("webdriver.gecko.driver","./Drivers/geckodriver.exe");
	driver=new FirefoxDriver();
	driver.get("https://www.amazon.in/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
  }
	@AfterMethod
	public void closeAppln()
	{
		driver.close();
	}
}
