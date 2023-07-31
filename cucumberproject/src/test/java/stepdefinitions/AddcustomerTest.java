package stepdefinitions;

import java.time.Duration;
import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class AddcustomerTest {

	
	public static void scrolldowntoelement(WebDriver driver,WebElement element) {
    	JavascriptExecutor js=((JavascriptExecutor)driver);
    	js.executeScript("arguments[0].scrollIntoView();",element);
    }
	public static void scrollintoview(WebDriver driver) {
		JavascriptExecutor js=((JavascriptExecutor)driver);
		js.executeScript("window.scrollBy(0,500)");
		
	}

}
