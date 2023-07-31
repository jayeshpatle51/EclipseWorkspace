package practiceprograms;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.List;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

class Class1{
	 int id;
	 String name;
	 Class1(){
		 System.out.println("This is default constructor");
		
	 }
	
	Class1(int id,String name,int idd,String lastname,int iddd,String city){
		this();
		Class1 c=new Class1();
		Class1 c1=new Class1();
		this.id=id;
		this.name=name;
		c.id=idd;
		c.name=lastname;
		c1.id=iddd;
		c1.name=city;
	int i=	c1.getid();
		String j=c1.getName();
		
		System.out.println(i+" "+j);
		
	}
	public int getidd() {
		return id;
	}
	public String getLastname() {
		return name;
	}
	public int getid() {
		return id;
	}
	public String getName() {
		return name;
	}
}
class Class2 {
	
	
}


public class Overriding  {
	
  public void verifylink(String linkurl) {
	  try {
		URL url=new URL(linkurl);
		HttpURLConnection http=(HttpURLConnection)url.openConnection();
		int code=http.getResponseCode();
		System.out.println(url+" :- "+code);
		if(code>=400) {
			System.out.println("The given link is Broken link");
		}else {
			System.out.println("The given link is valid");
		}
	} 
	  catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	  catch(ClassCastException e) {
		  e.printStackTrace();
	  }
	  catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	 
  }
  public static void selectionSort(int[] arr){  
      for (int i = 0; i < arr.length - 1; i++)  
      {  
          int index = i;  
          for (int j = i + 1; j < arr.length; j++){  
              if (arr[j] < arr[index]){  
                  index = j;//searching for lowest index  
              }  
          }  
          int smallerNumber = arr[index];   
          arr[index] = arr[i];  
          arr[i] = smallerNumber;  
      }  
  }  
	
  public static void insertionSort(int array[]) {  
      int n = array.length;  
      for (int j = 1; j < n; j++) {  
          int key = array[j];  
          int i = j-1;  
          while ( (i > -1) && ( array [i] > key ) ) {  
              array [i+1] = array [i];  
              i--;  
          }  
          array[i+1] = key;  
      }  
  }  
  
	public static void main(String[] args) throws IOException {
		String str="Configure.properties";
		FileInputStream file=new FileInputStream(str);
	Properties prop =new Properties();
	prop.load(file);
	
	WebDriverManager.chromedriver();
	WebDriver driver=new ChromeDriver();
	driver.manage().deleteAllCookies();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
	driver.get(prop.getProperty("url"));
	
	findElementByxpath(driver,"//a[text()='Create New Account']").click();
	String s=findElementByxpath(driver,"(//p[@class='_58mv'])[1]").getText();
	System.out.println(s);
	TakesScreenshot screen=(TakesScreenshot)driver;
	File src=screen.getScreenshotAs(OutputType.FILE);
	File dest=new File("D://screenshot.png");
	 FileUtils.copyFile(src, dest);
//    List<WebElement> list=findElementsByxpath(driver, "//ul//li");
//    System.out.println(list.size());
//   Iterator<WebElement> itr=list.iterator();
//   while(itr.hasNext()) {
//	  String str1= itr.next().getText();
//	  System.out.println(str1);
  // }
	}
	
	
	
	public static WebElement findElementByxpath(WebDriver driver,String path) {
		 WebElement element=driver.findElement(By.xpath(path));
		 return element;
	}
	
	public static List<WebElement> findElementsByxpath(WebDriver driver,String path) {
		 List<WebElement> elements=driver.findElements(By.xpath(path));
		 return elements;
	}
}
class Teacher<T,M,K>{
	String str;
	int i;
	int j;
	
	public boolean add(String str,int i,int j) {
		this.str=str;
		this.i=i;
		this.j=j;
		return true;
		}
	public void print() {
		System.out.println(str+" "+i+" "+j);
	
	}
}