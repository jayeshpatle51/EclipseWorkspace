package utilsclasses;

import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;

public class GeneralActions {

	
	 public static boolean alertisPresent(WebDriver driver) {
	    	try {
	    		driver.switchTo().alert();
	    		return true;
	    	}catch(NoAlertPresentException e){
	    		return false;
	    	}
	    }
}
