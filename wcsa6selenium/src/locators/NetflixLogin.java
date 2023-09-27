package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NetflixLogin {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.netflix.com/in/Login");
	//identify email or phone no text box
	driver.findElement(By.id("id_userLoginId")).sendKeys("aishwarya");
	//identify the password textbox
	Thread.sleep(2000);
	driver.findElement(By.id("id_password")).sendKeys("12345");
	//identify the sign in button
	driver.findElement(By.xpath("//button [text()='Sign In']")).click();
	Thread.sleep(2000);
	driver.close();
    
}
}
