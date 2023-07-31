package Generic_methods;

import java.util.Scanner;

abstract class Book{
    String title;
    abstract void setTitle(String s);
    String getTitle(){
        return title;
    }
}

//Write MyBook class here
class MyBook extends Book{

	@Override
	void setTitle(String s) {
		title=s;
		
	}
    
  
} 
public class Abstractclasses {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		  Scanner sc=new Scanner(System.in);
	      
	        MyBook new_novel=new MyBook();
	        String st=sc.nextLine();
	        new_novel.setTitle(st);
	        System.out.println("The title is: "+new_novel.getTitle());
	        sc.close();
	        
	        throw new Exception("dsl");
	}

}
