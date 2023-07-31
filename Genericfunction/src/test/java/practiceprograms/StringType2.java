package practiceprograms;

public class StringType2 {

	public static void main(String[] args) {

		String str="123df";

		String alpha = "";
		String num = "";
		String spl = "";

		for(int i=0;i<str.length();i++)
		{
			Character c=str.charAt(i);
			//System.out.println(c);
			if(Character.isAlphabetic(c))
			{
				alpha=alpha+str.charAt(i);
			}
			else if(Character.isDigit(c))
			{
				num=num+c;
			}else
			{
				spl=spl+c;
			}    
		}


		if(!alpha.equals("") && !num.equals("") && !spl.equals(""))
		{
			System.out.println("alpha,num & spl");
		}else if(!alpha.equals("") && !num.equals("") && spl.equals(""))
		{
			System.out.println("alpha & num" );
		}else if(!alpha.equals("") && num.equals("") && !spl.equals(""))
		{
			System.out.println("alpha & spl" );
		}else if(alpha.equals("") && !num.equals("") && !spl.equals(""))
		{
			System.out.println("num & spl");
		}else if(!alpha.equals("") && num.equals("") && spl.equals(""))
		{
			System.out.println("alpha");
		}else if(alpha.equals("") && !num.equals("") && spl.equals(""))
		{
			System.out.println("num");
		}else if(alpha.equals("") && num.equals("") && !spl.equals(""))
		{
			System.out.println("spl");
		}

	}

}
