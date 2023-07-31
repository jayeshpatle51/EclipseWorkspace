package Generic_methods;

import java.io.IOException;
import java.text.DecimalFormat;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class WebTable {
	
	
	static By codeBy= By.xpath("//*[@id='pills-active']/table/tbody/tr/td[1]");
	static By nameBy= By.xpath("//*[@id='pills-active']/table/tbody/tr/th/div/a");
	static By changeBy=	By.xpath("//*[@id='pills-active']/table/tbody/tr/td[3]");
	static By volBy= By.xpath("//*[@id='pills-active']/table/tbody/tr/td[4]");
	static By closeBy= By.xpath("//a[text()='Close']");
	static By mostActiveBy= By.xpath("(//a[@class='nav-link btn btn-effect btn-white active' and @id='pills-active-tab'])[1]");
	

	public static void main(String[] args) {


		//		List<Integer> list1=new ArrayList<>(Arrays.asList(2,5,3,6,4,5,5));
		//		List<Integer> list2=new ArrayList<>(Arrays.asList(22,44,33,66,55,77,99));
		//		List<Integer> list3=new ArrayList<>(Arrays.asList(333,666,444,111,222,888,777));
		//		System.out.println(list1);
		//		List<Integer> sortedlist=new ArrayList<>(list1);
		//		Collections.sort(sortedlist);
		//		Collections.reverse(sortedlist);
		//		System.out.println(sortedlist);
		//		
		//		for(int i=0;i<list1.size();i++) {
		//			//List<Integer> set=new ArrayList<>();
		//			boolean con=false;
		//			int index=0;
		//			//int count=0;
		//			//int value=0;
		//			for(int j=0;j<list1.size();j++) {
		//				
		//				if(sortedlist.get(i)==list1.get(j)) {
		//					
		//					index=j;
		//					list1.set(index, null);
		//					con=true;
		//					break;
		//				}
		//				
		//				
		//				
		//			}if(con) {
		//				System.out.println(sortedlist.get(i) +" "+ list2.get(index)+" " +list3.get(index));
		//			}
		//		}

		System.setProperty("WebDriver.chrome.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.get("https://www.bursamalaysia.com/");


		
			List<String> arr=new ArrayList<>();
			List<Double>	doub=new ArrayList<>();
			List<String> sorted=new ArrayList<>();
			
				List<WebElement> Code=driver.findElements(codeBy);
				List<WebElement> Name=driver.findElements(nameBy);
				List<WebElement> Change=driver.findElements(changeBy);
				List<WebElement> Vol=driver.findElements(volBy);

				
				for(int m=0;m<Change.size();m++) {
					arr.add(Change.get(m).getText());
				}
			
				for(int j=0;j<Change.size();j++) {
					String str =Change.get(j).getText();
					if(!(str.length()==1)) {
						double d=Double.parseDouble(str);

						doub.add(d);
					}
				}
				Collections.sort(doub);
				Collections.reverse(doub);
				
				for(int k=0;k<doub.size();k++) {
					   String str1= new DecimalFormat("#0.000#").format(doub.get(k));
					  
					   if(str1.charAt(0)!='-' && !str1.equals("0.000")){
						   str1="+"+str1;
						  
					   sorted.add(str1);
					   }else {
						   sorted.add(str1);
					   }
				   }
				
				for(int n=sorted.size();n<10;n++) {
					
					sorted.add(n,"-");
				}

				for(int i=0;i<Change.size();i++) {
					boolean con=false;
					int index=0;
					//int count=0;
					//List<String> set=new ArrayList<>();
					for(int j=0;j<Change.size();j++) {

						//	System.out.println(sorted.get(i)+" "+arr.get(j));
						if(sorted.get(i).equals(arr.get(j))) {
							index=j;
							arr.set(index, null);
							con=true;
							break;
						}

					}if(con) {
						System.out.println(Code.get(index).getText()+"     | "+Name.get(index).getText()+"   | "+ sorted.get(i)+"  | " +Vol.get(index).getText());
					}
	}
				driver.quit();
	}			
}
