package dynamicScreenShot;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestCase extends BaseTest{
  public void loginMethod() {
	  SoftAssert sa = new SoftAssert();
	  sa.assertEquals("", "");
	  driver.findElement(By.name("username")).sendKeys("admin");
	  driver.findElement(By.name("pwd")).sendKeys("manager");
	  driver.findElement(By.id("loginButton")).click(); 
  }
  

}
