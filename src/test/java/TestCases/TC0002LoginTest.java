package TestCases;

import java.time.Duration;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObject.HomePage;
import pageObject.LoginPage;
import pageObject.MyAccountPage;
import testBase.BaseClass;

public class TC0002LoginTest extends BaseClass {
	@Test
	public void Verify_Login() {
		
		
	logger.info(" ********* user details  *********");

		
		HomePage hp=new HomePage (driver);
		hp.setName();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		LoginPage lp=new LoginPage(driver);
		
		lp.setUser(p.getProperty("email"));
		lp.setPass(p.getProperty("pwd"));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		lp.setBtn();
		
		
		
		MyAccountPage mp =new MyAccountPage(driver);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		boolean tar= mp.MyAc();
		
		Assert.assertTrue(tar);
		
		}
	
		
	
	

}


