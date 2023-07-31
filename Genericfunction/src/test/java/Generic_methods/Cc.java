package Generic_methods;
class Aa{
	 void m1() {
		System.out.println("My name is Jayesh");
	}
}
class Bb extends Aa{
	void m1() {
		System.out.println("My name is Jitendra");
	}
}
public class Cc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Aa a=new Aa();
		a.m1();
 Aa an=new Bb();
 an.m1();
 Bb b=new Bb();
 b.m1();
	}

}
