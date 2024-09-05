package TestCases;

import java.time.Duration;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObject.HomePage;
import pageObject.LoginPage;
import pageObject.MyAccountPage;
import testBase.BaseClass;

public class TC0003_LoginDDT extends BaseClass  {
	@Test (dataProvider="LoginData",dataProviderClass=DataProvider.class)
	
	public void verifyLogin_DDT(String email,String pwd,String exp) {
		
	
		
		HomePage hp=new HomePage (driver);
		hp.setName();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		LoginPage lp=new LoginPage(driver);
		
		lp.setUser(email);
		lp.setPass(pwd);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		lp.setBtn();
		
		
		
		MyAccountPage mp =new MyAccountPage(driver);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		boolean tar= mp.MyAc();
		
		
		if (exp.equalsIgnoreCase("Vaild")) {
			if (tar==true) {
				Assert.assertTrue(true);
				mp.logOut();
			}
			else {
				Assert.assertTrue(false);
			}
			
			if (exp.equalsIgnoreCase("Invaild")) {
				if (tar==true) {
					
					mp.logOut();
					Assert.assertTrue(false);
					
					
				}
				else {
					Assert.assertTrue(true);
				}
					
				}
				
				
		}
		}

		
		
		
		
		
		
	}


