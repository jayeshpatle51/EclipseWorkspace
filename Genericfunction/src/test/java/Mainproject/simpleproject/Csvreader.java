package Mainproject.simpleproject;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

interface female {
	public String name = "Jaysh";

	void sistername();

	void mothername();

	void sisterinlaw();
}

class Book {
	int id;
	String name, author, publisher;
	int quantity;

	public Book(int id, String name, String author, String publisher, int quantity) {
		this.id = id;
		this.name = name;
		this.author = author;
		this.publisher = publisher;
		this.quantity = quantity;
	}
}

abstract class myfamilyfemale implements female {
	abstract void mybrothername();

	String lastname = "patle";

	void myname() {
		System.out.println("My name is jan");
	}
}

class myfamily extends myfamilyfemale {

	@SuppressWarnings("static-access")
	@Override
	public void sistername() {
		String lastname = "jae";
		String name = "aj";
		super.lastname = lastname;

		System.out.println("My sister name is gayatri" + lastname);

	}

	@Override
	public void mothername() {
		System.out.println("My mother name is Pushpa");

	}

	@Override
	public void sisterinlaw() {
		System.out.println("My sisterinlaw name is sandhya");

	}

	@Override
	void mybrothername() {
		System.out.println("My brother name is Jitendra");
	}

}

class Vehicle {
	Vehicle() {
		System.out.println("Vehicle is created.");
	}
}

class Bike extends Vehicle {
	Bike() {
		System.out.println("Bike is created.");
	}

	Bike(String brand) {
		this();

		System.out.println("Bike brand is " + brand);
	}

}

public class Csvreader extends grhombus

{

	int a = 10;

	// static variable
	int b = 20;

	void GFG() {
		// referring current class(i.e, class RR)
		// instance variable(i.e, a)
		this.a = 100;

		System.out.println(a);

		// referring current class(i.e, class RR)
		// static variable(i.e, b)
		this.b = 600;

		System.out.println(b);
	}

	public static void reverseString(String str) {
		char r;
		for (int i = str.length() - 1; i >= 0; i--) {
			r = str.charAt(i);
			System.out.print(r);
		}

	}

	public static int linearSearch(int[] arr, int key) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == key) {
				return i;
			}
		}
		return -1;
	}

	public static String reverseStringwithchar(String str) {
		char r;
		String str1 = "";
		for (int i = 0; i < str.length(); i++) {
			r = str.charAt(i);
			str1 = r + str1;
		}
		return str1;
	}

	public int sum(int a, int b) {
		a = 40;
		b = 80;
		int c = a + b;
		return c;
	}

	public void swap(Csvreader c) {
		int temp;
		temp = c.d;
		c.d = c.f;
		c.f = temp;

	}

	int d = 30;
	int f = 50;

	public void method1(int num1, float num2) {
		System.out.println("int-float method");
	}

	public void method1(int num1, int num2) {
		System.out.println("float-int method");
	}

	public static String concatWithString() {
		String t = "Java";
		for (int i = 0; i < 10000; i++) {
			t = t + "Tpoint";
		}
		return t;
	}

	public static String concatWithStringBuffer() {
		String stw = " ";
		StringBuffer sb = new StringBuffer("Java");
		for (int i = 0; i < 100; i++) {
			sb.append("Tpoint" + i);

		}
		return sb.toString();
	}

	public static void main(String[] args) throws NumberFormatException, IOException, InterruptedException {

		Set<String> set = new HashSet<String>();
		set.add("Jayesh");
		set.add("Nepalchand");
		set.add("patle");
		set.add("from");
		set.add("Gondia");

		Set<String> set1 = new HashSet<String>();
		set1.add("Jayesh");
		set1.add("nepal");
		set1.add("patle");
		set1.add("Mumbai");

		ArrayList<Set<String>> list = new ArrayList<>();
		list.add(set1);

		System.out.println(list);

		String st = list.toString();
		System.out.println(st.length());
		st = st.substring(2, st.length() - 2);
		System.out.println(st);
		String[] starray = st.split(", ");

		Map<Integer, Integer> map = new HashMap<>();
		int count = 1;

		int[] arr = { 1, 2, 3, 3, 4, 5, 5, 7, 34, 54, 56, 34, 78, 45, 33, 33, 54 };
		ArrayList<String> arrlist = new ArrayList<>();

	}

	public static <T> Map<T, Long> countByClassicalLoop(List<T> inputList) {
		Map<T, Long> resultMap = new HashMap<>();
		for (T element : inputList) {
			if (resultMap.containsKey(element)) {
				resultMap.put(element, resultMap.get(element) + 1L);
			} else {
				resultMap.put(element, 1L);
			}
		}
		return resultMap;
	}

	public static int findIndex(int[] my_array, int t) {
		if (my_array == null)
			return -1;
		int len = my_array.length;
		int i = 0;
		while (i < len) {
			if (my_array[i] == t)
				return i;
			i = i + 1;
		}
		return -1;
	}

	public static boolean nofound(int[] arr, int n) {
		for (int a : arr) {
			if (a == n) {
				return true;
			}
		}
		return false;

	}

	public static void scrollintoview(WebDriver driver) {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("window.scrollBy(0,200)");

	}

	public static void scrolltopagedown(WebDriver driver) {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");

	}

	public static void scrollpagetoelement(WebElement element, WebDriver driver) {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("arguments[0].scrollIntoView();", element);
	}

	public static int remdup(int[] arr, int n) {
		if (n == 0 || n == 1) {
			return n;
		}
		int temp[] = new int[n];
		int j = 0;
		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] != arr[i + 1]) {
				temp[j++] = arr[i];
			}

		}
//		j=j+1;
//		for(int k=0;k<temp.length;k++) {
//			if(temp[k]!=arr[arr.length-1])
//		temp[j]=arr[arr.length-1];
//		}

		for (int i = 0; i < temp.length; i++) {
			arr[i] = temp[i];
		}
		return j;
	}

	@Override
	void myname() {
		System.out.println("My name is jayesh");

	}

//		String[] str3=strarray[0].toString().split("=");
//		HashMap<String , String> hashmap=new HashMap<String, String>();
//		hashmap.put(str3[0], str3[1]);
//		System.out.println(hashmap);

//		System.out.println("Given even nos are: ");
//		for(int i=0;i<arr.length;i++)
//		{
//		if(arr[i]%2==0) {
//			System.out.println(arr[i]);
//		}
//		}
//		System.out.println("Given odd nos are : ");
//		for(int i=0;i<arr.length;i++)
//		{
//		if(arr[i]%2!=0) {
//			System.out.println(arr[i]);
//		}
//		}

//	    FileOutputStream fout=new FileOutputStream("C:\\Jayesh\\mfile.xlsx");  
//	    PrintStream pout=new PrintStream(fout);  
//	    pout.println(1900);  
//	    pout.println("Hello Java");  
//	    pout.println("Welcome to Java");  
//	    pout.close();  
//	    fout.close(); 	

}

abstract class grhombus {
	abstract void myname();

	void mayname(String name) {
		System.out.println(name);
	}
}

class SumReturn {
	private int a;

	public SumReturn(int i) {
		a = i;
	}

	/* The addition method returns a SumReturn object with adding 100 into it. */
	public SumReturn addition() {
		SumReturn result = new SumReturn(a + 100);

		return result;
	}

	public void display() {
		System.out.println("Additon result: " + a);
	}
}

//		String a = "Helloo";
//			String b = "World";
////			String temp="";
////			
////			temp=a;
////			a=b;
////			b=temp;
////			
//			System.out.println(a.length());
//			System.out.println(b.length());
//			
//			System.out.println("Original value of a and b: "+ a+ " "+ b );
//			
//			a=a+b;
//			System.out.println(a);
//			System.out.println(a.length());
//			b=a.substring(0,a.length()-b.length());
//			System.out.println("length of b: "+ b.length());
//			a=a.substring(b.length());
//			System.out.println(a.length());
//            System.out.println(a+" "+b);
//		

//		ArrayList<String> arr=new ArrayList<String>();
//		
//		arr.add("Mumbai");
//		arr.add("Delhi");
//		arr.add("hyderabad");
//		arr.add("banglore");
//		arr.add("nagpur");
//		arr.add("chennai");
//		arr.add("gondia");
//		String str = "";
//		for(int i=0;i<arr.size();i++) {
//		 str=arr.get(i).toString();
//		
//		 System.out.println(str);
//		}
//		
//		Object[] str1=arr.toArray();
//		String[] str2=new String[str1.length];
//	 System.arraycopy(str1, 0, str2, 0, str1.length);
//		
//	 
//		for(String str3:str2) {
//			System.out.println(str3);
//		}
//		TreeMap map1=new TreeMap();
//		for(int i=0;i<arr.size();i++) {
//		map1.put(i+1, arr.get(i));	
//		
//		}
//		System.out.println(map1);
//		map1.replace(7,"gondia","london");
//		System.out.println(map1.keySet());
//		
//		Iterator itr= map1.keySet().iterator();
//		while(itr.hasNext()) {
//			System.out.println(itr.next());
//		}
//		
//		LinkedHashMap lmap=new LinkedHashMap(map1);
//		System.out.println(lmap);
//		

//System.setProperty("WebDriver.chrome.driver","chromedriver.exe");
//WebDriver driver=new ChromeDriver();
//driver.manage().deleteAllCookies();
//driver.manage().window().maximize();
//driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(50));
//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
//
//driver.get("https://www.abhibus.com/");
//
//String window=driver.getWindowHandle();
//String mainwindow=driver.getTitle();
//System.out.println(mainwindow);
//System.out.println(window);
//scrolltopagedown(driver);
//driver.findElement(By.xpath("//a[@href='http://www.facebook.com/abhibus']")).click();
//driver.findElement(By.xpath("//a[@href='http://twitter.com/abhibus']")).click();
//driver.findElement(By.xpath("//a[@href='http://www.youtube.com/user/abhibus']")).click();
//
//driver.findElement(By.xpath("//a[@href='https://www.instagram.com/abhibusindia/']")).click();
//driver.findElement(By.xpath("//a[@href='https://abhibus.tumblr.com/']")).click();
//driver.findElement(By.xpath("//a[@href='https://www.pinterest.com/abhibusindia/pins/']")).click();
//
//By fbusername=By.xpath("//input[@name='email']");
//By twitter=By.xpath("//input[@type='text']");
//By youtube=By.xpath("//input[@id='search']");
//By  instagram=By.xpath("//div//div//span[text()='Search']");
//By tumblr=By.xpath("//input[@type='text']");
//By pinterest=By.xpath("//input[@name='q']");
//
//
//Set<String> windows=driver.getWindowHandles();
//List<String> windowlist= new ArrayList<String>(windows);
//Collections.sort(windowlist);
//
//HashMap<String,String> windowsmap=new HashMap<>();
//windowsmap.put(window, mainwindow);
//for(int i=1;i<windowlist.size();i++)
//{
//	System.out.println("window id "+i+": " + windowlist.get(i));
//	driver.switchTo().window(windowlist.get(i));
//	String title=driver.getTitle();
//	String url=driver.getCurrentUrl();
//	System.out.println("window Title "+i+": "+title);
//	for(int j=0;j<5;j++)
//	{
//	List<WebElement> links=driver.findElements(By.xpath("//a"));
//	System.out.println(links.get(j).getText());
//	
//	}
//   if(title.contains("Twitter")) {
//	   driver.findElement(twitter).sendKeys("Twitter");
//   }
//	if(title.contains("Facebook")) {
//		driver.findElement(fbusername).sendKeys("jayesh");
//	}
//	if(title.contains("YouTube"))
//	{
//		driver.findElement(youtube).sendKeys("automation");
//	}
//	if(title.contains("Instagram"))
//	{
//		driver.findElement(instagram).sendKeys("jayesh");
//	}
//	if(title.contains("Services"))
//	{
//		driver.findElement(tumblr).sendKeys("Jayesh");
//	}
//	
//	windowsmap.put(windowlist.get(i), title);
//}
//
//Iterator<Entry<String,String>> itr=windowsmap.entrySet().iterator();
//do {
//	System.out.println(itr.next());
//}while(itr.hasNext());

//driver.switchTo().window(itr.next());
//String str=driver.getTitle();
//System.out.println(str);

//driver.switchTo().window(window);
//String mainwindowtitle=driver.getTitle();
//System.out.println(mainwindowtitle);
//
//if(mainwindow.equals(mainwindowtitle))
//{
//	System.out.println("Test is pass");
//}else
//{
//	System.out.println("Test is fail");
//}
//
//driver.quit();

//ArrayList<String> arraylist=new ArrayList<String>();
//
//arraylist.add("Gondia");
//arraylist.add("Nagpur");
//arraylist.add("Hyderabad");
//arraylist.add("pune");
//arraylist.add("Mumbai"); 
//arraylist.add("Gondia");
//
//Iterator itr=arraylist.iterator();
//
//while(itr.hasNext()) {
//	System.out.println(itr.next());
//}
//HashMap<String,Integer> hm=new HashMap<String,Integer>();
//for(int i=0;i<arraylist.size();i++) {
//hm.put(arraylist.get(i), arraylist.indexOf(arraylist.get(i)));
//
//}
//Iterator itr1=hm.entrySet().iterator();
//while(itr1.hasNext()) {
//	System.out.println(itr1.next());
//}
//
//
//Set<Map.Entry<String,Integer>> map=hm.entrySet();
//
//for(Map.Entry<String, Integer> set:map) {
//	System.out.println(set.getKey()+" "+set.getValue());
//}
//

/*
 * Bike bike = new Bike("pulser");
 * 
 * new Csvreader().GFG(); HashMap<Integer,String> map=new
 * HashMap<Integer,String>(); map.put(102, "Jayesh"); map.put(105, "Jitendra");
 * map.put(110, "sandhya"); map.put(101, "gayatri"); map.put(103, "rahul");
 * map.put(115, "devesh"); map.put(104, "Harsh");
 * System.out.println("Before sorting map: "); Iterator
 * itr=map.entrySet().iterator(); while(itr.hasNext()) {
 * System.out.println(itr.next()); }
 * 
 * TreeMap<Integer,String> treemap=new TreeMap<Integer,String>(map);
 * treemap.put(102, "Jayesh"); treemap.put(105, "gayatri"); treemap.put(107,
 * "rahul"); System.out.println("After sorting hashMap: "); Iterator
 * itr1=treemap.entrySet().iterator(); while(itr1.hasNext()) {
 * System.out.println(itr1.next()); }
 * 
 * 
 * 
 * ArrayList<String> list =new ArrayList<String>();
 * 
 * Set<Map.Entry<Integer, String> > entrySet = treemap.entrySet();
 * 
 * 
 * Map.Entry<Integer, String> [] entryArray = entrySet.toArray( new
 * Map.Entry[entrySet.size()]);
 * 
 * 
 * 
 * for(int i=0;i<treemap.size();i++) {
 * 
 * list.add(entryArray[i].getKey()+entryArray[i].getValue()); }
 * System.out.println("The given arraylist is :"); for(int
 * i=0;i<list.size();i++) { System.out.println(list.get(i)); }
 */

/*
 * String month="January 2026"; String date="25";
 * 
 * System.setProperty("WebDriver.chrome.driver", "chromedriver.exe"); WebDriver
 * driver=new ChromeDriver(); driver.manage().deleteAllCookies();
 * driver.manage().window().maximize();
 * driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
 * 
 * driver.get("http://flights.qedgetech.com/");
 * driver.findElement(By.xpath("//input[@name='email']")).sendKeys(
 * "jayeshpatle51@gmail.com");
 * driver.findElement(By.xpath("//input[@name='password']")).sendKeys(
 * "927380Jit#");
 * driver.findElement(By.xpath("//button[@type='submit']")).click();
 * 
 * driver.findElement(By.xpath("//input[@id='search-date']")).click();
 * while(true) { String
 * text=driver.findElement(By.xpath("//div[@class='ui-datepicker-title']")).
 * getText(); if(text.equals(month)) { break; } else {
 * driver.findElement(By.xpath("//a//span[text()='Next']")).click(); } }
 * Thread.sleep(3000);
 * driver.findElement(By.xpath("//a//span[text()='Prev']")).click();
 * driver.findElement(By.xpath("//tbody//tr//td//a[text()="+date+"]")).click();
 */
/*
 * driver.get("https://msrtc.maharashtra.gov.in/");
 * driver.findElement(By.xpath("//input[@id='journeydate']")).click();
 * WebElement
 * yearlist=driver.findElement(By.xpath("//select[@class='datepick-new-year']"))
 * ;
 * 
 * Select year=new Select(yearlist); year.selectByVisibleText("2022");
 * 
 * WebElement
 * monthlist=driver.findElement(By.xpath("//select[@class='datepick-new-month']"
 * ));
 * 
 * Select month=new Select(monthlist); month.selectByVisibleText("November");
 * 
 * String dt="20";
 * 
 * WebElement date=driver.findElement(By.xpath("//table[@class='datepick']"));
 * List<WebElement> rows=date.findElements(By.tagName("tr")); boolean
 * cond=false; for(int i=1;i<rows.size();i++) { List<WebElement>
 * col=rows.get(i).findElements(By.tagName("td")); for(int j=0;j<col.size();j++)
 * { if(col.get(j).getText().equals(dt)) { col.get(j).click(); cond=true; break;
 * } } if(cond) { break; } }
 */

/*
 * String
 * str="my name is jayesh nepalchand patle from gondia jayesh nepalchand patle";
 * 
 * System.out.println(str);
 * 
 * String[] str1=str.split(" ");
 * 
 * for(int i=0;i<str1.length;i++) { System.out.print(str1[i]+ " "); }
 * 
 * ArrayList<String> list=new ArrayList<String>(Arrays.asList(str1));
 * 
 * System.out.println("\n"+list); Collections.sort(list);
 * System.out.println(list);
 * 
 * HashSet<String> set=new HashSet<String>(list); System.out.println(set);
 * 
 * 
 * ArrayList<String> list1=new ArrayList<String>(set); HashMap<String,Integer>
 * map=new HashMap<String,Integer>();
 * 
 * int i=1; for(String str3 :list1) {
 * 
 * 
 * map.put(str3,i); i++;
 * 
 * } System.out.println(map);
 * 
 * 
 * 
 * Iterator itr= map.entrySet().iterator(); while(itr.hasNext()) {
 * System.out.println(itr.next()); } String no="1"; int in=Integer.parseInt(no);
 * System.out.println(in); int ii=234; String no1=String.valueOf(ii);
 * 
 * System.out.println(no1); StringBuilder sb= new StringBuilder(no1);
 * sb=sb.reverse(); System.out.println(sb.toString()); String
 * str5=sb.toString(); int int1=Integer.parseInt(str5);
 * System.out.println(int1);
 * 
 * // instance of Integer type Test<Integer> iObj = new Test<Integer>(15);
 * System.out.println(iObj.getObject());
 * 
 * // instance of String type Test<String> sObj = new
 * Test<String>("GeeksForGeeks"); System.out.println(sObj.getObject());
 * Test1<String,Integer> object=new Test1<String, Integer>(str5, int1);
 * object.print(); } } class Test<T> { // An object of type T is declared T obj;
 * Test(T obj) { this.obj = obj; } // constructor public T getObject() { return
 * this.obj; } } class Test1<T,N>{ T obj; N obj2; Test1(T obj,N obj2){
 * this.obj=obj; this.obj2=obj2;
 * 
 * } public void print(){
 * 
 * System.out.println(obj+ ", "+obj2); }
 */
