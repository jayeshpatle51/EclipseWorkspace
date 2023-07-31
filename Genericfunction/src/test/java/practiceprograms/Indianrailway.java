package practiceprograms;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Indianrailway {

	public static void main(String[] args) throws InterruptedException, AWTException {
		// TODO Auto-generated method stub
		
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.get("https://indianrailways.gov.in/");
		Actions act = new Actions(driver);
		WebElement passenger = driver.findElement(By.xpath("//a[@title='Passenger Services']"));
		act.moveToElement(passenger).build().perform();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[contains(@href,'pnr_Enq')]")).click();
		Set<String> windows = driver.getWindowHandles();
		List<String> windowslist = new ArrayList<>(windows);
		driver.switchTo().window(windowslist.get(1));
		Thread.sleep(3000);

		driver.findElement(By.xpath("//a[text()='Seat Availability']")).click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,300)");
		driver.findElement(By.id("trainNo")).sendKeys("11039");
		
		List<WebElement> listoftrains = driver.findElements(By.xpath("//ul[@id='ui-id-3']//li//a"));
		for (int i = 0; i < listoftrains.size(); i++) {
			if (listoftrains.get(i).getText().contains("11039")) {
				String str = listoftrains.get(i).getText();
				System.out.println(str);
				listoftrains.get(i).click();
				break;
			}
		}
		
		driver.findElement(By.xpath("//img[@class='ui-datepicker-trigger']")).click();
		
		 boolean flag=true;
		 
		while(flag) {
			
		List<WebElement> monthyear=driver.findElements(By.xpath("//div[contains(@class,'first')]//div[contains(@class,'title')]//span"));
          
		WebElement arrow = driver.findElement(By.xpath("//a[@title='Next']"));
        	String month=monthyear.get(0).getText();
        	String year=monthyear.get(1).getText();
        	System.out.println(month+" "+month.length()+" "+year+" "+year.length());
          String date= "2-March-2023";
          String[] arr=date.split("-");
          
   
        	if(month.equals(arr[1]) && year.equals(arr[2])) {
        		
        		driver.findElement(By.xpath("(//td[@data-handler='selectDay']//a[text()='"+arr[0]+"'])[1]")).click();
        		flag=false;
        		break;
        	}else {
        		
        		if(arrow.getAttribute("class").contains("state-disabled")) {
        			List<WebElement> monthyearlast=driver.findElements(By.xpath("//div[contains(@class,'last')]//div[contains(@class,'title')]//span"));
        			
        			String month1=monthyearlast.get(0).getText();
                	String year1=monthyearlast.get(1).getText();
                	driver.findElement(By.xpath("(//td[@data-handler='selectDay']//a[text()='"+arr[0]+"'])[2]")).click();
                	System.out.println(month1+" "+year1);
        			break;
        		}
        		arrow.click();
        	}
        }
		
		driver.findElement(By.id("sourceStation")).sendKeys("Nagpur");
		driver.findElement(By.xpath("//ul[@id='ui-id-1']//a[text()='NAGPUR - NGP']")).click();
		driver.findElement(By.id("destinationStation")).sendKeys("Mumbai");
		driver.findElement(By.xpath("//ul[@id='ui-id-2']//a[text()='MUMBAI CENTRAL - BCT']")).click();
		
		WebElement resclass=driver.findElement(By.id("class"));
        Select sel=new Select(resclass);
        sel.selectByValue("1A");
        
        WebElement quota=driver.findElement(By.id("quota"));
        Select quotasel=new Select(quota);
        quotasel.selectByValue("GN");

        driver.findElement(By.xpath("//input[@id='modal1']")).click();
        
        WebElement captcha=driver.findElement(By.xpath("//img[@id='CaptchaImgID']"));
        Thread.sleep(3000);
       act.contextClick(captcha).perform();

       
        Robot robot=new Robot();
        robot.keyPress(KeyEvent.VK_DOWN);
        robot.keyRelease(KeyEvent.VK_DOWN);
        robot.keyPress(KeyEvent.VK_DOWN);
        robot.keyRelease(KeyEvent.VK_DOWN);

        
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
        Thread.sleep(3000);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
        

        driver.switchTo().newWindow(WindowType.TAB);
        driver.get("https://www.imagetotext.info/");
        js.executeScript("window.scrollBy(0,500)");
        
        driver.findElement(By.id("fileupload")).sendKeys("C:\\Users\\SPURGE\\Downloads\\captchaDraw.png");
        
       

        js.executeScript("window.scrollBy(0,800)");
        driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@title='reCAPTCHA']")));
        WebElement ele=driver.findElement(By.xpath("//div[@id='rc-anchor-container']"));
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.elementToBeClickable(ele));
        ele.click();
        
        Thread.sleep(3000);
        driver.findElement(By.id("checkBtn")).click();
        
		Thread.sleep(10000);

		driver.quit();
	}

}
