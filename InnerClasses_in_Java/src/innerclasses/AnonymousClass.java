package innerclasses;

interface Rectangle{
	public void display();
	class java{
		public void m1() {
			Rectangle r=new Rectangle(){

				@Override
				public void display() {
					System.out.println("This is overrided method of interface");
					
				}
				
			};
			r.display();
			System.out.println("This inner class of interface");
		}
	}
}



class Square {
	   public void display() {
	      System.out.println("Inside the Square class");
	   }
	}

class AnonymousDemo {
	   public void createClass() {

	      // creation of anonymous class extending class Polygon
		   Square p1 = new Square()
		   {
			   
	         public void display() {
	            System.out.println("Inside an anonymous class.");
	         }
	      };
	      p1.display();
	   }
	}

	
	public class AnonymousClass {
		
	   public static void main(String[] args) {
		   
//	       AnonymousDemo an = new AnonymousDemo();
//	       
//	       an.createClass();
	       
	       Rectangle r=new Rectangle() {
	    	   
	    	   public void display(){
	    		   System.out.println("Inside a anonymous class of Rectangle Interface");
	    	   }
	    	   
	       };
	       r.display();
	   }
	}
	
