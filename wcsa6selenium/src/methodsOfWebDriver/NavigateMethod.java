package methodsOfWebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateMethod {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	//use navigate method to launch the web application
	driver.navigate().to("https://www.google.com");
	Thread.sleep(2000);
	//use navigate to perform backword operation
	driver.navigate().back();
	Thread.sleep(2000);
	//use navigate to perform forword operation
	driver.navigate().forward();
	Thread.sleep(2000);
	//use navigate to perform refresh operation
	driver.navigate().refresh();
	Thread.sleep(2000);
	driver.close();
}
}
