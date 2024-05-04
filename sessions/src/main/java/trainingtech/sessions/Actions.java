package trainingtech.sessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Actions {
	static WebDriver driver;
	
	public Actions(WebDriver driver2) {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\silsi\\eclipse-workspace\\sessions\\Drivers\\chromedriver.exe");
		driver=new ChromeDriver();  
		driver.get("http://j.com");
		driver.manage().window().maximize();
		
		

	}

}
