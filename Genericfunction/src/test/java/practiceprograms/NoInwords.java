package practiceprograms;

public class NoInwords  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 int [] numbers= {10000000,1000000,100000,10000,1000,100,90,80,70,60,50,40,30,20,19,18,17,16,15,14,13,12,11,10,9,8,7,6,5,4,3,2,1};
		    
		   String [] noInwords={"one crore","ten lakh","one lakh","ten thousand","one thousand","one hundred","ninety","eighty","seventy",
				   "sixty","fifty","fourty","thirty","twenty","nineteen","eighteen","seventeen","sixteen",
				  "fifteen","fourteen","thirteen","twelve","eleven","ten","nine","eight","seven",
				   "six","five","four","three","two","one"};
		    
		   int givenno=85000;
		   StringBuilder inWord = new StringBuilder();  
		   for(int i=0;i<numbers.length;i++) {
			  System.out.println(numbers[i]);
			   while(givenno>=numbers[i]) {
				 givenno=givenno-numbers[i];
				 inWord.append(noInwords[i]+" ");
			   }
		   }
		   
		   System.out.println("Corresponding Given NoInwords is: " + inWord.toString()); 
		   
	}

}
