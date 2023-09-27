package MethodsOfWebelement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetLocation {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Point loginButton = driver.findElement(By.xpath("//button[text()=' Login ']")).getLocation();
		 int xaxis = loginButton.getX();
		 int yaxis = loginButton.getY();
		 Thread.sleep(2000);
		 System.out.println("This is the xaxis of Login button : "+xaxis);
		 System.out.println("This is the yaxis of Login button : "+yaxis);
		 Thread.sleep(2000);
		 driver.close();
	}

}
