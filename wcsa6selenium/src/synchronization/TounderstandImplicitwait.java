package synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TounderstandImplicitwait {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		driver.get("https://www.shoppersstack.com/");
		//click any one of the product
		driver.findElement(By.xpath("//span[text()='GUDPIG']")).click();
		//idrntify box of pin code and sendkeys
		driver.findElement(By.id("Check Delivery")).sendKeys("423201");
		//click on check button
		WebElement checkbutton = driver.findElement(By.id("Check"));
		
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(checkbutton)).click();
	}

}
