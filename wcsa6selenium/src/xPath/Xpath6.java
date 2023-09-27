package xPath;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath6 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//launch flipcart
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		//handle hidden division popup
		//driver.findElement(By.xpath("//button[text()='✕']"));
		//identify seaarch box
		Thread.sleep(2000);
		driver.findElement(By.name("q")).sendKeys("mobiles",Keys.ENTER);
		//identify search icon
		Thread.sleep(2000);
		System.out.println(driver.findElement(By.xpath("(//div[@class='_4rR01T']/ancestor::div[@class='_3pLy-c row']/descendant::div[@class='_30jeq3 _1_WHN1'])[1]")).getText());
		Thread.sleep(2000);
		driver.quit();
	}

}
