package trainingtech.sessions;

import org.testng.annotations.Test;
import org.testng.asserts.Assertion;
import org.testng.asserts.SoftAssert;

import pages.Forgot;
import pages.Home;

import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class Sighnkh2 {
	
	
	WebDriver driver;
  @Test(priority=1)
  public void f() throws InterruptedException {
	  Home ob=new Home(driver);
	  ob.emailfieldsfill();
	  ob.Forgotpassward();
	  ob.Forgotpassward();
	  Forgot fb=new Forgot(driver);
	  fb.Forgotpsswrdfields();
	  fb.SearchButtonClicks();
	  Thread.sleep(6000);
	 String forgotlktexts= fb.Google();
	 System.out.println(forgotlktexts);
	 SoftAssert aasertion=new SoftAssert();
	 //Assert.assertEquals(forgotlktexts, "Use your Google accountsk");
	 aasertion.assertEquals(forgotlktexts, "Use your Google accountsk");
	 System.out.println("This is after the assertion");
	 aasertion.assertAll();
	 
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\silsi\\eclipse-workspace\\sessions\\Drivers\\chromedriver.exe");
		driver=new ChromeDriver();  
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		String ParentWindowHandle= driver.getWindowHandle();
		System.out.println("parent:" +ParentWindowHandle);
		WebElement cookie=driver.findElement(By.xpath("//button[contains(text(), 'Decline optional cookie')]"));
		cookie.click();
		
  }

  @AfterMethod
  public void afterMethod() throws InterruptedException {
	  Thread.sleep(6000);
	  
	  driver.quit();
  }
  @Test(priority=2,dependsOnMethods = "f")
  public void CreateNewAccount() {
	  Home ob=new Home(driver);
	  ob.CreateAnAccount();
	  
	  
  }

}
