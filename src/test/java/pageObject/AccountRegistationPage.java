package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccountRegistationPage extends HomePage {
	WebDriver driver;
	
    public AccountRegistationPage(WebDriver driver) {
    	super(driver);

   
     }
		
	@FindBy(xpath="//input[@id='input-firstname']") WebElement txtFirstN;
	@FindBy(xpath="//input[@id='input-lastname']") WebElement txtSecondN;
	@FindBy(xpath="//input[@id='input-email']") WebElement txtEmail;
	@FindBy(xpath="//input[@id='input-password']") WebElement txtPas;
	@FindBy(xpath="//input[@name='agree']") WebElement agreeB;
	@FindBy(xpath="//button[@type='submit']") WebElement submitB;
	@FindBy(xpath="//h1[normalize-space()='Your Account Has Been Created!']") WebElement accountC;
	
	
	
	
	public void txtFirst(String firstName) {
		txtFirstN.sendKeys(firstName);
	}
	
	public void txtSecond(String secondName) {
		txtSecondN.sendKeys( secondName);
	}
	public void txtEmail(String email) {
		txtEmail.sendKeys(email);
	}
	public void setPassword(String password) {
		txtPas.sendKeys(password);
	}
	public void setAgreeB() {
		Actions actions = new Actions(driver);
		actions.moveToElement(agreeB).click().perform();
		
	}
	public void setSubmitB() {
		submitB.submit();
	}
	public String getAccountC() {
		
		try {
			return(accountC.getText());
			
		}
		catch(Exception e) {
			return (e.getMessage());
		}
	}

	}


