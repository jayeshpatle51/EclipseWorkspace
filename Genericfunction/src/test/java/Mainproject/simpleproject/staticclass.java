package Mainproject.simpleproject;

import java.awt.AWTException;
import java.awt.Robot;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class staticclass {
	static {
		System.out.println("This is static block");
	}
staticclass(){
		System.out.println("lsj");
	}
static void mymethod() {
	 System.out.println("This is my method");
 }

static String spaceintegration(String s, int []sp)
{
  int M = s.length(), N = sp.length, l = 0, r = 0;
  String res = newstr(M + N, ' ');

  // Iterate over M+N length
  for (int i = 0; i < M + N; i++) {

    if (l < N && i == sp[l] + l)
      l++;
    else
      res = res.substring(0,i)+s.charAt(r++)+res.substring(i+1);
  }

  // Return the required String
  return res;
}

static String newstr(int i, char c) {
  String str = "";
  for (int j = 0; j < i; j++) {
    str+=c;       
  }
  return str;
}

public static boolean palindrome(String str) {
	int i = 0;
	int j = str.length() - 1;

	while (i < str.length()) {
		if (str.charAt(i) != str.charAt(j)) {
			return false;

		}
		i++;
		j--;
		
	}return true;

	
}
static ArrayList<Integer> subarraySum(int[] arr, int n, int s) 
{
      ArrayList<Integer> al = new ArrayList<Integer>();
      
      int temp = 0, start = 1, end = 0;
    
      
      for(int i=0; i<arr.length; i++)
      {
          if(temp == s)
           break;
           
           temp += arr[i];
           end++;
          
           while(temp > s)
           {
               temp -= arr[start-1];
               start++;
           }
      }
      //System.out.println(start + " " +end);
      if(temp == s){
          al.add(start);
          al.add(end);
      }
      else
      al.add(-1);
      
      return al;
}

static long maxSubarraySum(int arr[], int n){
    
    // Your code here
long curr_sum = arr[0] ; 
long overall_sum = arr[0] ; 

for (int i = 1; i<n ; i++) {
    if (curr_sum < 0) {
        curr_sum = arr[i] ; 
    }else {
        curr_sum += arr[i] ;
    }
    if(curr_sum > overall_sum){
        overall_sum = curr_sum ;
    }
}
 return overall_sum ; 
}

static int getMinDiff(int[] arr, int n, int k) {
    if(n==1){
        return 0;
    }
Arrays.sort(arr);
   
   int diff = arr[n-1] - arr[0];
   
   int max,min;
   
   for(int i = 1;i<n;i++)
   {
       if(arr[i]-k < 0)
       {
           
           continue;
       }
       
       max = Math.max(arr[i-1]+k,arr[n-1]-k);
       min = Math.min(arr[0]+k,arr[i]-k);
       
       diff = Math.min(diff,max-min);
   }
   return diff;
}

public static ArrayList<Integer> duplicates(int arr[], int n) {
    
    
    Map<Integer,Integer> map = new HashMap<>();
   Set<Integer> set = new TreeSet<>();
   for(int i = 0 ; i < n ; i++){
       if(map.containsKey(arr[i])){
           map.put(arr[i],map.get(arr[i])+1);
           if(map.get(arr[i]) >= 2 && !set.contains(arr[i]))
               set.add(arr[i]);
       }
       else{
           map.put(arr[i],1);
       }
   }
   ArrayList<Integer> al = new ArrayList<>(set);
   if(al.isEmpty()){
       al.add(-1);
   }
   return al;
}
public static ArrayList<Integer> duplicates1(int arr[], int n) {
    // code here
    ArrayList<Integer>al=new ArrayList<>();
    HashMap<Integer,Integer>hs=new HashMap<>();
    for(int i=0;i<n;i++){
         hs.put(arr[i],hs.getOrDefault(arr[i],0)+1);
    }
    for(Map.Entry<Integer,Integer>val:hs.entrySet()){
        if(val.getValue()>1){
            al.add(val.getKey());
        }
    }
    if(al.size()<=0){
        al.add(-1);
        return al;
    }else{
        Collections.sort(al);
        return al;
    }
  
}
public static boolean isValid(String s) {  
    int count = 0;
    
    for(int i=0;i<s.length();i++)
    {
        if(s.charAt(i)=='.') count++;       
    }
    
    if(count!=3) return false;


    HashSet<String> hs = new HashSet<>();
    
    for(int i=0;i<256;i++)
    {
        hs.add(Integer.toString(i));
    }
    
    count = 0;
    
     String temp = "";
    
    for(int i=0;i<s.length();i++)
    {
        if(s.charAt(i)!='.')
        {
            temp+= s.charAt(i);
        }
        
        else
        {
            if(hs.contains(temp))
            {
                count++;
            }
            
            temp = "";
        }
        
    }
    
     if(hs.contains(temp))
            {
                count++;
            }
    
    if(count == 4)
    {
        return true;
    }
    return false;

}

static String reverseWords(String S){
    StringBuilder sb = new StringBuilder(S.length());
    int l = S.length();
    for(int i = S.length() - 1; i>-1; --i) {
        if(S.charAt(i) == '.') {
            sb.append(S.substring(i+1, l));
            if(i!=-1){
               sb.append('.');
            }
            l = i;
        }
    }
    sb.append(S.substring(0, l));
    return sb.toString();
 }
static void starpattern() {
	int n,c,k,space=1;
	Scanner s=new Scanner(System.in);
	
	System.out.println("Enter no of rows : ");
	n=s.nextInt();
	space =n-1;
	for (k = 1; k <= n; k++) {
		for (c = 1; c <= space; c++) 
			System.out.print("-");
		
		space--;
		for (c = 1; c <= 2 * k - 1; c++) 
			System.out.print("*");

		
		System.out.print("\n");
	}
	space = 1;
	for (k = 1; k <= n - 1; k++) {
		for (c = 1; c <= space; c++) 
			System.out.print("-");
		
		space++;

		for (c = 1; c <= 2 * (n - k) - 1; c++) 
			System.out.print("*");
		
		System.out.println("");

	}
}
public String replacesec(String str, char c,char rep,int j){
int count=0;
int index=0;
int n=str.length();
for(int i=0;i<str.length();i++){
if(str.charAt(i)==c){
count++;
}
if(count==j && count<n){
index=i;
break;
}
}
StringBuffer sb=new StringBuffer(str);
sb.setCharAt(index,rep);
return sb.toString();
}
public static void main(String[] args) throws IOException {
	int[] ar= {1,3,4};
	String s=spaceintegration("Jayesh",ar);
	System.out.println(s);

}}