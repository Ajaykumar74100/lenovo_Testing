package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class MyAccountPage extends HomePage{
	
	
	public MyAccountPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@FindBy(xpath="//a[@class='btn btn-primary']") WebElement myWishList;
	@FindBy(xpath="//h2[normalize-space()='My Account']") WebElement myAccount;
	@FindBy(xpath="//a[@class='list-group-item'][normalize-space()='Logout']") WebElement myLogout;
	
	public void myWish() {
		myWishList.click();
	}
	
	public boolean MyAc() {
		
		
		try 
		{
		return myAccount.isDisplayed();
		}
		catch(Exception e) {
			return false;
		}
	}
	
	public void logOut() {
		myLogout.click();
	}

}
