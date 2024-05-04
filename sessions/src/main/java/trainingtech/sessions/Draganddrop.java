package trainingtech.sessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Draganddrop {
	static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\silsi\\eclipse-workspace\\sessions\\Drivers\\chromedriver.exe");
		driver=new ChromeDriver();  
		driver.get("http://jqueryui.com");
		driver.manage().window().maximize();
		Thread.sleep(6000);
		WebElement droppable=driver.findElement(By.linkText("Droppabale"));
		droppable.click();
		Thread.sleep(6000);
		driver.switchTo().frame(0);
		WebElement draggable=driver.findElement(By.id("Draggable"));
		WebElement dropabletoobjects=driver.findElement(By.id("droppable"));
		Actions ob=new Actions(driver);
		ob.Draganddrop(draggable, dropabletoobjects).build().perform();
		Thread.sleep(6000);
		driver.switchTo().parentFrame();
		WebElement Resizeable=driver.findElement(By.linkText("Resizeable"));
		Resizeable.click();
		
		


	

}
