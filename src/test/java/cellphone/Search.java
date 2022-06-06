package cellphone;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class Search {
	
	public WebDriver driver;

	
	@FindBy(xpath="//input[@name='q']")
	public WebElement cname;
	
	@FindBy(xpath="//button[@type='submit']")
	public WebElement click;
	
	
	@FindBy(xpath="//div[contains(text(),'Infinix HOT 12 Play (Horizon Blue, 64 GB)')]")
	public WebElement mobile;
	
	@FindBy(xpath="//div[contains(text(),'Total Amount')]//following::span[1]")
	public WebElement price;
	
	@FindBy(xpath="//button[@class='_2KpZ6l _2U9uOA _3v1-ww']")
	public WebElement cart;
	
	@FindBy(xpath="//button[@class='_23FHuj'][2]")
	public WebElement add;
	
	
	public Search(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	public void setcellname(String name)
	{
		cname.sendKeys(name);
	}
	
	public void search()	
	{
		click.click();
	}	
	
	public void printprice()
	{
		String printprice = price.getText();
		System.out.println(printprice);
	}

	public void pickup()
	{
		mobile.click();
	}
	
	public void windowhandle()
	{
		 Set<String> h=driver.getWindowHandles();
		 
		 for(String string:h)
		 {
			 driver.switchTo().window(string);
		 }
	}

	public void addtocart()
	{
		cart.click();
	}
	

	public void addquantity()
	{
		add.click();
	}
	
	
}
