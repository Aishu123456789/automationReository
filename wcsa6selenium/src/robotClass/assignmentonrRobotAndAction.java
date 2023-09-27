package robotClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class assignmentonrRobotAndAction {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		driver.get("https://www.bluestone.com/");
		Thread.sleep(2000);
		driver.findElement(By.id("denyBtn")).click();
		 WebElement watchJwellery = driver.findElement(By.xpath("//a[text()='Watch Jewellery ']"));
		 Actions act = new Actions(driver);
		 act.moveToElement(watchJwellery).perform();
		   WebElement band = driver.findElement(By.xpath("//a[text()='Band']"));
		   act.click(band).perform();
		 
	}

}
