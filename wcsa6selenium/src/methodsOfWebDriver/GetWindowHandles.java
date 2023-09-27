package methodsOfWebDriver;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetWindowHandles {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.get("http://omayo.blogspot.com/");
		//address of parent window or browser
		String parentHandle = driver.getWindowHandle();
		Thread.sleep(3000);
		//scroll till open a popup window link
		WebElement childBrowser = driver.findElement(By.partialLinkText(""));
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		
		
	}

}
