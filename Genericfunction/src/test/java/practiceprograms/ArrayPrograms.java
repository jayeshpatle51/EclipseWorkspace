package practiceprograms;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayPrograms {
	
public <T> T[] rotateArray(T[] arr) {
		
		T initial= arr[0];
		for(int i=0;i<arr.length-1;i++) {
			
			T temp=arr[i];
			arr[i]=arr[i+1];
			
		}
		arr[arr.length-1]=initial;
		return arr;
	}
	
	public int[] rotateIntArrayToleft(int arr[],int limit) {
		
		for(int k=1;k<=limit;k++) {
			 int temp=arr[0];
			 for(int i=0;i<arr.length-1;i++) {
				 
				 arr[i]=arr[i+1];
			 }
			 arr[arr.length-1]=temp;
			 }
		
		return arr;
	}
	
	public int[] rotateArrayToRight(int arr[],int limit) {
		
		
		for(int k=1;k<=limit;k++) {
			int temp=arr[arr.length-1];
		    for(int i=arr.length-1;i>0;i--) {
		    	arr[i]=arr[i-1];
			  
			}
	          arr[0]=temp;
			}
		return arr;
	}

	public static void main(String[] args) {
		
//		 System.out.println("This is main method");
// Person.main();
 
		int [] arr = new int [] {1, 2, 8, 3, 2, 2, 2, 5, 1};
		
		
		ArrayList<Integer> list=new ArrayList<>();
		for(int i=0;i<arr.length;i++) {
			list.add(arr[i]);
		}
		System.out.println(list);
		for(int i=0;i<list.size();i++) {
			if(i<=3) {
			list.remove(i);
			}
		}
		System.out.println(list);
//		Map<Integer,Integer> map=new HashMap<>();
//		for(int i=0;i<arr.length;i++) {
//			map.put(arr[i], map.getOrDefault(arr[i], 0)+1);
//		}
//		
//		System.out.println(map);
//		List<Integer> list=new ArrayList<>();
//		for(int i=0;i<arr.length;i++) {
//			
//			int count =0;
//			for(int j=0;j<arr.length;j++) {
//				if(arr[i]==arr[j]) {
//					count ++;
//				}
//			}
//			if(!list.contains(arr[i])) {
//				list.add(arr[i]);
//			System.out.println(arr[i]+" | "+ count);
//			}
//		}
		
		
		
	}

}

class Person<T> extends ArrayList<T>{
	
	/**
	 * 
	 */
//	private static final long serialVersionUID = 1L;
//    
//	public static void main(String... args) {
//		
//		Person<String> s=new Person<String>();
//		s.add("Hydarabad");
//		s.add("Banglore");
//		s.add("Mumbai");
//		s.add("Pune");
//		System.out.println(s);
//		s.removeRange(0,2);
//		System.out.println(s);
//	}
	
}
