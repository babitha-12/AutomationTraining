package TestScripts;

import org.testng.annotations.Test;
import pages.BranchPage;
import pages.CompanyPage;
import pages.HomePage;
import pages.LoginPage;
import org.testng.Assert;


public class RegressionTest extends TestHelper {
/*
  @Test
  public void verifyValidlogin() {
     LoginPage login=new LoginPage(driver);
     login. loggingin("carol", "1q2w3e4r");
     Assert.assertEquals(login.verifyValidLoginUser(), "Welcome to Payroll Application");
     //System.out.println("Registered user is successfully logged in");
  } 
  
  @Test
  public void verifyInvalidLogin() {
	  LoginPage login=new LoginPage(driver);
	  login. loggingin("helen", "asdfr#4");  
      //login.verifyInvalidLoginUser();
      Assert.assertEquals(login.verifyInvalidLoginUser(), "Incorrect username or password.");
      //System.out.println("Not registered is not able to login"); 
  }
 
  
  
  @Test
  public void verifyingdashboard() {
	  LoginPage login=new LoginPage(driver);
	  login. loggingin("carol", "1q2w3e4r");
      HomePage dashboard=new HomePage(driver);
      //dashboard. getTextofWelcomeText();
      Assert.assertEquals(dashboard. getTextofWelcomeText(), "Dashboard");
      //System.out.println("Dashboard page is displayed by default after registered user login");
      
  }

  
  
 @Test
  public void verifyCompanypage()  {
	 LoginPage login=new LoginPage(driver);
	 login. loggingin("carol", "1q2w3e4r");
	 HomePage dashboard=new HomePage(driver);
	 dashboard.getTextofWelcomeText();
	 CompanyPage pagedetails=new CompanyPage(driver);
	 pagedetails.clickonCompany();
	Assert.assertTrue(pagedetails.ischeckcompanylinkenabled());
	 Assert.assertTrue(pagedetails.ischeckcompanypagedisplayed());
	 Assert.assertTrue( pagedetails.ischeckcompanytabenabled());
	Assert.assertTrue( pagedetails.ischeckcompanyfieldsdisplayed());
	Assert.assertTrue(pagedetails.enterCompanyDetails("obsqura", "obsqura@test.com", "tvm", "31-03-2020", "yes"));
  }
*/
	 @Test
	  public void branchdetails() {
		 LoginPage login=new LoginPage(driver);
		 login. loggingin("carol", "1q2w3e4r");
		 HomePage dashboard=new HomePage(driver);
		 dashboard.getTextofWelcomeText();
		 CompanyPage pagedetails=new CompanyPage(driver);
		 pagedetails.clickonCompany();
		 BranchPage branchdetails=new BranchPage(driver);
		 branchdetails.clickonbranch();
		 Assert.assertTrue(branchdetails.ischeckbranchlinkenabled());
		 Assert.assertTrue(branchdetails.ischeckbranchtabledisplayed());
		 branchdetails.viewbranchdetails();
		 //System.out.println("Branch icon is selected and opened successfully");
		 //System.out.println("Branch details can be viewed successfully");
	 }
	
  }


