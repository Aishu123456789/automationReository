package dynamicScreenShot;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BaseTest {
	static WebDriver driver;
  @BeforeMethod
  public void setUp (){
	 driver=new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	 driver.get("http://aishwarya/login.do");	 
  }
  //generic reusable method for take the screenshot of failed method
  public void screenshot_of_failedmethod(String failedMethodNmae)
  {
	TakesScreenshot ts=(TakesScreenshot)  driver;
	//ts.getScreenshotAs(OutputType.FILE);
	 //File e = new File("./ScreenShots"failedMethodNmae".png");
  }}
  