package TestScripts;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class TestHelper {
	public WebDriver driver;
  @BeforeMethod
  public void beforemethod() {
	  System.setProperty("webdriver.chrome.driver","D:\\Obsqura\\Selenium\\chromedriver_win32\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.get("https://www.qabible.in/payrollapp/");
  }

  @AfterMethod
  public void afterMethod() {
	  driver.close();
  }

}
