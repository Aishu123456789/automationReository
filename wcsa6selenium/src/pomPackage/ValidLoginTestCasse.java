package pomPackage;

import java.io.IOException;

public class ValidLoginTestCasse extends BaseTest {
	public static void main(String[] args) throws IOException, InterruptedException {
		//to open and close browser
		BaseTest bt = new BaseTest();
		bt.openBrowser();
	//perform valid login operation
	//refer the webelement from loginpage
		LoginPage lp = new LoginPage(driver);
	//read the valid username and validpassword
		Flib flib = new Flib();
		
		lp.validLogin(flib.readPropertyData(PROP_PATH, "Username"),flib.readPropertyData(PROP_PATH, "Password"));
		Thread.sleep(2000);
		bt.closeBrowser();
	}

}
