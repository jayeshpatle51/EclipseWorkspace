package Generic_methods;

import java.util.Arrays;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

interface I1{
	default void method1() {
		System.out.println("This is interface I1");
	}
	 void method2();
 }
 
 interface I2{
	 default void method1() {
		 System.out.println("This is interface I2");
	 }
	 void method3();
	 void method2();
 }
 class Array{
	 public int removedup(int[] arr,int n) {
		 if(n==0 || n==1) {
			 return n;
		 }
		 int temp[] =new int[n];
		 int j=0;
		 for(int i=0;i<n-1;i++) {
			 if(arr[i]!=arr[i+1]) {
				temp[j++]=arr[i];
			 }
		 }
		 temp[j++]=arr[n-1];
		 for(int i=0;i<j;i++) {
			 arr[i] =temp[i];
		 }
		 return j;
	 }
	 
	 public static int removeduplicates(int a[], int n)
	    {
	        if (n == 0 || n == 1) {
	            return n;
	        }
	  
	        // creating another array for only storing
	        // the unique elements
	        int[] temp = new int[n];
	        int j = 0;
	  
	        for (int i = 0; i < n - 1; i++) {
	            if (a[i] != a[i + 1]) {
	                temp[j++] = a[i];
	            }
	        }
	  
	        temp[j++] = a[n - 1];
	  
	        // Changing the original array
	        for (int i = 0; i < j; i++) {
	            a[i] = temp[i];
	        }
	  
	        return j;
	    }
 }

public class Interfaces  {
	public String remove(String s) {
		StringBuilder sb=new StringBuilder();
		for(int i=0;i<s.length();i++) {
			String st=s.substring(i,i+1);
			if(sb.indexOf(st)<0) {
				sb.append(st);
			}
		}
		return sb.toString();
	}
	public String removeduplicate(String s) {
		if(s.length()==1) {
		return s;
		}
		
		String str="";
		for(int i=0;i<s.length();i++) {
			int k=0;
			for(int j=i+1;j<s.length();j++) {
				if(s.charAt(i)==s.charAt(j)) {
					k=1;
					
				}		
			}
			if(k==1) {
				str=str+s.charAt(i);
			}
		}
		return str;
	}
	
	static void removeDuplicate(char str[], int length)   
    {   
        //Creating index variable to use it as index in the modified string   
        int index = 0;   
    
        // Traversing character array  
        for (int i = 0; i < length; i++)   
        {   
              
            // Check whether str[i] is present before or not   
            int j;   
            for (j = 0; j < i; j++)    
            {   
                if (str[i] == str[j])   
                {   
                    break;   
                }   
            }   
    
            // If the character is not present before, add it to resulting string   
            if (j == i)    
            {   
                str[index++] = str[i];   
            }   
        }   
        System.out.println(String.valueOf(Arrays.copyOf(str, index)));   
    }   
	public static int[] insertX(int n, int arr[],
            int x, int pos)
{
int i;

// create a new array of size n+1
int newarr[] = new int[n + 1];

// insert the elements from
// the old array into the new array
// insert all elements till pos
// then insert x at pos
// then insert rest of the elements
for (i = 0; i < n + 1; i++) {
if (i < pos - 1)
newarr[i] = arr[i];
else if (i == pos - 1)
newarr[i] = x;
else
newarr[i] = arr[i - 1];
}
return newarr;
}
	public static int[] addX(int n, int arr[], int x)
    {
        int i;
  
        // create a new array of size n+1
        int newarr[] = new int[n + 1];
  
        
        for (i = 0; i < n; i++) {
            newarr[i] = arr[i];
        }
        
        newarr[n] = x;
      
        return newarr;
    }
	public void removeValues(Map map) {
		 ConcurrentHashMap map1=new ConcurrentHashMap();
		 map1.putAll(map);
		 
		 Set keys = map.keySet(); // The set of keys in the map.

         Iterator<String> keyIter = keys.iterator();
         Set<Map.Entry> set=map.entrySet();

         while (keyIter.hasNext()) {
             String key = keyIter.next();
             String value = map.get(key).toString();
             int count=0;
        for(Entry entry :set) {
       	 if(value.equals(entry.getValue())) {
       		 count++;
       	 }
        }if(count>1) {
       	 map.remove(key);
        }
         
         }
         System.out.println(map);
	}
 public int sqrroot(int no) {
	 //int sq;
	 int i=1;
	 while(no>i) {
		if((i*i)==no) {
			return i;
		} 
			i++; 
	 }
	 return 0;
 }
 public void palindromeno(int n) {
	 int temp=n;
	 int rev=0;
	 while(n>0) {
		 int rem=n%10;
		  rev=rev+rem;
		 n=n/10;
	 }if(temp==rev) {
		 System.out.println("The given no is palindrome");
	 }	 else {
		 System.out.println("The given no is not palindrome ");
	 }
 }
 public boolean isSpynumber(int no) {
	 int n=no;
	 int sum=0;
	 int mup=1;
	 while(n>0) {
		 int rem=n%10;
		 sum=sum+rem;
		 mup=mup*rem;
		 n=n/10;
	 }
	 if(mup==sum) {
		return true;
	 }return false;
	
 }
 
	public static void main(String[] args) {
		ConcurrentHashMap<String,Integer> hm=new ConcurrentHashMap<>();
        hm.put("AA", 1);
        hm.put("BB", 2);
        hm.put("CC", 3);
        hm.put("DD", 4);
        hm.put("EE", 1);
        hm.put("FF", 1);
        hm.put("GG", 2);
        hm.put("GG", 3);
        hm.put("HH", 4);
        hm.put("GG", 5);
     
     Set<String> keys = hm.keySet(); // The set of keys in the map.

     Iterator<String> keyIter = keys.iterator();
     Set<Map.Entry<String,Integer>> set=hm.entrySet();

     while (keyIter.hasNext()) {
         String key = keyIter.next();
         Integer value = hm.get(key);
         int count=0;
    for(Entry<String,Integer> entry :set) {
        if(value.equals(entry.getValue())) {
            count++;
        }
    }if(count>1) {
        hm.remove(key);
    }
     
     }
     System.out.println(hm);
		
	}

}
