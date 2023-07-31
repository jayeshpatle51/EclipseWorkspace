package practiceprograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Baseclass.BaseTest;

public class CheckboxSelection {
	public static void starTriaglepattern(int len) {


		int m=0;
		for(int i=0;i<len;i++) {           

			for(int k=i;k<len;k++) {

				System.out.print("-");
			}

			for(int l=0;l<=m;l++) {
				if(l==0 || l==m) {
					System.out.print("*");
				}else {
					System.out.print("-");
				}

			}

			for(int k=i;k<len;k++) {

				System.out.print("-");
			}
			m=m+2;
			System.out.println();
		}
	}


	static int[] find(int dividend, int divisor,
			int start, int end)
	{

		// Check if start is greater than the end
		if (start > end)
			return new int[] { 0, dividend };

		// Calculate mid
		int mid = start + (end - start) / 2;

		int n = dividend - divisor * mid;

		// Check if n is greater than divisor
		// then increment the mid by 1
		if (n > divisor)
			start = mid + 1;

		// Check if n is less than 0
		// then decrement the mid by 1
		else if (n < 0)
			end = mid - 1;

		else {
			// Check if n equals to divisor
			if (n == divisor) {
				++mid;
				n = 0;
			}

			// Return the final answer
			return new int[] { mid, n };
		}

		// Recursive calls
		return find(dividend, divisor, start, end);
	}

	static int[]  divide(int dividend, int divisor)
	{
		return find(dividend, divisor, 1, dividend);
	}

	public static void printMissingnos(int arr[],int start) {

		Arrays.sort(arr);
		int len=arr.length;


		for(int i=0;i<len-1;i++) {

			while(start<arr[i+1]) {
				if(start!=arr[i]) {
					System.out.print(start+" ");
				}
				start++;
			}
		}
	}

	public void printMissingnowithoneloop(int arr[]) {
		Arrays.sort(arr);
		int min=arr[0];
		int max=arr[arr.length-1];
		int k=0;

		for(int i=min;i<max;i++)
		{
			int currentValue=arr[k];
			if(currentValue==i) {
				k++;
			}

			else {
				System.out.print(i+" ");
			}

		}
	}
	public static void quoandrem(int divident,int divider) {
		int quot=0, rem=0;
		for(int i=divider;i<=divident;i+=divider) {
			quot++;
			rem=divident-i;

		}



		System.out.print("remainder = "+rem+" , quot = "+quot);

	}
	public static String printcommchar(List<String> list) {

		String str=list.get(0);
		String charstr="";
		int count=0;
		List<String> li=new ArrayList<>();
		for(int i=0;i<str.length();i++) {
			String ch=String.valueOf(str.charAt(i));
			boolean b=false;
			for(int j=1;j<list.size();j++) {

				if(list.get(j).contains(ch)) {
					b=true;
				}else {
					b=false;
					break;
				}
			}
			if(b) {
				//map.put(ch, map.getOrDefault(charstr+1, 0));
				//charstr=charstr+str.charAt(i);

				li.add(ch);

			}else {
				continue;
			}

		}
		//		for(String st:li) {
		//			System.out.print(st);
		//		}
		//System.out.println(charstr);
		return charstr;

	}
	public static int countofchar(String s,char c) {
		int count=0;
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)==c) {
				count++;
			}else {
				continue;
			}
		}
		return count;
	}
	public String commancharString(List<String> list) {


		String str=list.get(0);
		Map<Character,Integer> map1=new HashMap<>();
		for(int i=0;i<str.length();i++) {

			map1.put(str.charAt(i),countofchar(str, str.charAt(i)));
		}
		System.out.println(map1);
		String newstr="";

		for(int i=0;i<str.length();i++) {

			boolean b=false;


			for(int j=1;j<list.size();j++) {

				if(list.get(j).contains(str.charAt(i)+"")) {

					String temp=list.get(j);
					StringBuffer st=new StringBuffer(temp);
					st.setCharAt(temp.indexOf(str.charAt(i)), '-');
					String temp2=  list.set(list.indexOf(temp), st.toString());
					System.out.println(temp2);

					b=true;

				}else {
					b=false;
					break;
				}
			}
			if(b) {

				newstr=newstr+str.charAt(i);
			}

		}
		return newstr;
	}

	public static void main(String[] args) throws InterruptedException {

		BaseTest.launchBrowser("chrome");
		WebDriver driver=BaseTest.driver;
		driver.get("https://jqueryui.com/datepicker/");
		
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame']")));
		driver.findElement(By.xpath("//input[@id='datepicker']")).click();
		boolean b=true;
		String datepick = "16-April-2023";
		String[] array = datepick.split("-");
		while(b) {
			String month =driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
			String year =driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();

			System.out.println(month+" "+year);

			//

			if(array[1].equals(month) && array[2].equals(year)) {

				List<WebElement> elements=driver.findElements(By.xpath("//td[@data-handler='selectDay']"));
				System.out.println(elements.size());
				for(int i=0;i<elements.size();i++) {
					WebElement ele=elements.get(i);
					if(ele.getText().equals(array[0])) {
						b=false;
						elements.get(i).click();
						break;
					}else {
						continue;
					}
				}

				break;
			}else {
				driver.findElement(By.xpath("//div[@id='ui-datepicker-div']/div/a[2]/span")).click();
				//continue;
			}

		}
       Thread.sleep(3000);
		BaseTest.closeDriver();
	}



	//	   |_
	//		 |_
	//		   |_
	//		     |_
	//		       |_
	//	 ----1----   
	//	 ---121---
	//	 --12321--
	//	 -1234321-
	//	 123454321
	//		
	//	   --1--
	//	   -121-
	//	   12321

	//1
	//121
	//12321
	//1234321
	//123454321








	//*---* 
	//--*--
	//--*--
	//	  *-----*
	//	  -*---*-
	//    --*-*--
	//	  ---*---
	//	  ---*---	
	//	  ---*---	
	//	  ---*---


	//		*-*-*-*-* 
	//		*-*-*-*-* 
	//		* * * * * 
	//		* * * * * 
	//		* * * * * 







	//   String str2="";
	//        
	//        List<String> arrch=new ArrayList<>(Arrays.asList("hyderabbad","babngalore","maubmbai"));
	//        String ch1=arrch.get(0);
	//        char[] ch2=ch1.toCharArray();//aabb
	//        //System.out.println(ch2);
	//        //Arrays.sort(ch2);
	//        String  ch3=arrch.get(1);
	//        char[] ch4=ch3.toCharArray();
	//        //System.out.println(ch4);
	//        for(int i=0;i<ch2.length;i++)
	//        {
	//            for(int j=0;j<ch4.length;j++)
	//            {
	//                if(ch2[i]==ch4[j])
	//                {
	//                    str2=str2+ch2[i];
	//                }
	//                
	//            }
	//            
	//        }
	//        //System.out.println(str2);
	//        char[] ch5=str2.toCharArray();
	//        String ch6=arrch.get(2);
	//        char[] ch7=ch6.toCharArray();
	//        Set<Character> set1=new HashSet<>();
	//        for(int i=0;i<ch5.length;i++)
	//        {
	//            for(int j=0;j<ch7.length;j++)
	//            {
	//                if(ch5[i]==ch7[j])
	//                {
	//                    set1.add(ch5[i]);
	//                }
	//            }
	//        }
	//        
	//        System.out.println(set1);

	//Output::'css'




	//	   1 
	//    1 1 
	//   1 2 1 
	//  1 3 3 1 
	// 1 4 6 4 1



	static void pattern(int wave_height,
			int wave_length)
	{
		int i, j, k, e, n, count, x;
		e = 2;
		x = 1;

		// for loop for height
		// of wave
		for (i = 0; i < wave_height; i++)
		{
			for (j = wave_height; j <= wave_height + i; j++)
				System.out.print(" ");

			// for loop for wave
			// length
			for (count = 1; count <= wave_length; count++)
			{
				// checking for intermediate
				// spaces
				for (n = (wave_height + wave_height - 2); n >= x; n--)
					System.out.print(" ");

				for (k = 1; k <= e; k++)
				{
					if (k == 1)
						System.out.print("/");
					else if (k == e)
						System.out.print("\\");
					else
						System.out.print(" ");
				}
			}

			// incrementing counters
			// value by two
			x = x + 2;
			e = e + 2;

			System.out.println();
		}
	}



}
