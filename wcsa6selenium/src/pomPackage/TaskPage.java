package pomPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class TaskPage {
	//it is used to store all webelement of taskpage
	@FindBy(xpath = "//a[text()='Projects & Customers']")private WebElement Projects_customer_submodule;
	@FindBy(xpath="//input[@value='Create New Customer']")private WebElement Create_new_customer_Button;
	@FindBy(xpath="//input[@value='Create New Project']")private WebElement Create_new_project_Button;
    @FindBy(name="name")private WebElement Customer_Name_TB;
    @FindBy(name="createCustomerSubmit")private WebElement Create_customer_Button;
    @FindBy(xpath = "//select[@name='customerId']") private WebElement Customer_dropdown;
    @FindBy(xpath = "//input[@name='name']") private WebElement Project_Name_TB;
    @FindBy(name="createProjectSubmit")private WebElement Create_Project_Button;
    
    //initialization
    public void TaskPage(WebDriver driver)
    {
    	PageFactory.initElements(driver, this);
    }

	
    //Utilization
    public WebElement getProjects_customer_submodule() {
		return Projects_customer_submodule;
	}

	public WebElement getCreate_new_customer_Button() {
		return Create_new_customer_Button;
	}

	public WebElement getCreate_new_project_Button() {
		return Create_new_project_Button;
	}

	public WebElement getCustomer_Name_TB() {
		return Customer_Name_TB;
	}

	public WebElement getCreate_customer_Button() {
		return Create_customer_Button;
	}

	public WebElement getCustomer_dropdown() {
		return Customer_dropdown;
	}

	public WebElement getProject_Name_TB() {
		return Project_Name_TB;
	}

	public WebElement getCreate_Project_Button() {
		return Create_Project_Button;
	}
    
    ///operational method
	public void create_new_customer_method(String customerName)
	{
		Projects_customer_submodule.click();
		Create_new_customer_Button.click();
		Customer_Name_TB.sendKeys(customerName);
		Create_customer_Button.click();
	}
	
	public void create_new_project_method(String customerName)
	{
		Create_new_customer_Button.click();
		Select sel = new Select(Customer_dropdown);
	}
    
    
    
    
}
