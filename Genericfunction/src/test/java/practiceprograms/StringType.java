package practiceprograms;

public class StringType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="1b2a";
		String out=s.replaceAll("[^0-9a-zA-Z]","/").replaceAll("[0-9]", "_").replaceAll("[a-zA-Z]", "-");
		
//		String out=s.replaceAll("[^0-9a-zA-Z]","/");
//		out=out.replaceAll("[0-9]", "_");
//		out=out.replaceAll("[a-zA-Z]", "-");
		System.out.println(out);
		if(!(out.contains("_"))&&out.contains("-")&&!(out.contains("/")))
		{
			System.out.println("Alphabet");
		}else if(out.contains("_")&&!(out.contains("-"))&&!(out.contains("/")))
		{
			System.out.println("Numeric");
		}else if(!(out.contains("_"))&&!(out.contains("-"))&&out.contains("/"))
		{
			System.out.println("SpecialChar");
		}else if(out.contains("_")&&out.contains("-")&&!(out.contains("/")))
		{
			System.out.println("AlphaNumeric");
		}else if(out.contains("_")&&!(out.contains("-"))&&out.contains("/"))
		{
			System.out.println("SpecialCharNumeric");
		}else if(!(out.contains("_"))&&out.contains("-")&&out.contains("/"))
		{
			System.out.println("AlphaSpecialChar");
		}else if(out.contains("_")&&out.contains("-")&&out.contains("/"))
		{
			System.out.println("SpecialCharAlphaNumeric");
		}
		
	
		
		

	}

}
