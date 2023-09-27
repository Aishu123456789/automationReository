package methodsOfWebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class QuitMethod {
	public static void main(String[] args) throws InterruptedException {
		//parent browser
		WebDriver driver=new ChromeDriver();
		//maximize browser
		driver.manage().window().maximize();
		//to launch WebApplication
		driver.get("http://omayo.blogspot.com/");
		//hold for 2 seconds
		Thread.sleep(2000);
		//launch the child browser
		//tag[text()=web element name
		driver.findElement(By.xpath("//a[text()='Open a popup window']")).click();
		Thread.sleep(2000);
		driver.quit();

	}
}