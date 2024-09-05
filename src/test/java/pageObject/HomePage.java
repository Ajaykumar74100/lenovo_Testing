package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
    WebDriver driver;
    // Constructor to initialize the elements
    
    public HomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
   
     }
    
 
    @FindBy(xpath="//span[normalize-space()='Wish List (0)']") WebElement wishList;
   //@FindBy(xpath="//a[@class='btn btn-primary']") WebElement usrPass;
   
    
    public void setName() {
    	wishList.click();
    	
    }
    
  }  
    




