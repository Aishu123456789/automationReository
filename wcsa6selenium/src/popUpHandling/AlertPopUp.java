package popUpHandling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopUp {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
	driver.get("file:///C:/Users/Administrator/OneDrive/Desktop/Web%20Element/alert%20popup1.html");
	//generate the alert popup
	driver.findElement(By.xpath("//button[text()='click me!']")).click();
	//to handle popup
	Thread.sleep(2000);
	//driver.switchTo().alert().accept();
	//driver.switchTo().alert().dismiss();
	System.out.println(driver.switchTo().alert().getText());
	driver.switchTo().alert().accept();
	Thread.sleep(2000);
	driver.close();
}
}
