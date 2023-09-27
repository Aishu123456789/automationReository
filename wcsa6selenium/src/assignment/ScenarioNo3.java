package assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class ScenarioNo3 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		driver.get("http://jqueryui.com/droppable/webpage");
		
		driver.findElement(By.linkText("Demos")).click();
		driver.findElement(By.linkText("Droppable")).click();
		Thread.sleep(2000);
		WebElement target = driver.findElement(By.id("droppable"));
		WebElement src = driver.findElement(By.xpath("//p[text()='Drag me to my target']"));
		Thread.sleep(2000);
		Actions act = new Actions(driver);
		act.dragAndDrop(src, target);
		
		
		
	}

}
