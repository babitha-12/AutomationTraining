package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import Utilities.PageUtility;

public class CompanyPage {
	WebDriver driver;
			
	public CompanyPage(WebDriver driver) {
			this.driver=driver;
			PageFactory.initElements(driver, this);
			}
					 
	@FindBy(xpath="//a[@href='/payrollapp/company/index']")
	WebElement company;
	@FindBy(xpath="//a[@href='/payrollapp/company']")
	
	WebElement companyTab;
	@FindBy(xpath="//a[@href='/payrollapp/branch/create']")

	WebElement branchTab;
	@FindBy(xpath="//a[@href='/payrollapp/division/create']")
	
	WebElement divisionTab;
	@FindBy(xpath="//input[@name='Company[company_name]']")
	WebElement companyName;
	@FindBy(xpath="//input[@id='company-company_email']")	
	WebElement companyEmail;
	@FindBy(xpath="//textarea[@id='company-company_address']")		
	WebElement companyAddress;
	@FindBy(xpath="//input[@id='company-started_at']")
	WebElement companyDate;
	@FindBy(xpath="//input[@id='company-status']")
	WebElement companyStatus;
	@FindBy(xpath="//button[@type='submit']")	
	WebElement companySubmit;
	
	public void clickonCompany() {
		PageUtility.waitforElementTobeClickable(driver, company, 3000);
		company.click();
	}
	
	public boolean ischeckcompanylinkenabled() {
		return(company.isEnabled());
	}
	
	public boolean ischeckcompanypagedisplayed() {
	       return (companyTab.isDisplayed() && branchTab.isDisplayed() && divisionTab.isDisplayed());
      }
	
	public boolean ischeckcompanytabenabled() {
		return(companyTab.isEnabled());
		
	}
	
	public boolean ischeckcompanyfieldsdisplayed() {
		return(companyName.isDisplayed()&&companyEmail.isDisplayed()&&companyAddress.isDisplayed()&&companyDate.isDisplayed()&&companySubmit.isDisplayed());
	}
	
	public boolean  enterCompanyDetails(String company_name, String company_email, String company_address, String company_date, String company_status) {
				
		        PageUtility.isElementLoaded(driver,companyName,3000);
				companyName.clear();
				companyName.sendKeys(company_name);
				PageUtility.isElementLoaded(driver,companyEmail,3000);
				companyEmail.clear();
				companyEmail.sendKeys(company_email);
				companyAddress.clear();
				companyAddress.sendKeys(company_address);
				companyDate.clear();
				//PageUtility.isElementLoaded(driver,companyDate,3000);
				companyDate.sendKeys(company_date);
				//PageUtility.isElementLoaded(driver,companyStatus,3000);
				//PageUtility.waitforElementTobeClickable(driver, companyStatus, 3000);
				if(company_status.equals("no"))
				{
					companyStatus.click();
				}
				//PageUtility.isElementLoaded(driver,companySubmit,3000);
				companySubmit.submit();
				
			return( companySubmit.isEnabled());	
}
}
	
	
	
	



