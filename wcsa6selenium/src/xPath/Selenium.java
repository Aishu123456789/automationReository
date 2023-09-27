package xPath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.selenium.dev/");
		driver.findElement(By.xpath("(//a[@class='nav-link'])[1]"));//using index value
		
}
}
//p[@class='card-title fw-bold h6' and (text()='Java') or (@class='card-title fw-bold h6') and (text()='Python')]