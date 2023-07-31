package practiceprograms;

public class PascalTriangle {
	public static int factorial(int no) {
		
		int fact=1;
		for(int i=no;i>=1;i--) {
			fact=fact*i;
		}
		return fact;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int no=9;
		
		for(int i=0;i<no;i++) {
			int m=1;
			for(int k=no-1;k>=i;k--) {
				System.out.print("-");
			}
			for(int j=1;j<=i;j++) {
				//System.out.print(factorial(i)/(factorial(j)*factorial(i-j))+" ");
				System.out.print(m+" ");
				m=m*(i-j)/j;
			}
			System.out.println();
		}
	}

}
