package xPath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SpiceJet {
	public static void main(String[] args) throws InterruptedException {
		//handle notification popoup
		
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--disable-notifications");
		//-----------------------------------------------------------------
		WebDriver driver=new ChromeDriver(co);
		driver.manage().window().maximize();
		driver.get("https://www.spicejet.com/");
		//identify departure
		//driver.findElement(By.xpath(""))
		
		
		
		driver.findElement(By.xpath("(//input[@class='css-1cwyjr8 r-homxoj r-ubezar r-10paoce r-13qz1uu'])[1]")).sendKeys("pune");
		driver.findElement(By.xpath("(//input[@class='css-1cwyjr8 r-homxoj r-ubezar r-10paoce r-13qz1uu'])[2]")).sendKeys("Kochi");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='css-76zvg2 r-jwli3a r-ubezar r-16dba41']")).click();
		driver.findElement(By.xpath("//div[text()='Select Date']")).click();
		driver.findElement(By.xpath("(//div[@class='css-76zvg2 r-jwli3a r-ubezar r-16dba41'])[2]")).click();
		
}
}