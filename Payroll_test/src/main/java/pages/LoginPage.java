package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.PageUtility;

public class LoginPage {
	WebDriver driver;
 
	
	public LoginPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	    }
	
	@FindBy(xpath="//input[@id='loginform-username']")
	WebElement userName;
	@FindBy(xpath="//input[@id='loginform-password']")
	WebElement Password;
	@FindBy(xpath="//button[@type='submit']")
	WebElement submit;
	@FindBy(xpath="//p[text()='Welcome to Payroll Application']")
	WebElement dashboardmessage;
	@FindBy(xpath="//p[text()='Incorrect username or password.']")
	WebElement invalidmessage;
	
	
	public void loggingin(String username,String password) {
		PageUtility.isElementLoaded(driver,userName,3000);
		userName.sendKeys(username);
		Password.sendKeys(password);
		PageUtility.waitforElementTobeClickable(driver, submit, 3000);
		submit.click();
		}
	
	public String verifyValidLoginUser() {
		PageUtility.isElementLoaded(driver,dashboardmessage,3000);
		String loginmessage=dashboardmessage.getText();
		//System.out.println("message displayed in logged in page is " +loginmessage);
		return loginmessage;
		}
	
	public String verifyInvalidLoginUser() {
		PageUtility.isElementLoaded(driver,invalidmessage,3000);
		String failloginmessage=invalidmessage.getText();
		//System.out.println("message displayed " +failloginmessage);
		return failloginmessage;
	    }
	
}
