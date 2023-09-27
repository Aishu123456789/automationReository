package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonPrimeVedio {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Feu.primevideo.com%2Fauth%2Freturn%2Fref%3Dav_auth_ap%3F_t%3DsgwgTIVKt_VnnTCgafFuuvzJJ8jjVs4iVs4e3WZbXhuumAAAAAQAAAABktkHXcmF3AAAAAPgWC9WfHH8iB-olH_E9xQ%26location%3D%2Foffers%2Fnonprimehomepage-dc%3Fgclid%253DCj0KCQjw8NilBhDOARIsAHzpbLCXEwqrXmBr_QpdKGouMmthsgzaQ8a1ORqodnieQxrbab-ajcahN9EaAvMDEALw_wcB%2526ref_%253Ddvm_pds_amz_in_as_s_gm_sitem_mkw_sZxDv5TJg%2526mrntrk%253Dpcrid_657901934582_slid__pgrid_84577172528_pgeo_9301536_x__adext_23833119309_ptid_kwd-315607112808&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&accountStatusPolicy=P1&openid.assoc_handle=amzn_prime_video_sso_in&openid.mode=checkid_setup&siteState=259-7131933-5848916&language=en_US&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
		//identify the email or phoneno with the help of id locator
		driver.findElement(By.id("ap_email")).sendKeys("12345");
		Thread.sleep(2000);
		//identify the password with the help of id locator
		driver.findElement(By.id("ap_password")).sendKeys("12345");
		Thread.sleep(2000);
		//identify the signin button with the help of id locator
		driver.findElement(By.id("signInSubmit")).click();
		Thread.sleep(2000);
		driver.close();
	}

}
