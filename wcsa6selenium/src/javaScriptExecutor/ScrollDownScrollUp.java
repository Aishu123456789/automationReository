package javaScriptExecutor;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollDownScrollUp {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
	
	driver.get("https://www.selenium.dev/");
	JavascriptExecutor jsc=(JavascriptExecutor)driver;
	Thread.sleep(4000);
	jsc.executeScript("window.scrollBy(0,500)");
	Thread.sleep(4000);
	jsc.executeScript("window.scrollBy(0,-500)");
	
}
}
