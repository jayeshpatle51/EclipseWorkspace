package Mainproject.simpleproject;

public class SpiralpatternByyashmant {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n=5;
	       int m=5;
	       int[][] M=new int[n][m];
	       int i=1; //print variable
	       int mR=0,mC=0,MR=n-1,MC=m-1;
	       while(i<=(n*m))
	           {
	           for(int j=mC;j<MC;j++) {
	            M[mR][j]=i++;
	            for(int k=0;k<M.length;k++) {
	            	for(int l=0;l<M[k].length;l++) {
	            		System.out.print(M[k][l]+" ");
	            	}
	            	System.out.println();
	            }
	            System.out.println("-------------------");
	           }
	           
	           for(int j=mR;j<=MR;j++) {
	               M[j][MC]=i++;
	               
	               for(int k=0;k<M.length;k++) {
		            	for(int l=0;l<M[k].length;l++) {
		            		System.out.print(M[k][l]+" ");
		            	}
		            	System.out.println();
		            }
	               System.out.println("-------------------");
	           }
	           
	           for(int j=MC-1;j>=mC;j--) {
	               M[MR][j]=i++;
	               
	               for(int k=0;k<M.length;k++) {
		            	for(int l=0;l<M[k].length;l++) {
		            		System.out.print(M[k][l]+" ");
		            	}
		            	System.out.println();
		            }
	               System.out.println("-------------------");
	           }
	           
	           for(int j=MR-1;j>=mR+1;j--) {
	               M[j][mC]=i++;
	               
	               for(int k=0;k<M.length;k++) {
		            	for(int l=0;l<M[k].length;l++) {
		            		System.out.print(M[k][l]+" ");
		            	}
		            	System.out.println();
		            }
	               System.out.println("-------------------");
	           }
	           
	           //updte pointer
	           mC++;mR++;MC--;MR--;
	           }
	     //  System.out.println(M[0][3]);
	       for( i=0;i<n;i++) {
	          for(int j=0;j<m;j++) {
	              System.out.print(M[i][j]+"\t");
	          }
	          System.out.println();
	       }
		
	}

}
