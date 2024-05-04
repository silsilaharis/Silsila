package trainingtech.sessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment {
	private static final CharSequence Nawzadi = null;
	static WebDriver driver;
	private static String lastname;
	private static String reg_email__;


	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\silsi\\eclipse-workspace\\sessions\\Drivers\\chromedriver.exe");
		driver=new ChromeDriver();  
		driver.get("http://www.facebookver.manage().window().maximize();
		WebElement NewAccuunt=driver.findElement(By.linkText("Create new account"));
		Thread.sleep(6000);
		NewAccount.click();
		Thread.sleep(6000);
		
		
		WebElement FirstName=driver.findElement(By.name("FirstName"));
		FirstName.sendKeys("Silsila");
		
		WebElement Surname=driver.findElement(By.name(lastname));
		Surname.sendKeys(Nawzadi);
		
		WebElement Mobile=driver.findElement(By.name(reg_email__));
		Mobile.sendKeys("silsila.haris@gmail.com");
		
		WebElement ReenterEmail=driver.findElement(By.name("reg_email_confirmation__"));
		ReenterEmail.sendKeys("silsila.haris@gmail.com");
		
		WebElement NewPassward=driver.findElement(By.name("reg_passwd__"));
		NewPassward.sendKeys("silharis21");
		
		WebElement MonthofBirth=driver.findElement(By.id("Month"));
		Select ob= new Select(MonthofBirth);
		ob.selectByValue("6");
		 
		WebElement DateofBirth=driver.findElement(By.name("birthday_day"));
		Select db= new Select(DateofBirth);
		db.selectByValue("13");
		 
		WebElement YearofBirth=driver.findElement(By.name("birthday_year"));
		Select yb= new Select(YearofBirth);	
		yb.selectByValue("1990");
		 
		WebElement Gender=driver.findElement(By.xpath("//input[@name='sex' and @value=1]"));
		Gender.click();
		
		WebElement Signup=driver.findElement(By.name("websubmit"));
		Thread.sleep(6000);
		Signup.click();
		
		WebElement Female=driver.findElement(By.xpath("(/html/body/div/div/div/div/div/div/div/div/form/div/div/span/span/input)[3])");
		Female.click();
		
		
		
		
	

	}

}
