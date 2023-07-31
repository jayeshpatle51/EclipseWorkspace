package pagetest;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import abhibus.Baseclass;
import library.Searchbuses;

public class Searchbus extends Searchbuses {
	Searchbuses searchbusticket;
	Logger logger=Logger.getLogger("Searchbus");
	Searchbus(){
		super();
	}
	@BeforeClass
	public void SetUp() throws IOException {
		initialization();
		searchbusticket=new Searchbuses();
		logger.info("browser opening");
	}
	@Test(priority=1)
	public void searchbusFrom() throws InterruptedException, IOException {
		
		 searchbusticket.selectSourcecity();
		 Thread.sleep(4000);
		
	}
	
	@Test(priority=2)
	public void searchbusTo()  {
		
	searchbusticket.selectdestcity();
	 try {
		Thread.sleep(5000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
   }
	@Test(priority=3)
	public void selectdate()
	{
		searchbusticket.searchBusdate("20/May/2022");
	}
	@Test(priority=4)
	public void searchclick() 
	{
		boolean value=searchbusticket.searchbutton();
		Assert.assertTrue(value);
	}
	@AfterClass(enabled=false)
	public void quit() {
		driver.quit();
	}

}
