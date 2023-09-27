package methodsOfWebDriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementsMethod {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.google.com/");
	 Thread.sleep(2000);
	//swich the control to active element
	driver.switchTo().activeElement().sendKeys("poha");
	 Thread.sleep(2000);
	//identify all the suggestion of poha element
	 List<WebElement> pohasuggestion = driver.findElements(By.xpath("//div[@class='pcTkSc']"));
	// System.out.println(pohasuggestion);
	 //to print list use looping statement
	 Thread.sleep(2000);
	 for(int i=0;i<pohasuggestion.size();i++)
	 {
		  /*WebElement element = pohasuggestion.get(i);
		   String poha = element.getText();
		  System.out.println(poha);*/
		 System.out.println(pohasuggestion.get(i).getText());
	 }
	 driver.close();
}
}
//it is used to find multiple webelement
//it returns list of webelements when webelement founds
//if not found

//for( List<WebElement> poha: pohasuggestion)