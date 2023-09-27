package assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SynchronizationActitime {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		driver.get("http://aishwarya/login.do");
	    String pageTitle = driver.getTitle();
	
	    String ptitile ="actiTIME - Login";
	    if(ptitile.equals(ptitile))
	    {
	    	driver.findElement(By.name("username")).sendKeys("admin");
	    	driver.findElement(By.name("pwd")).sendKeys("manager");
	    	driver.findElement(By.id("loginButton")).click();
	    }
	    else
	    {
	    	System.out.println("invalid page title");
	    }
	    
		String hptitle="actiTIME - Enter Time-Track";
		String hptitle1 = driver.getTitle();
		if(hptitle.equals(hptitle1))
		{
			driver.findElement(By.xpath("//a[text()='Logout']")).click();
		}
		
	}

}
