package QSP;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class AmazonScript extends GenericScript {
 @Test
 public void search()
 {
	 driver.findElement(By.xpath("//a[.=\"Today's Deals\"]")).click();
 }
 @Test
 public void clici()
 {
	 driver.findElement(By.xpath("//a[.=\"Sell\"]")).click();
 }
}
