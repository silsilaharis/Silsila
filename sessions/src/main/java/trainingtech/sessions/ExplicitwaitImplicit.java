package trainingtech.sessions;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitwaitImplicit {
	static WebDriver driver;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\silsi\\eclipse-workspace\\sessions\\Drivers\\chromedriver.exe");
		driver=new ChromeDriver();  
		
		driver.get("http://www.facebook.com");
		driver.manage().window().maximize();
		 WebElement CreatAnAccount=driver.findElement(By.linkText("Create new account"));
		 CreatAnAccount.click();
		// driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 
		 WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
		 wait.until(ExpectedConditions.presenceOfElementLocated(By.name("lastname")));
		 WebElement LastName=driver.findElement(By.name("lastname"));
		 LastName.sendKeys("silsila");
		 
		
		 
		 

	}

}
