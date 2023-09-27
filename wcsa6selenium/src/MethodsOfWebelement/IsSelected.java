package MethodsOfWebelement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsSelected {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
	driver.get("http://aishwarya/login.do");
	driver.findElement(By.name("remember")).click();
	//WebElement checkbox = driver.findElement(By.name("remember"));
	//boolean result = checkbox.isSelected();
	//System.out.println(result);
	WebElement result1 = driver.findElement(By.name("remember"));
	boolean chkbox1 = result1.isSelected();
	Thread.sleep(2000);
	System.out.println(chkbox1);
	Thread.sleep(2000);
	driver.close();	
}
}
