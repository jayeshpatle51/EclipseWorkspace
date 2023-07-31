package Generic_methods;

import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class jayesh {
	int[] arr= {2,3};
	int random_number_gen(int min_range, int max_range){
	   int rand_number=0; // any random number
	    rand_number = ((rand_number * rand_number) / 10 ) % 9890;
	    return rand_number % (max_range+1-min_range) + min_range ; 
	}
public void randomcharecter(int min, int max) {
	
	char A=(char) min;
    char end=(char) max;
    System.out.println("charcters between "+ A +" to "+end);
      
    //Generate random int value from 50 to 100 
    System.out.println("Random value in int from "+min+" to "+max+ ":");
    int random_int = (int)Math.floor(Math.random()*(max-min+1)+min);
   char random=(char) random_int;
    System.out.println(random_int);
    System.out.println(random);
}
public void pascaltriangle() {
	int bin, p, q, r, x;
	Scanner s = new Scanner(System.in);
	System.out.println("Nos of Rows you want : ");
	r = s.nextInt();
	bin = 1;
	q = 0;

	System.out.println("Pascal triangle is given ");

	while (q < r) {

		for (p = 40 - 3 * q; p > 0; --p)
			System.out.print("-");
		for (x = 0; x <= q; ++x) {
			if ((x == 0) || (q == 0)) {
				bin = 1;
			} else {
				bin = (bin * (q - x + 1)) / x;
			}
			System.out.print("______");
			System.out.print(bin);
		}

		System.out.println("");
		++q;
	}

}
public void countchar(String str) {
	HashMap<Character,Integer> map=new HashMap<>();
	for(int i=0;i<str.length();i++) {
		if(map.containsKey(str.charAt(i))) {
			
			map.put(str.charAt(i),map.get(str.charAt(i))+1);
		}else {
			map.put(str.charAt(i), 1);
		}
	}
	System.out.println(map);
}
int MissingNumber(int array[], int n) {
    
    int sum=(n)*(n+1)/2;
   
   for(int i=0;i<array.length;i++)
   {
       sum-=array[i];
       
   }
   
   return sum;
}
static void removeDuplicates(int arr[], int n)
{
    // Return, if array is empty or contains a single
    // element
    

   int temp[] =new int[arr.length];

    // Start traversing elements
    int j = 0;
    for (int i = 0; i < n - 1; i++) {
        // If current element is not equal to next
        // element then store that current element
    	
     
    }
    
        

   
    }
public int power(int no, int pow) {
	int res=1;
	while(pow>0) {
		res=res*no;
		pow--;
	}
	return res;
}
public int[] rotateArray(int[] arr,int dist){
	int[] arr1=new int[arr.length];
if(dist>=arr.length) {
	System.out.println("no of Rotation should not equal or greater than array Size");
}else {

int i;
int temp=dist;
for( i=0;i<arr.length;i++){
if(temp<arr.length){
   arr1[temp]=arr[i];
temp++;
}else{
break;
}
}
int k=i;
for(int j=0;j<dist;j++){
arr1[j]=arr[k];
k++;
}

return arr1;
}
return arr;
}

int fun (int n) 
{
    int result = 0;
    if(n>0) {
    result = fun (n - 1);
    return result;
    }
    return result;
   
}
public String[] swap(String []arr,int i,int j) {
	
	String temp=arr[i];
	arr[i]=arr[j];
	arr[j]=temp;

	return arr;
}
public void printarr(String[] arr) {
	System.out.println();
	for(String str:arr) {
		System.out.print(str+ " ");
	}
}
public void printcom(String[] arr,int curindex) {
	if(curindex==arr.length-1) {
		printarr(arr);
		return;
	}
	for(int i=curindex;i<arr.length;i++) {
		swap(arr,i,curindex);
		printcom(arr,curindex+1);
		swap(arr,i,curindex);
	}
}

public static boolean
isValidPassword(String password)
{

    // Regex to check valid password.
    String regex = "^(?=.*[0-9])"
                   + "(?=.*[a-z])(?=.*[A-Z])"
                   + "(?=.*[@#$%^&+=])"
                   + "(?=\\S+$).{8,20}$";

    // Compile the ReGex
    Pattern p = Pattern.compile(regex);

    // If the password is empty
    // return false
    if (password == null) {
        return false;
    }

    // Pattern class contains matcher() method
    // to find matching between given password
    // and regular expression.
    Matcher m = p.matcher(password);

    // Return if the password
    // matched the ReGex
    return m.matches();
}

public static void verifyLinks(String linkUrl)
{
    try
    {
        URL url = new URL(linkUrl);

        //Now we will be creating url connection and getting the response code
        HttpURLConnection httpURLConnect=(HttpURLConnection)url.openConnection();
        httpURLConnect.setConnectTimeout(5000);
        httpURLConnect.connect();
        if(httpURLConnect.getResponseCode()>=400)
        {
        	System.out.println(linkUrl+" - "+"-"+httpURLConnect.getResponseCode()+"-"+ httpURLConnect.getResponseMessage()+"is a broken link");
        }    
   
        //Fetching and Printing the response code obtained
        else{
            System.out.println(linkUrl+" - "+"-"+httpURLConnect.getResponseCode()+"-"+httpURLConnect.getResponseMessage());
        }
    }catch (Exception e) {
  }
    }
public static void main(String[] args) {
	
System.setProperty("WebDriver.Chroeme.driver", "chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.manage().deleteAllCookies();
driver.manage().window().maximize();
driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

driver.get("http://www.google.com");

List<WebElement> links=driver.findElements(By.tagName("img"));
System.out.println(links.size());

for(int i=0;i<links.size();i++) {
	 WebElement image= links.get(i);
     String imageURL= image.getAttribute("src");
     System.out.println("URL of Image " + (i+1) + " is: " + imageURL);
	verifyLinks(imageURL);
	
	 try {
         boolean imageDisplayed = (Boolean) ((JavascriptExecutor) driver).executeScript("return (typeof arguments[0].naturalWidth !=\"undefined\" && arguments[0].naturalWidth > 0);", image);
         if (imageDisplayed) {
             System.out.println("DISPLAY - OK");
         }else {
              System.out.println("DISPLAY - BROKEN");
         }
     } 
     catch (Exception e) {
     	System.out.println("Error Occured");
     }
}
	



}

}

				   


