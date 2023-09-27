package popUpHandling;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConfirmationPopUp {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
	driver.get("file:///C:/Users/Administrator/OneDrive/Desktop/Web%20Element/confirmation.html");
	//generate confirmation pop up
	driver.findElement(By.xpath("//input[@type='submit']")).click();
	//handle confirmation popup by using switchto()
     Alert al = driver.switchTo().alert();
     Thread.sleep(2000);
     //al.accept();
     //al.dismiss();
     System.out.println(al.getText());
     al.accept();
	Thread.sleep(2000);
	driver.close();
}
}
