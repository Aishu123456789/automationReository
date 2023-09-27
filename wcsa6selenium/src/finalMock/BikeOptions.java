package finalMock;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BikeOptions {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.google.com/");
		driver.switchTo().activeElement().sendKeys("bike");
		List<WebElement> bikeOption = driver.findElements(By.xpath("//div[@class='pcTkSc']"));
		for(int i=1;i<11;i++)
		{

			System.out.println(bikeOption.get(i).getText());
			Thread.sleep(2000);
		}
	}

}
