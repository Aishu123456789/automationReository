package methodsOfWebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetPageSource {
	//it is used to get the source code of current webpage
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://aishwarya/login.do");
		String lohinPageSourceCode = driver.getPageSource();
		System.out.println(lohinPageSourceCode);
		Thread.sleep(2000);
		driver.close();
	}

}
