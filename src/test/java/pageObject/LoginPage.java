package pageObject;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends HomePage{

	
	
	public LoginPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	@FindBy(xpath="//input[@id='input-email']") WebElement userEmail;
	@FindBy(xpath="//input[@id='input-password']") WebElement userPass;
	@FindBy(xpath="//button[@type='submit']") WebElement userBtn;

	

	public void setUser(String email) {
		userEmail.sendKeys(email);
		
	}
	
	public void setPass(String pwd) {
		userPass.sendKeys(pwd);
	}
	public void setBtn() {
		userBtn.click();
	}
}
