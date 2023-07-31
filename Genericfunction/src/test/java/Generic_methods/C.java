package Generic_methods;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import utils.Log;

class Z {
	Z(String s) {
	}

	private void method(int x) {
	}

	final void method1() {
	}
}

class Y extends Z {
	Y(String s) {
		super(s);
		// TODO Auto-generated constructor stub
	}

	public void method() {
	}
}

public class C {
public int[] reverseArray(int[] arr) {
	int [] temp=new int[arr.length];
	for(int i=0;i<arr.length;i++) {
		temp[temp.length-i-1]=arr[i];
	}
	return temp;
}
static String add_Binary(String x, String y)
{

    // Initializing result
    String res = "";

    // Initializing digit sum
    int d = 0;

    // Traversing both the strings starting
    // from the last characters
    int k = x.length() - 1, l = y.length() - 1;
    while (k >= 0 || l >= 0 || d == 1) {

        // Computing the sum of last
        // digits and the carry
        d += ((k >= 0) ? x.charAt(k) - '0' : 0);
        d += ((l >= 0) ? y.charAt(l) - '0' : 0);

        // When the current digit's sum is either
        // 1 or 3 then add 1 to the result
        res = (char)(d % 2 + '0') + res;

        // Computing carry
        d /= 2;

        // Moving to the next digits
        k--;
        l--;
    }

    return res;
}
public static long factorial(long n) {
	if(n==0) {
		return 1;
	}else {
		return n*factorial(n-1);
	}
}
public static void reverse(int[]arr,int start, int end) {
	if(start>=end) {
		return;
	}else {
	int temp=arr[start];
	arr[start]=arr[end];
	arr[end]=temp;
	reverse(arr,start+1,end-1);
	
	}
}
	public static void main(String[] args) throws Exception  {
		//long start=System.currentTimeMillis();
//	System.setProperty("WebDriver.chrome.driver", "chromedriver.exe");
//	WebDriver driver=new ChromeDriver();
//	driver.manage().deleteAllCookies();
//	driver.manage().window().maximize();
//	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
//	driver.get("http://www.flipkart.com");
//	driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
//	driver.findElement(By.xpath("//input[@class='_3704LK']")).sendKeys("iphone");
//	
//	Thread.sleep(2000);
//	
//	  driver.findElement(By.xpath("//form//ul//li[1]")).click();
    Log.info("The given String is :" );
		String str="Aayesh";
		Log.info("Thei codepoint at given index");
		int r=str.codePointAt(0);
		Log.info("Printing codepoint ");
		System.out.println(r);
		Log.info("Converting to char ");
		char c=(char)r	;
		Log.info("Printing the given character");
		System.out.println(c);
	}
}
