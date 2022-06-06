package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {
	public WebDriver driver;
	public String name = "Infinix HOT 12 Play";
	
	
	
	@BeforeClass
	
	public void setup() throws InterruptedException
	{
    
    	  
		WebDriverManager.chromedriver().setup();
		driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[contains(text(),'✕')]")).click();
	    
	}
    

//	@AfterClass
//	
//	public void teardown()
//	{
//		driver.close();
//	}
//	
//	
	
	
	
	
}
