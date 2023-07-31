package pagetest;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import library.Searchbuses;
import library.userlogin;

public class userregandlogin extends userlogin{
	userlogin user;
	Logger logger=Logger.getLogger("Searchbus");
	userregandlogin(){
		super();
	}

	
	@BeforeClass
	public void SetUp() throws IOException {
		initialization();
		user=new userlogin();
		logger.info("browser opening");
	}
	
	@Test
	public void clicklogin()
	{
		user.clickonlogin();
	}
	
	
	@Test
	public void clickwithgoogle()
	{
		user.signwithgoogle();
		//Assert.assertTrue(signwithgoogle());
	}
	
//	@AfterClass
//	public void quit() {
//		driver.quit();
//	}
}
