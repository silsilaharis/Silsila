 package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home {
	WebDriver driver;
	
	//add all the locates according to use for page,create method for each locater according to action
	@FindBy(name="email")WebElement emailfields;
	@FindBy(name ="pass") WebElement psswrdfeilds;
	@FindBy(linkText ="Forgot password?") WebElement Forgots;
	@FindBy(linkText = "Create new account") WebElement CreateNewAccount;
	
	
	
	public Home(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	public void emailfieldsfill() {
		emailfields.sendKeys("silsila.haris@gmail.com");
		
	}
	public void psswrdfields () {
		psswrdfeilds.sendKeys("zaid");
		
	}
	public void Forgotpassward() {
		Forgots.click();
	}
	public void CreateAnAccount() {
		CreateNewAccount.click();
		
		
	}

}
