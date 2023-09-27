package xPath;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipcart {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
driver.get("https://www.flipkart.com/?s_kwcid=AL!739!3!582822158294!e!!g!!flipkart&gclsrc=aw.ds&&semcmpid=sem_8024046704_brand_exe_buyers_goog&gclid=Cj0KCQjw5f2lBhCkARIsAHeTvlic26jkaA1LgjLcPrQVfsDHnup8n2QUZFKsrJqdvQfYbZNPnvnCwbYaAuY9EALw_wcB");
Thread.sleep(5000);
driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
Thread.sleep(2000);
driver.findElement(By.xpath("//input[@title='Search for products, brands and more']")).sendKeys("laptop",Keys.ENTER);
driver.findElement(By.xpath("(//div[@class='_4rR01T'])[1]")).click();
}
}
