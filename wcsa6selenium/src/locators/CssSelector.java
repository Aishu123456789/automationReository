package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelector {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/accounts/login/");
		Thread.sleep(6000);
		//cssSelector-   tagname [atrribute name='attribute value']
		driver.findElement(By.cssSelector("input[aria-label='Password']")).sendKeys("i dont know",Keys.ENTER);
		Thread.sleep(6000);
		driver.close();
	}

}
//$-->ending character
//*-->any character
//^-->starting character
//input[name^='p']
//input[name*='er']
//button[type$='it']