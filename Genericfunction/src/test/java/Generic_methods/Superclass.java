package Generic_methods;

import java.awt.AWTException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Stack;
import java.util.TreeMap;

interface ThisInterface  {
	static void m4() {
		System.out.println("This is static method"); 
		}
	default void m1() {
		System.out.println("This is my method");
	}
}
interface Interface2{
	String str="ssh";
	void m5();
	
	static void m4() {
		System.out.println("This is second static method");
	}
	default void m1() {
		System.out.println("This is my second interface method");
	}
}

	

	
	
	


public class Superclass implements Interface2 {

	
	public void m1() {
		System.out.println("This is my method in class");
		
	}

	public int min(int[][] arr) {
		int min = arr[0][0];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (arr[i][j] < min) {
					min = arr[i][j];
				}
			}
		}
		return min;
	}

	public int max(int[][] arr) {
		int max = arr[0][0];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (arr[i][j] > max) {
					max = arr[i][j];
				}

			}
		}
		return max;
	}

	public int minimum(int[][][] arr) {
		int min = arr[0][0][0];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				for (int k = 0; k < arr[i][j].length; k++) {
					if (arr[i][j][k] == min) {
						min = arr[i][j][k];
					}
				}
			}
		}
		return min;
	}

	public int maximum(int[][][] arr) {
		int max = arr[0][0][0];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				for (int k = 0; k < arr[i][j].length; k++) {
					if (arr[i][j][k] == max) {
						max = arr[i][j][k];
					}
				}
			}
		}
		return max;
	}

	public static long aVeryBigSum(List<Long> ar) {
		// Write your code here
		long sum = 0;
		for (int i = 0; i < ar.size(); i++) {

		}
		return sum;
	}

	public static int diagonalDifference(List<List<Integer>> arr) {
		// Write your code here
		int sum1 = 0;
		int sum2 = 0;
		int sumdiagonal = 0;
		int k = 1;
		for (int i = 0; i < arr.size(); i++) {
			int j = arr.get(i).size() - k;
			sum1 = sum1 + arr.get(i).get(i);
			sum2 = sum2 + arr.get(i).get(j);
			k++;
		}
		sumdiagonal = sum1 - sum2;
		int sum = Math.abs(sumdiagonal);
		return sum;

	}

	public static void plusMinus(List<Integer> arr) {
		// Write your code here
		double len = arr.size();

		double countpos = 0;
		double countneg = 0;
		double countzero = 0;
		for (int i = 0; i < len; i++) {

			if (arr.get(i) > 0) {
				countpos++;
			} else if (arr.get(i) < 0) {
				countneg++;
			} else if (arr.get(i) == 0) {
				countzero++;

			}
		}
		double respos = countpos / len;
		double resneg = countneg / len;
		double reszero = countzero / len;
		DecimalFormat ft = new DecimalFormat("0.000000");
		System.out.println(ft.format(respos));
		System.out.println(ft.format(resneg));
		System.out.println(ft.format(reszero));
	}

	public static void staircase(int n) {
		// Write your code here
		int m = n - 1;
		int l = 1;
		for (int i = 0; i < n; i++) {

			for (int j = 0; j < m; j++) {
				System.out.print("-");
			}
			for (int k = 0; k < l; k++) {
				System.out.print("#");
			}
			m--;
			l = l + 2;
			System.out.println();
		}
		int a = n - 1;
		int q = 1;
		for (int i = 0; i < n - 1; i++) {
			for (int j = 0; j < q; j++) {
				System.out.print("-");
			}
			for (int k = 0; k < l - 4; k++) {
				System.out.print("#");
			}
			l = l - 2;
			q++;
			System.out.println();
		}
	}

	public static void miniMaxSum(List<Integer> arr) {
		// Write your code here

		ArrayList<Integer> in = new ArrayList<>();
		for (int i = 0; i < arr.size(); i++) {
			int sum = 0;
			int j = 0;
			while (j < arr.size()) {
				if (j != i) {
					sum = sum + arr.get(j);
				}
				j++;
			}
			in.add(sum);
		}
		Collections.sort(in);

		System.out.print(in.get(0) + " " + in.get(in.size() - 1));
	}

	public static String getSmallestAndLargest(String s, int k) {
		String smallest = "";
		String largest = "";
		ArrayList<String> arr = new ArrayList<>();

		for (int i = 0; i < s.length() - k + 1; i++) {

			String f = s.substring(i, i + k);
			arr.add(f);

		}
		Collections.sort(arr);
		smallest = arr.get(0);
		largest = arr.get(arr.size() - 1);
		return smallest + "\n" + largest;
	}

	public static int absolutevalue(int a) {
		return (a < 0) ? -a : a;
	}

	static boolean isAnagram(String a, String b) {
        // Complete the function
        if(a.length()!=b.length()){
            return false;
        }
        a=a.toLowerCase();
        b=b.toLowerCase();
       char[] c= a.toCharArray();
       char[] d=b.toCharArray();
       for(int i=0;i<a.length()-1;i++) {
    	   for(int j=i+1;j<a.length();j++) {
    		   
    		   if(c[i]-c[j]>0) {
    			   char temp=c[i];
    			   c[i]=c[j];
    			  c[j]=temp;
    		   }
    		 
    		   
    	   }
       }
       for(int i=0;i<b.length()-1;i++) {
    	   for(int j=i+1;j<b.length();j++) {
    		   
    		   if(d[i]-d[j]>0) {
    			   char temp=d[i];
    			   d[i]=d[j];
    			  d[j]=temp;
    		   }
    		 
    		   
    	   }
       }
        for(int i=0;i<c.length;i++){
            if(c[i]!=d[i]){
                return false;
            }
        }
        return true;
    }
	 static String removeDuplicate(String str[], int n)
	    {
	        // Used as index in the modified string
	        int index = 0;
	 
	        // Traverse through all characters
	        for (int i = 0; i < n; i++)
	        {
	 
	            // Check if str[i] is present before it
	            int j;
	            for (j = 0; j < i; j++)
	            {
	                if (str[i].equalsIgnoreCase(str[j]))
	                {
	                    break;
	                }
	            }
	 
	            // If not present, then add it to
	            // result.
	            if (j == i)
	            {
	                str[index++] = str[i];
	            }
	        }
	        String s="";
	        for(int i=0;i<index;i++) {
	        	s=s+str[i]+" ";
	        }
	        return s;
	    }
	 public static int removeDuplicateElements(int arr[], int n){  
	        if (n==0 || n==1){  
	            return n;  
	        }  
	        int[] temp = new int[n];  
	        int j = 0;  
	        for (int i=0; i<n-1; i++){  
	            if (arr[i] != arr[i+1]){  
	                temp[j++] = arr[i];  
	               
	            }  
	         }  
	        temp[j++] = arr[n-1]; 
	       
	        // Changing original array  
	        for (int i=0; i<j; i++){  
	            arr[i] = temp[i];  
	        }  
	        return j;  
	    }  
	 public List<Character> duplicatechar(String str) {
		 List<Character> list=new ArrayList<>();  
		for(int i=0;i<str.length();i++) {
			char c=str.charAt(i);
			int count=0;
			for(int j=0;j<str.length();j++) {
				if(c==str.charAt(j)){
					count++;
				}
			}
			if(!list.contains(c)) {
			if(count>1 && c!=' ') {
				list.add(c);
			}
			}
		}
		return list;
	 }
	 
	 public static void selectionSort(int[] arr){  
	        for (int i = 0; i < arr.length - 1; i++)  
	        {  
	            int index = i;  
	            for (int j = i + 1; j < arr.length; j++){  
	                if (arr[j] < arr[index]){  
	                    index = j;//searching for lowest index  
	                }  
	            }  
	            int smallerNumber = arr[index];   
	            arr[index] = arr[i];  
	            arr[i] = smallerNumber;  
	        }  
	    }  
	 public static void insertionSort(int array[]) {  
	        int n = array.length;  
	        for (int j = 1; j < n; j++) {  
	            int key = array[j];  
	            int i = j-1;  
	            while ( (i > -1) && ( array [i] > key ) ) {  
	                array [i+1] = array [i];  
	                i--;  
	            }  
	            array[i+1] = key;  
	        }  
	    } 
	 public static boolean isBalanced(String s) {
	        Stack<Character> stack = new Stack<Character>();
	        for (int i=0; i<s.length();++i){
	            if (s.charAt(i) == '(') stack.push('(');
	            else if (s.charAt(i) == '{') stack.push('{');
	            else if (s.charAt(i) == '[') stack.push('[');
	            else if (s.charAt(i) == ')') {
	                if (stack.isEmpty()) return false;
	                if (stack.pop() != '(') return false;
	            }
	            else if (s.charAt(i) == '}') {
	                if (stack.isEmpty()) return false;
	                if (stack.pop() != '{') return false;
	            }
	            else if (s.charAt(i) == ']') {
	                if (stack.isEmpty()) return false;
	                if (stack.pop() != '[') return false;
	            }
	        }
	        return stack.isEmpty();
	    }
	 // public static final String str="Jayesh";
	  String str="gandhiji";
	public static void main(String[] args) throws AWTException  {
	
		
		
		ArrayList<String> list=new ArrayList<>();
		list.add("0.490");
		list.add("4.56");
		list.add("0.000");
		list.add("+0.56");
		list.add("+9.45");
	System.out.println(list);
	Collections.sort(list);
	System.out.println(list);
	double d=-4.59;
	//String str=String.format("%f", d);
	//System.out.println(str);
	String str = new DecimalFormat("#.000#").format(d);
	System.out.println(str);
	}

	@Override
	public void m5() {
		// TODO Auto-generated method stub
		
	}
	
}
class Gondia{
	private int i;
	
	private void method1() {
		System.out.println("This is method 1 and int is : "+i);
	}
	void setInt(int i) {
		this.i=i;
	}
	int getInt() {
		return i;
	}
}