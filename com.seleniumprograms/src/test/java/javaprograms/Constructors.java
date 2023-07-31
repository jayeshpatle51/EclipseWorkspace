package javaprograms;

abstract class Vehicle {
	Vehicle() {
		System.out.println("default");
	}

	Vehicle(int i) {

		System.out.println(i);
	}

	int wheels;

	public void setWheels(int wheels) {
		this.wheels = wheels;
	}

	public abstract int getWheels();

	public Object getvalue() {

		return new String();
	}
}

class Car extends Vehicle {

	public Car(int i) {
		super(i);
		System.out.println("child");
	}
	@Override
	public int getWheels() {

		return wheels;
	}

	public String getvalue() {

		return (String) new Object();
	}
}

class Bike extends Vehicle {

	@Override
	public int getWheels() {
		// TODO Auto-generated method stub
		return wheels;
	}

}

interface Tree {
	default void m1() {
		System.out.println("m1");
	}

}

interface House {

	default void m1() {
		System.out.println("B.m1");
	}
}

public class Constructors {


	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}



}
