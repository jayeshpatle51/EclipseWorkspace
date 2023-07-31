package Mainproject.simpleproject;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.google.common.base.Verify;


public class Xlfile {

	   
	public static  HashMap<Integer,String> rev(ArrayList<String> list)
       {
               
              ArrayList<String> newlist=new ArrayList<String>();
              
		   
               for(int i=0;i<list.size();i++)
               {
           
                String str=list.get(i);
                String str1="";
                for(int j=str.length()-1;j>=0;j--) 
                {
                  	str1=str1+str.charAt(j);
                }
                list.set(i, str1);
            	
               }
               for(int l=0;l<list.size();l++)
          	 {
          		 newlist.add(l,list.get(list.size()-l-1));
          	 }  
               HashMap<Integer, String> hashmap=new HashMap<>();
               for(int k=0;k<newlist.size();k++)
               {
               
               hashmap.put(k,newlist.get(k));
               }
                     return hashmap; 
        }
	   
		WebDriver driver;

		@BeforeMethod
		public void beforemethod()
		{
			
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			driver.get("https://www.abhibus.com/");
		}
	   @Test(dataProvider="data")
	  // @Parameters({"city1","city2"})
	   public void softAssert(String city1,String city2) throws InterruptedException{
		   
			
			
	   String str=driver.getTitle();
	   SoftAssert softAssertion= new SoftAssert();
	   System.out.println("softAssert Method Was Started");
	   softAssertion.assertEquals(str,"Book Bus Tickets Online at Lowest Fare, Flat ₹500 Cashback On Bus Booking | AbhiBus");
	   System.out.println("softAssert Method Was Executed");
	   
	  // WebElement element= driver.findElement(By.id("source"));
	   JavascriptExecutor JS = (JavascriptExecutor)driver;
	// To enter username
	JS.executeScript("document.getElementById('source').value='"+city1+"'");
	  // element.sendKeys(city1);
	   WebElement element1= driver.findElement(By.id("destination"));
	   element1.sendKeys(city2);
	  
	  // String ele=element.getAttribute("value");
	  // System.out.println(ele);
//	   if(ele.equals("Gondia")) 
//	   {
//		   System.out.println("Sendkeys gondia is done");
//	   }else
//	   {
//		   System.out.println("Sendkeys gondia is not done");
//	   }
	   
	    
		Thread.sleep(5000);
		
	   // softAssertion.assertAll("execute ");
	   }
	   @Test
	   public void hardAssert(){
		   
		  
			String str=driver.getTitle();

	   System.out.println("hardAssert Method Was Started");
	   Assert.assertEquals(str,"Book Bus Tickets Online at Lowest Fare, Flat ₹500 Cashback On Bus Booking | AbhiBus");
	   System.out.println("hardAssert Method Was Executed");
	   
	   }
	   
	  @DataProvider(name="data")
	  public Object[][] cityname(){
		  Object [][] obj=new Object[2][2];
		  obj[0][0]="Nagpur";
		  obj[0][1]="Pune";
		  obj[1][0]="Hyearabad";
		  obj[1][1]="Banglore";
		  
		  return obj;
	  }
		public void arrmethod() 
		{
			
		   System.out.println("this is test method");
			   
		  
		}
	  @AfterMethod
	  public void closebrowser()
	  {
		driver.quit();
	  }
	
	 }


