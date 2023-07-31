package Mainproject.simpleproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;

interface MainInterface{
	
}
public class StaticBlock {

//	public void display(int i) {
//		System.out.println(i);
//	}
//	
//	public void display(String s) {
//		System.out.println(s);
//	}
//	
//	public void display(float i) {
//		System.out.println(i);
//	}
//	
//	public int display(float i,int j) {
//		System.out.println(i+j);
//		return j;
//	}
//	public double display(int i,float j) {
//		System.out.println(i+i);
//		return i;
//	}
//	public void display(String i,int j) {
//		System.out.println(i+i);
//	}
//	public void display(int i,String j) {
//		System.out.println(i+i);
//	}
	public void display(int i,byte j) {
		System.out.println(i+j);
	}
	public void display(byte i,int j) {
		System.out.println(i+i);
	}
	public static void String(String args[]) {
		
//		StaticBlock b=new StaticBlock();
//		//b.display(Integer.MAX_VALUE,Byte.MAX_VALUE);
//		b.display(Integer.MAX_VALUE, Byte.MAX_VALUE);
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("");
		Navigation n=driver.navigate();
	}
}
