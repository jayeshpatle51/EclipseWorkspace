package practiceprograms;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;
import utils.XLUtils;


interface Thisinterface{

	public void m1();
	public void m2();


}
abstract class ThismyClass implements Thisinterface{
	public ThismyClass() {
		System.out.println("This is constructor of ThismyClass");
	}
	public void m1() {
		System.out.println("M1");

	}

	public void m2() {
		System.out.println("m2");

	}

}
class AnotherClass extends ThismyClass{

	public void m2() {
		System.out.println("This is new m2 method");
	}
	public void m3() {
		System.out.println("m3");
	}


}
public class Cat {
	public static int [] oddEven(int arr[]) {
		int[] arr1=new int[arr.length];
		int index=0;
		for(int i=0;i<arr1.length;i++) {

			if(arr[i]%2!=0) {
				arr1[index]=arr[i];
				index++;
			}

		}
		for(int j=0;j<arr1.length;j++) {
			if(arr[j]%2==0) {
				arr1[index]=arr[j];
				index++;
			}

		}
		return arr1;
	}

	public static void main(String args[])  throws InterruptedException, IOException {

					    	 System.setProperty("driver.chrome.webDriver", "chromeDriver.exe");
					         WebDriverManager.chromedriver().setup();
					         ChromeOptions options=new ChromeOptions();
					         options.addArguments("--disable-notifications");
					    	 WebDriver driver=new ChromeDriver(options);
					    	 driver.manage().deleteAllCookies();
					    	 driver.manage().window().maximize();
					    	 driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(40));
					    	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
					    	 driver.get("https://www.flipkart.com/");

         

		//			    	 String str="My name is Jayesh";
		//			         str=  str.toLowerCase();
		//			         Map<Character,Integer> map=new HashMap<>();
		//
		//			         for(int i=0;i<str.length();i++) {
		//			             if(str.charAt(i)!=' ') {
		//			                 map.put(str.charAt(i),map.getOrDefault(str.charAt(i), 0)+1);
		//			             }
		//			         }
		//
		//
		//			         for(Entry<Character,Integer> entry: map.entrySet()) {
		//			             if(entry.getValue()>1) {
		//			                 System.out.println(entry.getKey()+" "+entry.getValue());
		//			             }
		//			         }
		//			    	 
		//			  /\
		//			 /  \
		//			/    \
		//			------
		//		   |      |
		//		   |      |
		//		   |      |
		//		   |      |
		//		   |      |
		//		   |      |
		//		    ------
					    	 
        //driver.findElement(By.xpath("//a[text()='Login']")).click();
        Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		Thread.sleep(3000);
		driver.quit();

	}
	public static void printno(int no){

		if(no<=100) {

			System.out.println(no);

			printno(no+1);
		}


	}




	public void secondlargest(int a,int b,int c) {

		if(a==b && b==c) {
			System.out.println("All no are equal");
		}else if(a==b &&( a<c || a>c)) {
			System.out.println(a);
		}else if(b==c &&(b<a || b>a)){
			System.out.println(b);
		}else if(a==c && (a<b || a>b)){
			System.out.println(a);
		}else if(a>b && a<c) {
			System.out.println("a = " +a);
		}else if(b>a && b<c) {
			System.out.println("b = "+b);
		}else if(c>a && c<b) {
			System.out.println("c = "+c);
		}


	}
	public static void charPrinting(String file,String sheet,String str) throws IOException {

		for(int i=0;i<str.length();i++) {
			int index=0;
			for(int j='A';j<='Z';j++) {

				if(str.charAt(i)==j) {
					XLUtils.setCellData(file, sheet, i, index, ""+str.charAt(i));
					break;
				}
				index++;
			}
		}

	}
	public void chargreaterthanlength() {
		String str="Jayesh";

		int len=str.length();
		for(int i=0;i<len;i++) {
			int index=0;
			char c=str.toUpperCase().charAt(i);
			for(int j='A';j<='Z';j++) {

				if(c==j && index>len) {
					System.out.print(str.charAt(i));
					break;
				}

				index++;
			}}
	}
	public void spiceJet() {

		//     //WebElement from=driver.findElement(By.xpath("//div[text()='From']"));
		//     driver.findElement(By.xpath("(//input[@autocapitalize])[1]")).sendKeys("Mum");
		//     driver.findElement(By.xpath("(//input[@autocapitalize])[2]")).sendKeys("Hyderabad");
		//     		//driver.findElement(By.xpath("//div[text()='Hotels']")).click();
		//   WebElement ele=  driver.findElement(By.xpath("//div[text()='Departure Date']//following::div[1]//div[1]"));
		//   Thread.sleep(3000);
		//   //ele.click();
		//     driver.findElement(departuredate("2023", "September", "16")).click();
		//    WebElement passangers= driver.findElement(By.xpath("//div[text()='Passengers']"));
		//    passangers.click();
		//     Thread.sleep(2000);
		//   WebElement plusone=  driver.findElement(By.xpath("//div[@data-testid='Adult-testID-plus-one-cta']"));
		//   WebElement minusone=driver.findElement(By.xpath("//div[@data-testid='Adult-testID-minus-one-cta']"));
		// 
		//  
		//     passangers.click();
		//     driver.findElement(By.xpath("//div[text()='Currency']")).click();
		//     List<WebElement> elems=driver.findElements(By.xpath("//div[text()='Currency']//following::div[4]//child::div[1]"));
		//     for(int i=0;i<elems.size();i++) {
		//       if(elems.get(i).getText().equals("HKD")) {
		//     	  elems.get(i).click();
		//     	  break;
		//       }
		//     }
		//     
		//List<WebElement> relation= driver.findElements(By.xpath("//div[contains(@style,'grid-template-columns')]//*[local-name()='svg']"));
		//relation.get(0).click();  
		//
		//driver.findElement(By.xpath("//div[@data-testid='home-page-flight-cta']")).click();
		//Thread.sleep(3000);
		//     driver.quit();
	}
	public static void diagonal(String file,int rowno) throws IOException {
		XSSFWorkbook wb=new XSSFWorkbook();
		XSSFSheet sheet =wb.createSheet();
		XSSFRow row;
		int rowid=0;
		String str="*";
		int cellid=0;
		for(int i=0;i<rowno;i++) {
			row= sheet.createRow(i);
			Cell cell=row.createCell(i);
			cell.setCellValue(str);
		}
		FileOutputStream out = new FileOutputStream(
				new File(file));
		wb.write(out);
		wb.close();
		out.close();
	}
}
