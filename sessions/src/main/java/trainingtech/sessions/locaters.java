package trainingtech.sessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class locaters {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		
		
		
			// TODO Auto-generated method stub
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\silsi\\eclipse-workspace\\sessions\\Drivers\\chromedriver.exe");
			driver=new ChromeDriver();  
			//driver.navigate().to("http://www.protrainingtech.com");
			
			driver.get("http://www.protrainingtech.com");
			
			driver=new ChromeDriver();
			driver.get("http://www.facebook.com");
			driver.manage().window().maximize();
			String id;
			WebElement EmailField=driver.findElement(By.id(id="email"));
			EmailField.sendKeys("hr@protrainingtech.com");
			WebElement PssswardField=driver.findElement(By.name("pass"));
			PssswardField.sendKeys("sophiazaid");
			Thread.sleep(6000);
			WebElement Forgotlk=driver.findElement(By.linkText("Forgot password?"));
			Forgotlk.click()
			
			 
			 

	}

}
