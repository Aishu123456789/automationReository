package MethodsOfWebelement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetSize {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Dimension loginButton1 = driver.findElement(By.xpath("//button[text()=' Login ']")).getSize();
		int hight = loginButton1.getHeight();
		int width = loginButton1.getWidth();
		Thread.sleep(2000);
		System.out.println(hight);
		System.out.println(width);
       driver.close();
}
}