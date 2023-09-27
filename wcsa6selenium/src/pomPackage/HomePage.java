package pomPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	//it is used to stoare all the web elements of homepage
	@FindBy(xpath = "//div[.='Time-Track']/ancestor::a")private WebElement Time_Track_Module;
	@FindBy(xpath="//div[.='Tasks']/ancestor::a" )private WebElement Task_Module;
	@FindBy(xpath="//div[.='Reports']/ancestor::a" )private WebElement Reports_Module;
	@FindBy(xpath="//div[.='Users']/ancestor::a" )private WebElement Users_Module;
	@FindBy(xpath="//div[.='Work Schedule']/ancestor::a" )private WebElement Work_Schedule_Module;
	@FindBy(xpath="//div[.='Settings']/ancestor::a" )private WebElement Settings_module;
	@FindBy(partialLinkText ="Logout" )private WebElement Logout_link;
	
	//Initialization
	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}

	
	//utilization
	public WebElement getTime_Track_Module() {
		return Time_Track_Module;
	}

	public WebElement getTask_Module() {
		return Task_Module;
	}

	public WebElement getReports_Module() {
		return Reports_Module;
	}

	public WebElement getUsers_Module() {
		return Users_Module;
	}

	public WebElement getWork_Schedule() {
		return Work_Schedule_Module;
	}

	public WebElement getSettings_module() {
		return Settings_module;
	}

	public WebElement getLogout_link() {
		return Logout_link;
	}
	
	
	//operational
	public void  click_on_time_track_module()
	{
		Time_Track_Module.click();
	}
	
	public void click_on_Task_Module() 
	{
		Task_Module.click();
	}
	
	public void click_on_Reports_Module()
	{
		Reports_Module.click();
	}
	
	public void click_on_Users_Module()
	{
		Users_Module.click();
	}
	
	public void click_on_Work_Schedule_Module()
	{
		Work_Schedule_Module.click();
	}
	
	public void click_on_Settings_module()
	{
		Settings_module.click();
	}
	
	public void click_on_Logout_link()
	{
		Logout_link.click();
	}
}
	
	
	
	
	
	
	
	
	
