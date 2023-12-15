package QSP;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class RunnerScript extends GenericScript {
	@Test
	public void vlaidLogin()
	{
		driver.findElement(By.id("email")).sendKeys("anil");
	}
	
}
