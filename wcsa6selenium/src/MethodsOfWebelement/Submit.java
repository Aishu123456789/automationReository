package MethodsOfWebelement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Submit {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		driver.get("https://www.instagram.com/accounts/login/");
		WebElement a = driver.findElement(By.xpath("//button[@class='_acan _acap _acas _aj1-']"));
		Thread.sleep(2000);
		 a.submit();
		Thread.sleep(4000);
		driver.close();

}
}
