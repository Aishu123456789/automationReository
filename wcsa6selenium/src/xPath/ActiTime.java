package xPath;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiTime {
public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	Thread.sleep(2000);
	driver.get("http://aishwarya/login.do");
	Thread.sleep(2000);
	driver.findElement(By.name("username")).sendKeys("admin");
	Thread.sleep(2000);
	driver.findElement(By.name("pwd")).sendKeys("manager");
	Thread.sleep(2000);
	driver.findElement(By.id("loginButton")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//div[text()='Tasks']/ancestor::td[@class='navItem relative']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//div[text()='Reports']/ancestor::td[@class='navItem relative']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//div[text()='Users']/ancestor::td[@class='navItem relative']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//div[text()='Work Schedule']/ancestor::td[@class='navItem relative']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//div[text()='Settings']/ancestor::td[@class='navItem relative']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//a[text()='Logout']")).click();
	Thread.sleep(2000);
	driver.close();
   
}
}