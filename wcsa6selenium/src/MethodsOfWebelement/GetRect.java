package MethodsOfWebelement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetRect {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Rectangle loginButton1 = driver.findElement(By.xpath("//button[text()=' Login ']")).getRect();
		int hight = loginButton1.getHeight();
		int width = loginButton1.getWidth();
		int x = loginButton1.getX();
		int y = loginButton1.getY();
		System.out.println(hight);
		System.out.println(width);
		System.out.println(x);
		System.out.println(y);
		Thread.sleep(2000);
       driver.close();
}

}
