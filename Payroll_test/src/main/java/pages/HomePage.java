package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import Utilities.PageUtility;


public class HomePage {
	WebDriver driver;
	
	public HomePage(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);
	}
	 @FindBy(xpath="//a[@href='/payrollapp/site/index']")
	 WebElement dashboard;
	 public String getTextofWelcomeText() {
		 PageUtility.isElementLoaded(driver,dashboard,3000);
	     String homemessage=dashboard.getText();
		 return homemessage;
	    } 
}
    
    
			
		
				
				
			

