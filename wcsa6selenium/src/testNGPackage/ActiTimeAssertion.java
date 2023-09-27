package testNGPackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class ActiTimeAssertion {
	static WebDriver driver;
  @Test
  public void loginMethod() {
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	  driver.get("http://aishwarya/login.do");
	  SoftAssert sa = new SoftAssert();
	  sa.assertEquals(driver.getTitle(), "title");
	  
	  driver.findElement(By.name("username")).sendKeys("admin");
	  driver.findElement(By.name("pwd")).sendKeys("manager");
	  driver.findElement(By.id("loginButton")).click();
	  
	  String titleOfPage = "actiTIME - Enter Time-Track";
	  Assert.assertEquals(driver.getTitle(), titleOfPage);
	  
	 WebElement logout = driver.findElement(By.partialLinkText("Logout"));
	 Assert.assertEquals(logout.isDisplayed(), true);  //hard assert
	 logout.click();
	 sa.assertAll();
  }
}
