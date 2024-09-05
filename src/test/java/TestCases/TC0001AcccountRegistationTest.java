package TestCases;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;


import pageObject.AccountRegistationPage;
import pageObject.HomePage;
import testBase.BaseClass;

public class TC0001AcccountRegistationTest extends BaseClass {

public WebDriver driver;

	@Test

	
	public void LoginTest() {
		
		logger.info("****Test startes****");
		HomePage hp=new HomePage(driver);
		driver.manage().deleteAllCookies();
	
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		hp.setName();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		//hp.setPass();
		
		
		AccountRegistationPage ap= new AccountRegistationPage(driver);
		logger.info(" ********* user details  *********");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		String string=randomString();
		String number=randomNumber();
		ap.txtFirst(string.toUpperCase());
		ap.txtSecond(string);
		ap.txtEmail(string+number+"@gmail.com");
		ap.setPassword(string+"@"+number);
		ap.setAgreeB();
		ap.setSubmitB();
		String cM=ap.getAccountC();		
		Assert.assertEquals(cM,"Your Account Has Been Created!");

}
}
