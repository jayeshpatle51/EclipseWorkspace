package Generic_methods;

import java.util.Arrays;

public class Genemethod
{
	public static void hcfandlcm(int x,int y) {
		
		int a,b,t,hcf,lcm;
		
		a=x;
		b=y;
		
		while(b!=0) {
			t=b;
			b=a%b;
			a=t;
		}
		hcf=a;
		lcm=(x*y)/hcf;
		System.out.println("HCF =" +hcf);
		System.out.println("\nLCM ="+ lcm);
	}
	public static int calculator(int x, int y, char operator)
	{
		int res=0;
		switch(operator) {
		case '+':
			res=x+y;
			break;
		case '-':
			res=x-y;
			break;
		case '*':
			res=x*y;
			break;
		case '/':
			res=x/y;
			break;
			default:
				System.out.println("Invalid operator please give valid operator: ");
			
			
			
			
		}return res;
	}
	//method for swapping two integers using third variable
	public  void  swappingnum(int a, int b)
	{
		int temp;
		temp=a;
		a=b;
		b=temp;
	   System.out.println(a+" " + b);
	}
	
	public void swappingstring(String a, String b)
	{
		String temp;
		temp=a;
		a=b;
		b=temp;
		System.out.println(a+" "+b);
	}
	//comparing two numbers
    public int CompareNum(int x,int y)   
	{   
	        
	        
	        if(x>y)  
	            return x;  
	        else  
	            return y;  
	}  
	  
	public void sortArray(int[] arr)
	{
		  int i=0;
		  int j=i+1;
		  int k;
		  
		  for(i=0;i<arr.length;i++) {
			  
		  for(j=i+1;j<arr.length;j++) {
			  
		  
		  if(arr[i]>arr[j]) {
			  k=arr[i];
			  arr[i]=arr[j];
			  
			  arr[j]=k;
			  
		  }
		
		  }System.out.println(arr[i]); 
	      }
	 }
	
	 private static void sortArray(int array[], int n)   
     {  
		  for (int i = 1; i < n; i++)  
		  {  
		  int j = i;  
		  int a = array[i];  
		  while ((j > 0) && (array[j-1] > a))   //returns true when both conditions are true  
		  {  
		  array[j] = array[j-1];  
		  j--;  
		  }  
		  array[j] = a;  
		  }  
	 }
	 
	 //sort Array in descendingorder without using reverseorder method
	 public void sortArraydescending(int[] arr)
		{
			  int i=0;
			  int j=i+1;
			  int k;
			  
			  for(i=0;i<arr.length;i++) {
				  
			  for(j=i+1;j<arr.length;j++) {
				  
			  
			  if(arr[i]<arr[j]) {
				  k=arr[i];
				  arr[i]=arr[j];
				  
				  arr[j]=k;
				  
			  }
			
			  }System.out.println(arr[i]); 
		      }
		 }
	  
		 
}

 class SumReturn  
{  
    private int a;  
    public SumReturn(int i)  
    {  
        a = i;  
    }  
    /*The addition method returns a SumReturn object with adding 100 into it. */  
    public SumReturn addition()  
    {  
        SumReturn result = new SumReturn(a + 100);  
  
        return result;  
    }  
    public void display()  
    {  
        System.out.println("Additon result: " + a);  
    }  
}  
