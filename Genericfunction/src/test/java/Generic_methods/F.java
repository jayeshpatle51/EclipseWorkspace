package Generic_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class D{
	
	String s="Jayesh D";
	public void m1(){
		System.out.println(s);
	}
}
class E extends D{
	String s="Jitendra D";
	public void m2(){
		System.out.println(super.s);
	}
}

public class F extends E{
	String s="Sandhya F";
	
	public void m3(){
		
		System.out.println(s);
		System.out.println(super.s);
	}
	
	public static void main(String[] args) {
		
WebDriver driver=new ChromeDriver();
		driver.findElement(By.id("dll")).click();
	

	}

}


class GFG {
	  
    // function have implementation of another 
    // function inside local class
    void Foo()
    {
    	System.out.println("This is foo");
        // local class
        class Local {
            void fun()
            {
                System.out.println("geeksforgeeks");
            }
        }
        new Local().fun();
    }
    }