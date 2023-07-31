package Generic_methods;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Products {
	private String name;
	private String city;
	private int age;
	private int marks;
	
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name=name;
	}

	public String getCity() {
		return this.city;
	}
	public void setCity(String city) {
		this.city=city;
	}
	public int getAge() {
		return this.age;
	}
	public void setAge(int age) {
		this.age=age;
	}
	
	public int marks() {
		return this.marks;
	}
	public void setName(int marks) {
		this.marks=marks;
	}
	
	public Products() {
		super();
	}
	
	public Products(String name, String city, int age, int marks) {
		this.name=name;
		this.city=city;
		this.age=age;
		this.marks=marks;
	}
	public String toString() {
		return name + " "+ city+" "+age+ " "+marks;
		
	}
	public static void main(String[] args) {
		
		Products p1=new Products("Jayesh","Gondia",26,89);
		Products p2=new Products("Gopi","Hyderabad",27,90);
		Products p3=new Products("Srikar","Hyderabad",25,93);
		Products p4=new Products("Yashmant","bhuveneshwar",24,88);
		
		List<Products> list=Arrays.asList(p1,p2,p3,p4);
		Products lowestage=list.stream().filter(p->p.getCity().equals("Hyderabad")).min(Comparator.comparing(Products::getAge)).get();
		System.out.println(lowestage);

	}

}
