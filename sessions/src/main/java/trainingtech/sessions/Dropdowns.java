package trainingtech.sessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdowns {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\silsi\\eclipse-workspace\\sessions\\Drivers\\chromedriver.exe");
		driver=new ChromeDriver();  
		
		driver.get("http://www.facebook.com");
		driver.manage().window().maximize();
		WebElement Createbuttonclick=driver.findElement(By.linkText("Create new account"));
		Createbuttonclick.click();
		Thread.sleep(6000);
		WebElement Monthbirth=driver.findElement(By.name("birthday_month"));
		Select ob=new Select(Monthbirth);
		ob.selectByValue("5");
		
		WebElement Female=driver.findElement(By.xpath("(/html/body/div/div/div/div/div/div/div/div/form/div/div/span/span/input)[3]"));
		Female.click();
		
		
		
		
		
		
		 

	}

}
