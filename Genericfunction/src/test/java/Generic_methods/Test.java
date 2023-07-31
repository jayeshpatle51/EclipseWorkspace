package Generic_methods;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;

class A 
{ 
  void food()
  { 
     System.out.println("What kind of food do B eat?"); 
  } 
} 
class B extends A
{ 
   void food(int x)
   { 
      System.out.println("B eats flesh"); 
   } 
   public static void fruits() {
		System.out.println("These are the fruits");
	}
 } 
public class Test {
	static void staticmethod2() {
		Test t=new Test();
		t.Mymethod1();
		System.out.println("This is static method 2");
	}
	static void staticmethod() {
		staticmethod2();
		System.out.println("This is static method ");
	}
	public void Mymethod1() {
		
		
		B.fruits();
		System.out.println("The is Mymethod1");
	}
	public void Mymethod2() {
		staticmethod2();
		Mymethod1();
		System.out.println("This is Mymethod 2");
	}
public int minarray(int[] arr,int n) {
	int i=0;
    int j=n-1;
    while(i<j){
        if(arr[i]>arr[j])
            i++;
        else 
            j--;
    }
    return arr[i];
}
public int findSubString(String str) 
{
    // Your code goes here
    HashSet<Character> hs = new HashSet<>();
    int n = str.length();
    
    for(int i=0;i<n;i++)
    {
        char ch = str.charAt(i);
        hs.add(ch);
    }
    
    int max_points = hs.size();
    int curr_points = 0;
    
    int max_len = n;
    
    HashMap<Character,Integer> map = new HashMap<>();
    
    int i = -1, j = -1;
    while(true)
    {
        boolean flag1 = false;
        boolean flag2 = false;
        
        //accquire
        while(i<n-1)
        {
            i++;
            char ch = str.charAt(i);
            
            map.put(ch,map.getOrDefault(ch,0)+1);
            if(map.get(ch)==1)
            {
                curr_points++;
            }
            
            if(curr_points==max_points)
            {
                break;
            }
            
            flag1 = true;
        }
        
        //release
        while(j<i && curr_points==max_points)
        {
            if(i-j<max_len)
            {
                max_len = i - j;
            }
            
            j++;
            char ch = str.charAt(j);
            
            map.put(ch,map.getOrDefault(ch,0)-1);
            if(map.get(ch)==0)
            {
                curr_points--;
            }
            
            flag2 = true;
        }
        
        if(flag1==false && flag2==false)
        break;
    }
    
    return max_len;
}

int isPalindrome(char S[])
{
    int n=S.length-1;
    int value=0;
  for(int i=0;i<S.length/2;i++){
      if(S[i]==S[n]){
          value=1;
      }else {
    	  value=0;
      }
      n--;
  }
  return value;
}
int isPalindrome1(String S) {
    int n=S.length()-1;
    int value=0;
    for(int i=0;i<S.length()/2;i++){
        if(S.charAt(i)==S.charAt(n)){
            value=1;
        }else{
            value=0;
        }
        n--;
    }
    return value;
}


	public static void main(String[] args) 
	  { 
	
		
		
		
		
		
		
		
		
		
		
		String s1 = "Java";  
		String s2 = "Java";  
		String s3 = new String("Java");  
		String s4 = new String("Java").intern();  
		System.out.println((s1 == s2)+", String are equal."); // true  
		System.out.println((s1 == s3)+", String are not equal."); // false  
		System.out.println((s1 == s4)+", String are equal.");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	  }

}

class Student implements Comparable<Student>{
    private int Id;
    private String Sname;
    private String Dept;
    
    public Student(int id,String name,String dept)
    {
        this.Id=id;
        this.Sname=name;
        this.Dept=dept;
    }

    @Override
    public int compareTo(Student o) {
        return this.Id > o.Id ? 1 : (this.Id < o.Id ? -1 : 0) ;
    }
//    @Override
//    public int compareTo(Student o) {
//        return this.Sname.compareTo( o.Sname);
//    }
    @Override
    public String toString(){
        return String.valueOf(Id) +" "+ String.valueOf(Sname) +" "+ String.valueOf(Dept);
    }

}

class Student1 {
	 
    // Attributes of a student
    int rollno;
    String name, address;
 
    // Constructor
    public Student1(int rollno, String name, String address)
    {
 
        // This keyword refers to current instance itself
        this.rollno = rollno;
        this.name = name;
        this.address = address;
    }
 
    // Method of Student class
    // To print student details in main()
    public String toString()
    {
 
        // Returning attributes of Student
        return this.rollno + " " + this.name + " "
            + this.address;
    }
}
 
// Class 2
// Helper class implementing Comparator interface
class Sortbyroll implements Comparator<Student1> {
 
    // Method
    // Sorting in ascending order of roll number
    public int compare(Student1 a, Student1 b)
    {
 
        return a.rollno - b.rollno;
    }
}
 
// Class 3
// Helper class implementing Comparator interface
class Sortbyname implements Comparator<Student1> {
 
    // Method
    // Sorting in ascending order of name
    public int compare(Student1 a, Student1 b)
    {
 
        return a.name.compareTo(b.name);
    }
}
class Sortbycity implements Comparator<Student1>{

	@Override
	public int compare(Student1 o1, Student1 o2) {
		
		return o1.address.compareTo(o2.address);
	}
	
}