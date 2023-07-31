package testNgListeners;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(ReportListener.class)
public class IReportTest {
	
	@Test
	   public void firstMethod() {
	      Assert.assertTrue(true);
	   }
		  
	   @Test
	   public void secondMethod() {
	      Assert.assertTrue(false);
	   }
		  
	   @Test(dependsOnMethods = {"firstMethod"})
	   public void thirdMethod() {
	      Assert.assertTrue(true);
	   }

}
