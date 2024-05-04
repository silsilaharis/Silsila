package trainingtech.sessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class browsers {

	
	static WebDriver driver; 
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\silsi\\eclipse-workspace\\sessions\\Drivers\\chromedriver.exe");
		driver=new ChromeDriver();  
		//driver.navigate().to("http://www.protrainingtech.com");
		
		driver.get("http://www.protrainingtech.com");
		 
		
		driver.manage().window().maximize();
		Thread.sleep(6000);
		driver.navigate().back();
		Thread.sleep(6000);
		driver.navigate().forward();
		Thread.sleep(6000); 
		String Title=driver.getTitle();
		String CurrentURL=driver.getCurrentUrl();
		String Session=driver.getWindowHandle();
		System.out.println(Title);
		System.out.println(CurrentURL);
		System.out.println(Session);
		driver.close();
		 
		

	}

}
