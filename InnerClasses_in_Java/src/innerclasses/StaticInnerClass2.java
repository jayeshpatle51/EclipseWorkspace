package innerclasses;

class Board {
	   String model;
	   public Board(String model) {
	       this.model = model;
	   }

	   // static nested class
	   static class USB{
	       int usb2 = 2;
	       int usb3 = 1;
	       int getTotalPorts(){
	    	   String model="MSI";
	    	   Board b=new Board(model);
	           // accessing the variable model of the outer classs
	           if(b.model.equalsIgnoreCase("MSI")) {
	        	   
	               return 4;
	           }
	           else {
	               return usb2 + usb3;
	           }
	       }
	   }
	}
	public class StaticInnerClass2 {
	   public static void main(String[] args) {

	       // create an object of the static nested class
	       Board.USB usb = new Board.USB();
	       int s=usb.getTotalPorts();
	       System.out.println("Total Ports = " + s);
	   }
	}
