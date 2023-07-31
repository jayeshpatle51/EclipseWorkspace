package javascriptmethods;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.time.Duration;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//my comment
public class Myproject {
	public static void flash(WebElement element, WebDriver driver) {
		String bgcolor= element.getCssValue("backgroundColor");
		for(int i=0;i<500;i++) {
		changecolor("#000000",element,driver);
		changecolor(bgcolor,element,driver);
		
		}
	}
	public static void changecolor(String color,WebElement element, WebDriver driver) {
		JavascriptExecutor js=((JavascriptExecutor)driver);
		js.executeScript("arguments[0].style.backgroundColor = '"+ color +"'", element);
		
		
		
		try {
			Thread.sleep(20);
		}catch(InterruptedException e) {
			
		}}
	public static void drawborder(WebElement element, WebDriver driver) {
		JavascriptExecutor js1=((JavascriptExecutor)driver);
	js1.executeScript("arguments[0].style.border= '6px solid red'", element);
	
	}
	public static String gettitle(WebDriver driver) {
		JavascriptExecutor js2=((JavascriptExecutor)driver);
		String title =js2.executeScript("return document.title;").toString();
		return title;
		
	}
	public static void clickbyjs(WebElement element,WebDriver driver) {
		JavascriptExecutor js2=((JavascriptExecutor)driver);
		js2.executeScript("arguments[0].click();", element);
	}
	public static void generatealert(WebDriver driver,String message) {
		JavascriptExecutor js=((JavascriptExecutor)driver);
		js.executeScript("alert('"+ message+"')");
	}	
	public static void refreshpage(WebDriver driver) {
		JavascriptExecutor js=((JavascriptExecutor)driver);
		js.executeScript("history.go()");
	}
	public static void scrollintoview(WebDriver driver) {
		JavascriptExecutor js=((JavascriptExecutor)driver);
		js.executeScript("window.scrollBy(0,1000)");
		
	}
	public static void scrolltopagedown(WebDriver driver) {
		JavascriptExecutor js=((JavascriptExecutor)driver);
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
	}
    public static void scrolldowntoelement(WebDriver driver,WebElement element) {
    	JavascriptExecutor js=((JavascriptExecutor)driver);
    	js.executeScript("arguments[0].scrollIntoView();",element);
    }
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.abhibus.com/");
      	
        
        WebElement logo=driver.findElement(By.xpath("//div[@class='apsrtc-logo']"));
        scrolldowntoelement(driver, logo);
        driver.findElement(By.xpath("//div//p[text()='APSRTC']")).click();
	}

}
