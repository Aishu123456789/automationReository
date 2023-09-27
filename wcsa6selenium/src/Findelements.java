import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Findelements {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.flipkart.com/");
	Thread.sleep(2000);
	//driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
	//Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@placeholder='Search for Products, Brands and More']")).sendKeys("laptop");
	Thread.sleep(2000);
    driver.findElement(By.xpath("//button[@aria-label='Search for Products, Brands and More']")).click();
    Thread.sleep(2000);
    //click on core i5
    driver.findElement(By.xpath("//div[text()='Core i5']")).click();
    Thread.sleep(2000);
    //click on brand
    driver.findElement(By.xpath("//div[text()='Brand']")).click();
    Thread.sleep(2000);
    //click on hp
    driver.findElement(By.xpath("//div[text()='HP']")).click();
    Thread.sleep(2000);
    //click on operating system
    driver.findElement(By.xpath("//div[text()='Operating System']")).click(); 
    Thread.sleep(2000);
    //click on windows 10
    driver.findElement(By.xpath("//div[text()='Windows 10']")).click();
    Thread.sleep(2000);
    //click on 4 and above
    driver.findElement(By.xpath("//div[text()='4★ & above']")).click();
    //identify all suggestions of laptop
    List<WebElement> allSuggestion = driver.findElements(By.xpath("//div[@class='_4rR01T']"));
    Thread.sleep(2000);
    //identify all suggestion for price.
    List<WebElement> allPricesugg = driver.findElements(By.xpath("//div[@class='_4rR01T']/ancestor::div[@class='_3pLy-c row']/descendant::div[@class='_30jeq3 _1_WHN1']"));
    Thread.sleep(2000);
    for(int i=0;i<allSuggestion.size();i++)
    {
    	String nameOfLaptop = allSuggestion.get(i).getText();
    	for(int j=i;j<=i;j++)
    	{
    		String priceOfLaptop = allPricesugg.get(i).getText();
    		System.out.print(nameOfLaptop +" :"+priceOfLaptop);
    		 Thread.sleep(2000);
    	}
    	System.out.println();
    }
    Thread.sleep(2000);
    driver.quit();
}
}
//core i5 ,hp ,window 11, customer rating 4 and above for that print list along with time
//select any one laptop inspect,findelements method,store that in variable,
//for loop to read list (int i=0;i<=var.size();i++)
//{string var2=var.get(i).getText();
//for{int j=1;j<=var2.size();j++}
//string }