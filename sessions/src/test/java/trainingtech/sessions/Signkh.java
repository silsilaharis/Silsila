package trainingtech.sessions;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import pages.Forgot;
import pages.Home;

import org.testng.annotations.BeforeMethod;

import java.io.File;
import java.io.IOException;
import java.nio.channels.InterruptedByTimeoutException;
import java.sql.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class Signkh {
	WebDriver driver;
  @Test
  public void f() throws InterruptedException, IOException {
	 /* WebElement emailfields=driver.findElement(By.name("email"));
	  emailfields.sendKeys("silsila@gmail.com");
	  WebElement psswrdfields=driver.findElement(By.name("pass"));
	  psswrdfields.sendKeys("sophiazaid");*/
	  
	  Home ob=new Home(driver);
	  ob.emailfieldsfill();
	  ob.psswrdfields();
	  shots();
	  ob.Forgotpassward();
	  shots();
	  Forgot fb=new Forgot(driver);
	  fb.Forgotpsswrdfields();
	  fb.SearchButtonClicks();
	  
	  Thread.sleep(6000);
	  String forgotlktexts= fb.Google();
	  System.out.println(forgotlktexts);
	  SoftAssert assertion=new SoftAssert();
	 // Assert.assertEquals(forgotlktexts, "Use your Google account");
	 // assertion.
  }
  @BeforeMethod
  public void beforeMethod() throws IOException {
	 Ibrowsers("Edge");
		driver.get("http://www.facebook.com");
		driver.manage().window().maximize();
		shots();
	  
  }
  public void Ibrowsers(String browser) {
	  if(browser.equalsIgnoreCase("Chrome")) {
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\silsi\\eclipse-workspace\\sessions\\Drivers\\chromedriver.exe");
			driver=new ChromeDriver(); 
	
		  
	  }else if (browser.equalsIgnoreCase("Edge")) {
		  System.setProperty("webdriver.edge.driver","C:\\Users\\silsi\\eclipse-workspace\\sessions\\Drivers\\msedgedriver.exe");
		  driver=new EdgeDriver();
		  
	  }else {
		  System.out.println("Name of browser didnt exist");
	  }
	  
  }

  @AfterMethod
  public void afterMethod()throws InterruptedByTimeoutException, InterruptedException {
	  Thread.sleep(6000);
	  
	  driver.quit();
  }
  @Test(priority = 2,dependsOnMethods = "f")
  public void CreateAnAccount() {
	  Home ob=new Home(driver);
	  ob.CreateAnAccount();
  }
  public void shots() throws IOException {
	  Date sessio=new Date(0);
	  System.out.println(sessio);
	  String kj= sessio.toString().replace(" ", "-").replace(":", "-");
	  System.out.println(kj);
	File output=  ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	FileHandler.copy(output, new File("C:\\Users\\silsi\\eclipse-workspace\\sessions\\Drivers\\pictuers\\+kj+shotss.png"));
  } 

}
