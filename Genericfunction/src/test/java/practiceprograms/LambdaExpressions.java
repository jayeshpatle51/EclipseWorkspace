package practiceprograms;

import java.util.ArrayList;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;


interface Functional{
	
	
}
public class LambdaExpressions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Functional f=()->System.out.println("lambda expressions");
//		f.m1();
//		Functional f=new Functional() {
//
//			 {
//				System.out.println("This is anonymous method");
//				
//			}
//			
//		};
		//Runnable r;
//		List<Integer> list =new ArrayList<>();
//		list.addAll(Arrays.asList(1,2,3,4,6));
//		list.forEach(l->System.out.println(l));
		
		int no1=10,no2=11;
		int no3=0;
		System.out.print(no1+" ");
		
			while(no3<=60) {
			no3=no1+no2;
			no1=no2;
			no2=no3;
			System.out.print(no3+" ");
			}
		
		}

}
