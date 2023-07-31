package Generic_methods;

public class GenericType<T> {

	T obj;
	
	GenericType(T obj){
		this.obj=obj;
	}
	
	public T getObject() {
		return this.obj;
	}
	public  <T> void getData(T element) {
		System.out.println(element.getClass().getName()+" "+element);
		
	}
	public static void main(String[] args) {
		
		GenericType<String> gen=new GenericType<>("Jayesh");
		
		gen.getData(56);
		
		try {}
		catch(Exception e) {

	}finally {}
	
		
	}

}
