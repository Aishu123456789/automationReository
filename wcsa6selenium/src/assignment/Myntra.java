package assignment;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Myntra {
	public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
    driver.get("https://www.myntra.com/");
 // get the ADDRESS  of parent window
    String parent = driver.getWindowHandle();
    driver.findElement(By.xpath("//input[@class='desktop-searchBar']")).sendKeys("shoes for men");
    driver.findElement(By.xpath("//a[@class='desktop-submit']")).click();
    driver.findElement(By.xpath("//h4[text()='Men Clarkin Sneakers']/ancestor::li[@class='product-base']")).click();
  //get the address of parent and child window
    Set<String> allHandle = driver.getWindowHandles();
    for(String wh:allHandle)
    {
    	if(!parent.equals(wh))
    	{
    		driver.switchTo().window(wh);
    	}
    }
    //select size
    driver.findElement(By.xpath("(//p[@class='size-buttons-unified-size'])[2]")).click();
    //send pin code
    driver.findElement(By.xpath("//input[@placeholder='Enter pincode']")).sendKeys("411033");
    //click on check
    driver.findElement(By.xpath("//input[@class='pincode-check pincode-button']")).click();
    //click on add to bag
    driver.findElement(By.xpath("//span[contains(@class,'myntraweb-sprite pdp-w')]")).click();
    //click on bag
    driver.findElement(By.xpath("//span[contains(@class,'myntraweb-sprite desktop-iconB')]")).click();
    //handle popup
    driver.findElement(By.xpath("//div[contains(@class,'itemComponents-base-selectionIcon')]")).click();
    //click on remove
    driver.findElement(By.xpath("//button[@class='inlinebuttonV2-base-actionButton bulkActionStrip-desktopBulkRemove']")).click();
    driver.findElement(By.xpath("//button[@class='inlinebuttonV2-base-actionButton ']")).click();
    
    
    }
    
	}


