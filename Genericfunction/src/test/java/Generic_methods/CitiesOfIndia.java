package Generic_methods;

import java.time.Duration;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CitiesOfIndia {

	public static void main(String[] args) {
		System.setProperty("WebDriver.Chrome.driver","chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		//driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		 
		driver.get("https://en.wikipedia.org/wiki/List_of_cities_in_India_by_population");
		
		//WebElement element=driver.findElement(By.xpath("(//table)[1]"));
		List<WebElement> elements=driver.findElements(By.xpath("(//table)[1]//tbody//tr"));
		HashMap<String,String> map=new HashMap<String,String>();
		ArrayList<String> list1=new ArrayList<>();
		System.out.println(" Size is "+ elements.size());
		for(int i=0;i<elements.size();i++) {
			List<WebElement> ele=elements.get(i).findElements(By.tagName("td"));
			for(int j=0;j<ele.size();j++) {
				
				String rank=ele.get(j).getText();
				
				if(j==ele.size()-1) {
					map.put(ele.get(1).getText(), ele.get(ele.size()-1).getText());
					
				}
				System.out.print(rank+ "|| ");
			}
			System.out.println();
		}
		Set<Entry<String, String>> set=map.entrySet();
		for(Entry<String,String> entry:set) {
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
		
	}

}
