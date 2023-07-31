package seleniumscripts;

public class Yikes { 

	public static void go(Long n) {
		System.out.println("Long ");
	}

	public static void go(Short n) {
		System.out.println("Short ");
	}

	public static void go(long n) {
		System.out.println("long ");
	}

	public static void go(short n) {
		System.out.println("short ");
	}

	public static void go(int n) {
		System.out.println("int ");
	}
	public static void main(String [] args) 
	{ 
	
	short y = 6; 
	long z = 7; 
	int k = 5;
	go(y); 
	go(z);
	go(k);
	
	} 
}
