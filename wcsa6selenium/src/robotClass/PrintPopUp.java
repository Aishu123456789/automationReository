package robotClass;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintPopUp {
public static void main(String[] args) throws AWTException, InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
	driver.get("https://www.selenium.dev/");
	Thread.sleep(2000);
	//press ctrl and p to generate print popup
	 Robot robot = new Robot();
	 //to press control 
	 robot.keyPress(KeyEvent.VK_CONTROL);
	 //to press p button
	 robot.keyPress(KeyEvent.VK_P);
	 //to release p
	 robot.keyRelease(KeyEvent.VK_P);
	 //to release ctrl
	 robot.keyRelease(KeyEvent.VK_CONTROL);
	 Thread.sleep(2000);
	 //switch control to cancel button
	 robot.keyPress(KeyEvent.VK_TAB);
	 robot.keyRelease(KeyEvent.VK_TAB);
	 Thread.sleep(5000);
	 //PRESS ENTER
	 robot.keyPress(KeyEvent.VK_ENTER);
	 robot.keyRelease(KeyEvent.VK_ENTER);
	 Thread.sleep(5000);
	 driver.close();
	 
}
}
