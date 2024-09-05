package testBase;
import org.apache.commons.lang3.RandomStringUtils; 
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.apache.logging.log4j.LogManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.apache.logging.log4j.Logger;
public class BaseClass {
	 public WebDriver driver;
	  public Logger logger;
	 public Properties p;
	
	
	@BeforeClass
    public void setUp() throws IOException {
		FileReader file =new FileReader("./src//test/resources//config.properties");
        p=new Properties();
         p.load(file);
		logger =LogManager.getLogger(this.getClass());
	    driver = new ChromeDriver(); 	
		 driver.get(p.getProperty("url"));
		 
		 
		 
		

        
    }
	public String  randomString() {
		String randomNs=RandomStringUtils.randomAlphabetic(4);
		return randomNs;
	}
	public String  randomNumber() {
		String randomNs=RandomStringUtils.randomAlphanumeric(4);
		return randomNs;
	}
	

	


}
