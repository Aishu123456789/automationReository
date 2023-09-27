package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AirVistara {
	public static void main(String[] args) throws InterruptedException {
		
		 ChromeOptions co = new ChromeOptions();
		 co.addArguments("--disable-notifications");
		
		WebDriver driver=new ChromeDriver(co);
		driver.manage().window().maximize();
		driver.get("https://www.airvistara.com/in/en/plantravel/flight-booking");
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//input[@placeholder='Select Departure City']")).sendKeys("pune",Keys.ENTER);
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//input[@placeholder='Select Arrival City']")).sendKeys("Kochi",Keys.ENTER);
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("(//p[@class='label'])[1]")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//li[text()='2 Adults']")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//input[@placeholder='Select Departure Date']")).click();
	    Thread.sleep(3000);
	   // driver.findElement(By.xpath("//div[text()=' Aug ']")).click();
	   // Thread.sleep(2000);
	   driver.findElement(By.xpath("//td[@class=' calanders everymundo ui-datepicker-current-day']")).click();
	   Thread.sleep(4000);
	   driver.findElement(By.xpath("//a[text()='26']")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//button[@id='pb-searchflight' and (text()='Search Flights')]")).click();
	}
	
}
