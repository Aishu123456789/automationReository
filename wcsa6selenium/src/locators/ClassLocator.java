package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassLocator {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		//switch the control to active element
		driver.switchTo().activeElement().sendKeys("chandler bing",Keys.ENTER);
		driver.findElement(By.className("lNPNe")).click();
		Thread.sleep(5000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().refresh();
		
		driver.switchTo().activeElement().sendKeys("joey tribbiani",Keys.ENTER);
		driver.findElement(By.className("lNPNe")).click();
		Thread.sleep(5000);

		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().refresh();
		driver.switchTo().activeElement().sendKeys("Monica Gelle",Keys.ENTER);
		driver.findElement(By.className("lNPNe")).click();
		Thread.sleep(5000);
		driver.close();
	}

}
