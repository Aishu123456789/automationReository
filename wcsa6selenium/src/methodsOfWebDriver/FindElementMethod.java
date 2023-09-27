package methodsOfWebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementMethod {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://aishwarya/login.do");
	//identify username textbox and passs the input as admin
	//to identify we use findelement method
	//once the webelement fount it will returns webelement (I) and address of webelement
	 WebElement usenametextbox = driver.findElement(By.name("username"));
	 usenametextbox.sendKeys("admin");
	 System.out.println(usenametextbox);
}
}

//it is use to find single webelement
//it returns the address of webelement when webelements found
//if not found it will throw exception NoSuchElementException
//return type is webelement interface