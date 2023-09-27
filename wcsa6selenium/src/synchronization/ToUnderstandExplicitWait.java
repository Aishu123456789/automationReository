package synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ToUnderstandExplicitWait {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//to apply explicit wait
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(45));
		driver.get("https://www.shoppersstack.com/");
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@id='electronics']")));
		driver.findElement(By.xpath("//a[@id='electronics']")).click();
		driver.findElement(By.xpath("//a[text()='Laptops ']")).click();
		
	}

}
