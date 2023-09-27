package xPath;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Contains {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/login/");
	Thread.sleep(2000);
    driver.findElement(By.xpath("//a[text()='Sign up for Facebook']")).click();
    Thread.sleep(2000);
    driver.findElement(By.xpath("//input[contains(@name,'firstname')]")).sendKeys("admin");
    Thread.sleep(2000);
    driver.findElement(By.xpath("//input[contains(@name,'lastname')]")).sendKeys("manager");
    Thread.sleep(2000);
    driver.findElement(By.xpath("//input[contains(@name,'reg_email__')]")).sendKeys("9999999999");
    Thread.sleep(2000);
    driver.findElement(By.xpath("//input[contains(@id,'password_step_input')]")).sendKeys("xxxxx");
    Thread.sleep(2000);
    driver.findElement(By.xpath("//select[contains(@name,'birthday_day')]")).click();
    Thread.sleep(2000);
    driver.findElement(By.xpath("//option[text()='8']")).click();
    Thread.sleep(2000);
    driver.findElement(By.xpath("//select[contains(@name,'birthday_month')]")).click();
    Thread.sleep(2000);
    driver.findElement(By.xpath("//option[text()='Dec']")).click();
    Thread.sleep(2000);
    driver.findElement(By.xpath("//select[contains(@name,'birthday_year')]")).click();
    driver.findElement(By.xpath("//option[text()='1995']")).click();
    Thread.sleep(2000);
    driver.findElement(By.xpath("//label[text()='Female']")).click();
    Thread.sleep(2000);
    driver.findElement(By.name("websubmit")).click();
}
}
//tagname[contains(@attribute name,'attribute value')] facebook signin