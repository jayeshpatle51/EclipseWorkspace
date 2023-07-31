package Mainproject.simpleproject;

import java.awt.AWTException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;
interface jayesh{
	public void method1();
}
interface jitendra{
	public void method1(int n);
}
class patle{
	public void method2() {}
}
class nepalchand extends patle {
    patle p=new nepalchand();
    @Override
    public void method2() {
    	// TODO Auto-generated method stub
    	super.method2();
    }
 

	public final void method1() {
		// TODO Auto-generated method stub
		
	}

	public void method1(int n) {
		// TODO Auto-generated method stub
		
	}
	
}

class superkeyword {
	int i = 60;
	int j = 56;

	public superkeyword() {
		System.out.println("super");
	}

	public superkeyword(int i) {
		System.out.println("super" + this.i);
	}

	public static void mykeyword() {
		System.out.println("this is my keyword");
	}
}




public class thiskeyword  {
	superkeyword sp;

	int a = 10;
	int b = 19;

	public thiskeyword() {
       sp=new superkeyword();
      sp.mykeyword();
		

		System.out.println("This is ");

	}
	public thiskeyword(int a,int b) {
		a=this.a;
		b=this.b;
	}

	public void numbers(int a, int b) {
		
		a = 9;
		b = 4;
		

		System.out.println(a + "  " + b);
	}

	public static void digits() {
		
		System.out.println("this is static");
		
	}
	static int l=0;
    static void  recursion() {
    	
    	l++;
    	if(l<=5) {
    		
    	System.out.println("This is recursion method");
    	recursion();
    	}
    	
    	
    }
    static int count=0;  
    static void p(){  
    count++;  
    if(count<=5){  
    System.out.println("hello "+count);  
    p();  
    }  }
    
    
    public static void reverse(String str) {
    	if((str==null)||(str.length()<=1))
    	{
    		System.out.println(str);
    	}
    	else 
    	{
    		System.out.print(str.charAt(str.length()-1));
    		reverse(str.substring(0,str.length()-1));
    	}
    }
   public static void removedup(char[] arr,int n)
   {
	   int index=0;
	   for(int i=0;i<arr.length;i++)
	   {
		   int j;
		   for( j=0;j<i;j++)
		   {
			   if
			   (arr[i]==arr[j]) {
				   break;
			   }
		   }if(j==i) {
			   arr[index++]=arr[i];
		   }
	   
	   System.out.println(String.valueOf(Arrays.copyOf(arr,index)));   
   }   
   }
   
   public void nameshort() {
	   
	   Scanner s = new Scanner(System.in);
	    String st = s.nextLine();
	    String sr = "";
	    sr = sr+st.charAt(0);
	    sr = sr+". ";
	    for (int i = 0; i<st.length();i++){
	      if(st.charAt(i) == ' ' && st.charAt(i+1)!=' ' && i+1<st.length()){
	        sr = (sr+st.charAt(i+1)).toUpperCase();
	        sr = sr+". ";
	      }
	    }
	    String last_wrd = "";
	    //to get the last word
	    for(int i = st.length()-1;i>=0;i--){
	      if(st.charAt(i) == ' '){
	        last_wrd = st.substring(i+2);
	        break;
	      }
	    }
	    //to remove last ". "
	    sr = sr.substring(0,sr.length()-2);
	    sr = sr+last_wrd;
	    System.out.println(sr);
   }
   public static boolean isarmstrong(int number)
   {
	   int num=number;
	   int result=0;
	   while(num!=0) {
	   
	  int remainder=num%10;
	   result=result + remainder*remainder*remainder;
	  num=num/10;
	   }
	   
	  if(number==result)
	  {
		  return true;
	  }
	  return false;
   }
  final void sl() {
	  
  }

  public  static int factorial(int no) {
	  if(no==0) {
		  return 1;
	  }
		  
	  else {
		  return no*factorial(no-1);
	  }
	  
  }
  public static int fibonacci(int no) {
	 
	  if((no==0)||(no==1)) {
		  return no;
	  }else {
		  
		  return fibonacci(no-1)+fibonacci(no-2);
		  
	  }
  }
  public static void oddevenarray(int [] arr) {
	  for(int i=0;i<arr.length;i++) {
		  
		  if(arr[i]%2==0) {
			  System.out.println("The given even no is: "+arr[i]+" ");
		  }
           if(arr[i]%2!=0){
        	   
			  System.out.println("The given odd no is: "+arr[i]+" ");
		  }
	  }
  }
  static final int MAX_CHAR = 256;
  
  static void getOccuringChar(String str)
  {
       
      // Create an array of size 256
      // i.e. ASCII_SIZE
      int count[] = new int[MAX_CHAR];

      int len = str.length();

      // Initialize count array index
      for (int i = 0; i < len; i++)
          count[str.charAt(i)]++;

      // Create an array of given String size
      char ch[] = new char[str.length()];
      for (int i = 0; i < len; i++) {
          ch[i] = str.charAt(i);
          int find = 0;
          for (int j = 0; j <= i; j++) {

              // If any matches found
              if (str.charAt(i) == ch[j])
                  find++;
          }

          if (find == 1)
              System.out.println(
                  "Number of Occurrence of "
                  + str.charAt(i)
                  + " is:" + count[str.charAt(i)]);
      }
  }
  static int firstPos(String str,
          int start,
          int end)
{
int firstChar = -1;

// Get the position of
// first character in
// the string
for(int i = start; i <= end; i++)
{
if(str.charAt(i) >= 'a'&&
str.charAt(i) <= 'z')
{
  firstChar = i;
  break;
}
}

return firstChar;
}

//Utility function to get
//the position of last
//character in the string
static int lastPos(String str,
      int start,
      int end)
{
int lastChar = -1;

// Get the position of last
// character in the string
for(int i = start; i >= end; i--)
{
if(str.charAt(i) >= 'a'&&
str.charAt(i) <= 'z')
{
  lastChar = i;
  break;
}
}

return lastChar;
}

//Function to check if the
//characters in the given
//string forms a Palindrome
//in O(1) extra space
static boolean isPalindrome(String str)
{
int firstChar = 0,
lastChar = str.length() - 1;
boolean ch = true;

for (int i = 0; i < str.length(); i++)
{
firstChar = firstPos(str, firstChar,
                      lastChar);
lastChar = lastPos(str, lastChar,
                      firstChar);

// break, when all
// letters are checked
if (lastChar < 0 || firstChar < 0)
  break;
if (str.charAt(firstChar) ==
  str.charAt(lastChar))
{
  firstChar++;
  lastChar--;
  continue;
}

// if mismatch found,
// break the loop
ch = false;
break;
}

return ch;

}
public static boolean ifanagram(String s1, String s2) {
	char[] str1=s1.toCharArray();
	char[] str2=s2.toCharArray();
	int n1=str1.length;
    int n2=str2.length;
    if (n1!=n2) 
    	return false;
    
    	Arrays.sort(str1);
    	Arrays.sort(str2);
    	for(int i=0;i<n1;i++) 
    	if(str1[i]==str2[i])
    		return true;
    	return false;
    	
		
}
static int removeDuplicates(int arr[], int n)
{
    // Return, if array is empty
    // or contains a single element
    if (n==0 || n==1)
        return n;
  
    int[] temp = new int[n];
     
    // Start traversing elements
    int j = 0;
    for (int i=0; i<n-1; i++)
        // If current element is not equal
        // to next element then store that
        // current element
        if (arr[i] != arr[i+1])
            temp[j++] = arr[i];
     
    // Store the last element as whether
    // it is unique or repeated, it hasn't
    // stored previously
    temp[j++] = arr[n-1];  
     
    // Modify original array
    for (int i=0; i<j; i++)
        arr[i] = temp[i];
  
    return j;
}
static void removeDups(int[] arr, int n)
{

    // Hash map which will store the
    // elements which has appeared previously.
    HashMap<Integer,
            Boolean> mp = new HashMap<>();

    for (int i = 0; i < n; ++i)
    {

        // Print the element if it is not
        // there in the hash map
        if (mp.get(arr[i]) == null)
            System.out.print(arr[i] + " ");

        // Insert the element in the hash map
        mp.put(arr[i], true);
    }
}
public static void printduplicate(String word) {
	char[] ch=word.toCharArray();
	Map<Character, Integer> map=new HashMap<>();
	for(int i=0;i<ch.length;i++) {
		//int count=1;
		if(map.containsKey(ch[i])) {
			map.put(ch[i], map.get(ch[i])+1	);
		}else {
		map.put(ch[i], 1);
		}
	}
	Set<Entry<Character, Integer>> entryset=map.entrySet();
	for(Entry<Character, Integer> entry:entryset) {
		if(entry.getValue()>1) {
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
	}
}

static {
	System.out.println("one");
}
 
// Class 2
// Helper class implementing interface

 
	public static void main(String[] args) throws InterruptedException, IOException, AWTException {
		
		System.out.println("two");
//	    driver.findElement(By.linkText("Create New Account")).click();
//	    for(int i=1;i<4;i++) {
//	    	
//	    	if(i==3) {
//	    		i=-1;
//	    	
//	    WebElement element=driver.findElement(By.xpath("//input[@class='_8esa' and @value='"+i+"']"));
//	   String g= element.getText();
//	   System.out.println(g);
//	   Thread.sleep(2000);
//	    element.click();
//	    break;
//	    	}
//	    	else {WebElement element=driver.findElement(By.xpath("//input[@class='_8esa' and @value='"+i+"']"));
//	 	   String g= element.getText();
//		   System.out.println(g);
//		   Thread.sleep(2000);
//		    element.click();
//		    
//		    }
//	    	
//	    }
//	    boolean b=element.isSelected();
//	    if(!b) {
//	    	element.click();
//	    }else {
//	    	System.out.println("element is already selected");
//	    }
	    
	   // WebElement element=driver.findElement(By.xpath("//div[@class='XDyW0e']//*[local-name()='svg']"));
//	    driver.findElement(By.name("q")).sendKeys("selenium");
//	    WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(30));
//	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//ul[@class='G43f7e'])[1]")));
//	    List<WebElement> list=	driver.findElements(By.xpath("//li[@class='sbct']"));
//	for(int i=0;i<list.size();i++) {
//	String str=list.get(i).getText();
//	System.out.println(str);
//	
//	}
//	String st=list.get(1).getText();
//	
//		Assert.assertEquals("selenium", st);
//	
	
//		Robot robot = new Robot();
//		robot.delay(5000);
//		robot.keyPress(KeyEvent.VK_TAB);
//		robot.keyPress(KeyEvent.VK_TAB);
//		robot.keyPress(KeyEvent.VK_TAB);
//		robot.delay(2000);
//		robot.keyPress(KeyEvent.VK_ENTER);
}}
class Students {
    int rollno;
    String name, address;
 
    // Constructor
    public Students(int rollno, String name, String address)
    {
 
        // This keyword refers to current instance itself
        this.rollno = rollno;
        this.name = name;
        this.address = address;
    }
 
    public Students(int l, Object name2, Object address2) {
		// TODO Auto-generated constructor stub
	}

	// Method of Student class
    // To print student details inside main() method
    public String toString()
    {
 
        return this.rollno + " " + this.name + " "
            + this.address;
    }
}

class Sortbyroll implements Comparator<Students> {

	@Override
	public int compare(Students a, Students b) {
		// TODO Auto-generated method stub
		return a.rollno-b.rollno;
	}
	 
    // Method
    // Used for sorting in ascending order of
    // roll number
  
}