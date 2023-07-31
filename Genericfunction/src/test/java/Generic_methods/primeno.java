package Generic_methods;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;

public class primeno {
	public static void isprime(int n) {
	 int i,m=0;
	 boolean flag=true;      
	      
	  if(n==0||n==1){  
	   System.out.println(n+" is not prime number");      
	  }else{  
	   for(i=2;i<n;i++){      
	    if(n%i==0){      
	    
	     flag=false;
	     System.out.println(n+" is not prime number");
	     break;
	    }      
	   }      
	   if(flag)
	   { 
		   System.out.println(n+" is prime number"); 
	   }  
	   
	  }//end of else  
	
	}   
	public boolean prime(int n) {
		
		if(n==0 && n==1) { 
			
			return false;
		}
		for(int i=2;i<n;i++) {  
		if(n%i==0) {
			
			return false;
		}
		}
		return true;
		
		
		
	}
	public void fibonacci(int limit) {
		int n1=0, n2=1;
		System.out.print(n1+" "+n2+" ");
		for(int i=1;i<=limit;i++) {
		int n3=n1+n2;
		n1=n2;
		n2=n3;
		System.out.print(n3+" ");
		}
	}
	public void even(int[] n) {
		System.out.println("Given even nos: ");
		for(int i=0;i<n.length;i++) {
		if(n[i]%2==0) {
			System.out.print(n[i]+" ");
		
		}
		}
		System.out.println();
		System.out.println("Given odd nos are: ");
		for(int i=0;i<n.length;i++) {
			if(n[i]%2!=0) {
				System.out.print(n[i]+" ");
			}
		}
		
	}
	public void separatenos(int[] arr) {
		System.out.println("Given two digits nos are :");
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>=10 && arr[i]<100) {
				System.out.print(arr[i]+ " ");
			}
		}
	}
	public int lonelyinteger(List<Integer> arr) {
		List<Integer> checked=new ArrayList<>();
		for(int i=0;i<arr.size();i++) {
			
			if(!checked.contains(arr.get(i))) {
				boolean found=false;
				for(int j=i+1;j<arr.size();j++) {
					if(arr.get(i).equals(arr.get(j))) {
						found=true;
						break;
					}
				}if(found == false) {
					return arr.get(i);
				}else {
					checked.add(arr.get(i));
				}
			}
		}return -1;
	}
	public void reverseString(String str) {
		//String str1="";
		
		System.out.print(str.charAt(str.length()-1));
		String str1=str.substring(0,str.length()-1);
		if(str1.length()>0) {
		reverseString(str1);
		}
		}
	public void random() {
		Random ran=new Random();
		int n=0;
		for(int i=0;i<=22;i++) {
		n=ran.nextInt(22);
		System.out.println(n);
		}
		
	}
	
	public static void main(String args[]) throws IOException {
		
		
	//System.out.println(s);
	
	}
}
