package test;


import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import cellphone.Search;

public class Test01 extends Base {

	@Test(priority=0)
	
	public void search() throws InterruptedException
	
	{
	 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	 Search sr=new Search(driver);
	 
	 sr.setcellname(name);
	 sr.search();
	 sr.pickup();
	
	 Set<String> h=driver.getWindowHandles();
	 
	 for(String string:h)
	 {
		 driver.switchTo().window(string);
	 }
	// sr.windowhandle();
	 sr.addtocart();
	 sr.printprice();
	 sr.addquantity();
	 Thread.sleep(2000);
	 sr.printprice();
	

	}
	
}
