package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.PageUtility;

public class BranchPage {
private static final int Time = 0;
WebDriver driver;
	
	public BranchPage(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);
	}
	
	 
	 @FindBy(xpath="//a[@href='/payrollapp/branch/create']")
	 WebElement branch;
	// @FindBy(xpath="//a[href='/payrollapp/branch/create?sort=company_id']")
	 @FindBy(xpath="//a[text()='Company']")
	 WebElement companylink;
	 //@FindBy(xpath="//a[href='/payrollapp/branch/create?sort=branch_name']")
	 @FindBy(xpath="//a[text()='Branch Name']")
	 WebElement branchname;
	 //@FindBy(xpath="//a[href='/payrollapp/branch/create?sort=status']")
	 @FindBy(xpath="//a[text()='Status']")
	 WebElement status;
	//@FindBy(xpath="//a[href='/payrollapp/branch/update?id=1']")
	@FindBy(xpath="//a[@title='Update']")
     WebElement updatelink;
	 @FindBy(xpath="//a[@href='/payrollapp/branch/view?id=1']")
	 WebElement viewdetails;
	 
	 public void clickonbranch() {
		 PageUtility.waitforElementTobeClickable(driver, branch, 3000);
		 branch.click();
	    }
	 
	 public boolean ischeckbranchlinkenabled() {
		 return branch.isEnabled();
		}
	 
     public boolean ischeckbranchtabledisplayed() {
    
    	 return(companylink.isDisplayed()&&branchname.isDisplayed()&&status.isDisplayed()&&updatelink.isDisplayed()&&viewdetails.isDisplayed());
		 
	    }
 
	 public void viewbranchdetails() {
		PageUtility.waitforElementTobeClickable(driver, viewdetails, 3000);
		 viewdetails.click();
		}
	 
	
}


