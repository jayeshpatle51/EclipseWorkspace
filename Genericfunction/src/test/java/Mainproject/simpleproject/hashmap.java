package Mainproject.simpleproject;

import java.util.ArrayList;
import java.util.HashMap;

public class hashmap {

	public static void main(String[] args) {
		
		ArrayList<String> list1=new ArrayList<>();
		list1.add("Jayesh-1");
		list1.add("Jitendra-2");
		list1.add("Sandhya-3");
		list1.add("Chovyam");

		ArrayList < Integer > arraylist = new ArrayList < Integer > ();

		arraylist.add(10010);
		arraylist.add(5);
		arraylist.add(4);
		arraylist.add(2);

		for (int i = 0; i < list1.size(); i++) {

		    for (int j =i+1; j < list1.size(); j++) {
		        if (list1.get(i).charAt(1) > list1.get(j).charAt(1)) {

		            String tmp = list1.get(i);
		            list1.set(i,list1.get(j));
		            list1.set(j, tmp);

		        }

		    }

		}
		for (String i: list1) {
		    System.out.println(i);
		}
		
		

		}
		}
