package MethodsOfWebelement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAttribute {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		//launch orange hrm 
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		//username textbox class value
		String av = driver.findElement(By.name("username")).getAttribute("class");
		System.out.println(av);
		Thread.sleep(2000);
		driver.close();
	}
}
