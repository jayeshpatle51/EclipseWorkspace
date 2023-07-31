package Demopackage;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.fail;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Democlass {
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();
  private JavascriptExecutor js;

  @BeforeClass(alwaysRun = true)
  public void setUp() throws Exception {
    //System.setProperty("webdriver.chrome.driver", "");
	  WebDriverManager.chromedriver().setup();
	  ChromeOptions chrome=new ChromeOptions();
	  chrome.setAcceptInsecureCerts(true);
    driver = new ChromeDriver(chrome);
    baseUrl = "https://www.google.com/";
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
    js = (JavascriptExecutor) driver;
  }

  @Test
  public void testUntitledTestCase() throws Exception {
    driver.get("https://demosite.executeautomation.com/");
    driver.findElement(By.name("UserName")).click();
    driver.findElement(By.name("UserName")).clear();
    driver.findElement(By.name("UserName")).sendKeys("jayesh");
    driver.findElement(By.name("Password")).click();
    driver.findElement(By.name("Password")).clear();
    driver.findElement(By.name("Password")).sendKeys("12345");
    driver.findElement(By.xpath("//form[@id='userName']/p[3]")).click();
    driver.findElement(By.xpath("//input[@name='Login']")).click();
    driver.findElement(By.id("TitleId")).click();
    new Select(driver.findElement(By.id("TitleId"))).selectByVisibleText("Mr.");
    driver.findElement(By.id("Initial")).click();
    driver.findElement(By.id("Initial")).clear();
    driver.findElement(By.id("Initial")).sendKeys("jfjjv");
    driver.findElement(By.id("FirstName")).click();
    driver.findElement(By.id("FirstName")).clear();
    driver.findElement(By.id("FirstName")).sendKeys("Jayesh");
    driver.findElement(By.id("MiddleName")).click();
    driver.get("https://katalon.com/software-testers?utm_term=katalon%20tool&utm_campaign=In_QE_Branded_Search_Ads_Campaign&utm_source=adwords&utm_medium=ppc&hsa_acc=4390546474&hsa_cam=18196080469&hsa_grp=143440783169&hsa_ad=618955978060&hsa_src=g&hsa_tgt=kwd-893009573191&hsa_kw=katalon%20tool&hsa_mt=b&hsa_net=adwords&hsa_ver=3&gclid=CjwKCAjw2OiaBhBSEiwAh2ZSP3rNlj5PdgyEDEv7n8iNSU_rdiP6Lv2VQbzJJhaefEBrl5VLTBg5gRoCg4sQAvD_BwE");
    driver.get("https://demosite.executeautomation.com/index.html?UserName=jayesh&Password=12345&Login=Login");
    driver.findElement(By.id("MiddleName")).clear();
    driver.findElement(By.id("MiddleName")).sendKeys("Nepal");
    driver.findElement(By.name("Male")).click();
    driver.get("https://katalon.com/software-testers?utm_term=katalon%20tool&utm_campaign=In_QE_Branded_Search_Ads_Campaign&utm_source=adwords&utm_medium=ppc&hsa_acc=4390546474&hsa_cam=18196080469&hsa_grp=143440783169&hsa_ad=618955978060&hsa_src=g&hsa_tgt=kwd-893009573191&hsa_kw=katalon%20tool&hsa_mt=b&hsa_net=adwords&hsa_ver=3&gclid=CjwKCAjw2OiaBhBSEiwAh2ZSP3rNlj5PdgyEDEv7n8iNSU_rdiP6Lv2VQbzJJhaefEBrl5VLTBg5gRoCg4sQAvD_BwE");
    driver.get("https://demosite.executeautomation.com/index.html?UserName=jayesh&Password=12345&Login=Login");
    driver.findElement(By.name("english")).click();
    driver.findElement(By.name("english")).click();
    driver.findElement(By.name("Save")).click();
    driver.findElement(By.linkText("HtmlPopup")).click();
    //ERROR: Caught exception [ERROR: Unsupported command [selectWindow | win_ser_1 | ]]
    driver.get("https://demosite.executeautomation.com/popup.html");
    driver.findElement(By.id("TitleId")).click();
    new Select(driver.findElement(By.id("TitleId"))).selectByVisibleText("Mr.");
    driver.findElement(By.id("Initial")).click();
    driver.findElement(By.id("Initial")).clear();
    driver.findElement(By.id("Initial")).sendKeys("jsadka");
    driver.findElement(By.id("FirstName")).click();
    driver.findElement(By.id("FirstName")).clear();
    driver.findElement(By.id("FirstName")).sendKeys("Jayesh");
    driver.findElement(By.id("MiddleName")).click();
    driver.findElement(By.id("MiddleName")).clear();
    driver.findElement(By.id("MiddleName")).sendKeys("Nepal");
    driver.findElement(By.id("LastName")).click();
    driver.findElement(By.id("LastName")).clear();
    driver.findElement(By.id("LastName")).sendKeys("Patle");
    driver.findElement(By.name("Male")).click();
    driver.findElement(By.id("Country")).click();
    new Select(driver.findElement(By.id("Country"))).selectByVisibleText("India");
    driver.findElement(By.name("Save")).click();
    //ERROR: Caught exception [ERROR: Unsupported command [selectWindow | win_ser_local | ]]
    acceptNextAlert = true;
    driver.get("https://demosite.executeautomation.com/index.html?UserName=jayesh&Password=12345&Login=Login");
    driver.findElement(By.name("generate")).click();
    assertEquals(closeAlertAndGetItsText(), "You generated a Javascript alert");
    assertEquals(closeAlertAndGetItsText(), "You pressed OK!");
  }

  @AfterClass(alwaysRun = true)
  public void tearDown() throws Exception {
    driver.quit();
    String verificationErrorString = verificationErrors.toString();
    if (!"".equals(verificationErrorString)) {
      fail(verificationErrorString);
    }
  }

  private boolean isElementPresent(By by) {
    try {
      driver.findElement(by);
      return true;
    } catch (NoSuchElementException e) {
      return false;
    }
  }

  private boolean isAlertPresent() {
    try {
      driver.switchTo().alert();
      return true;
    } catch (NoAlertPresentException e) {
      return false;
    }
  }

  private String closeAlertAndGetItsText() {
    try {
      Alert alert = driver.switchTo().alert();
      String alertText = alert.getText();
      if (acceptNextAlert) {
        alert.accept();
      } else {
        alert.dismiss();
      }
      return alertText;
    } finally {
      acceptNextAlert = true;
    }
  }
}
