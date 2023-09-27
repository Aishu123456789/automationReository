package framePackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleMap {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
	driver.get("https://www.google.com/");
	//click on google app
	driver.findElement(By.xpath("//a[@aria-label='Google apps']")).click();
	//click on google map
	 WebElement map = driver.findElement(By.name("app"));
	driver.switchTo().frame(map);
	 WebElement gmap = driver.findElement(By.xpath("//span[@style='background-position: 0 -1044px;']"));
	 gmap.click();
	
}
}
