package pomPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	//it is pom class
	@FindBy(name="username") private WebElement usnTB;
	@FindBy(name="pwd") private WebElement pwdTB;
	@FindBy(id="loginButton") private WebElement loginButton;
	@FindBy(id="keepLoggedInCheckBox") private WebElement checkBox;
	@FindBy(partialLinkText="Actimind Inc") private WebElement actiMindLink;
	@FindBy(id="licenseLink") private WebElement licenseLink;
	

//initialization
	
	public LoginPage(WebDriver driver)
	{	
		PageFactory.initElements(driver,this );		
	}
	

//utilization
	//right click --clk on source--clk on getters and setters clk on select getter clik on generate
	public WebElement getUsnTB() {
		return usnTB;
	}
	public WebElement getPwdTB() {
		return pwdTB;
	}
	public WebElement getLoginButton() {
		return loginButton;
	}
	public WebElement getCheckBox() {
		return checkBox;
	}
	public WebElement getActiMindLink() {
		return actiMindLink;
	}
	public WebElement getLicenseLink() {
		return licenseLink;
	}
	
//operational
	
	public void validLogin(String validUsername,String validPassward)
{
		usnTB.sendKeys(validUsername);
		pwdTB.sendKeys(validPassward);
		loginButton.click();
}
	public void invalidLogin(String invalidusn,String invalidpass)
	{
		usnTB.sendKeys(invalidusn);
		pwdTB.sendKeys(invalidpass);
		loginButton.click();
    }
}