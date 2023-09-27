package framePackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BlueStoneFrame {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
	driver.get("https://www.bluestone.com/");
	// handle hidden division pop up
	driver.findElement(By.id("denyBtn")).click();
	//this chatbox is design under the frame
	//handle frame first by identifu it
	//driver.switchTo().frame(3); //we handled frame by using window
	//driver.switchTo().frame("fc_widget");//we handled frame by using name and id
	 WebElement frameEle = driver.findElement(By.id("fc_widget"));
	 driver.switchTo().frame(frameEle);
	 WebElement chatbox = driver.findElement(By.id("chat-icon"));
	 chatbox.click();
	 //switch controls to main page
	// driver.switchTo().defaultContent();
	 driver.switchTo().parentFrame();//switch control to parent frame
	 driver.findElement(By.id("chat-fc-name")).sendKeys("aishwarya");
	 driver.findElement(By.id("chat-fc-email")).sendKeys("aishwaryakalokhe08@gmail.com");
	 driver.findElement(By.id("chat-fc-phone")).sendKeys("9730121632");
}
}
