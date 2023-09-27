package MethodsOfWebelement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendKeysClickClearMethod{
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://aishwarya/login.do");
		//identify username textbox and pass invalid input
		driver.findElement(By.name("username")).sendKeys("admin123");
		//identify password textbox and pass invalid input
		driver.findElement(By.name("pwd")).sendKeys("manager123");
		//click on login button
		driver.findElement(By.id("loginButton")).click();
		Thread.sleep(2000);
		//identify username textbox and clear input
		driver.findElement(By.name("username")).clear();
		Thread.sleep(2000);
		driver.close();
	}

}
//using first way we will get exception StaleElementReferenceException
//identify username textbox and pass invalid input
		//WebElement usernameTB = driver.findElement(By.name("username"));
		//usernameTB.sendKeys("admin123");
		//identify password textbox and pass invalid input
		//WebElement passwordTB = driver.findElement(By.name("pwd"));
		//passwordTB.sendKeys("manager123");
		//click on login button
		//driver.findElement(By.id("loginButton")).click();
		//Thread.sleep(2000);
		//usernameTB.clear();