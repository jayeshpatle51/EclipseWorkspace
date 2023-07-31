package Mainproject.simpleproject;



import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SpiralPattren {

	
	public static void main(String[] args) {
	
		int i=0;
		int j=0;
		String direction="Right";
		int num=1;
		int matrix[][] =new int[4][5];
		List<Integer> pattren=new ArrayList<>();
	//	System.out.println(matrix.length*matrix[0].length);
		while( num<=matrix.length*matrix[0].length)
		{
			
			if( direction.equalsIgnoreCase("Right") && i==0)
			{
				if(j==matrix[0].length || pattren.contains(i*10+j))
				{
					direction="down";
					j--;
					continue;
				}
				
				pattren.add(i*10+j); 
				//System.out.println(i+" "+j);
				matrix[i][j]=num;
				j++;
				
			}
			else if( direction.equalsIgnoreCase("down") )
			{
				i++;
				if(i==matrix.length || pattren.contains(i*10+j))
				{
					direction="left";
					i--;
					continue;
				}
				
				pattren.add(i*10+j);
			//	System.out.println(i+" "+j);
				matrix[i][j]=num;
		
				
			}
			else if( direction.equalsIgnoreCase("left") )
			{
				j--;
				if(j==-1 || pattren.contains(i*10+j))
				{
					direction="UP";
					j++;
					continue;
				}
				
				pattren.add(i*10+j);
				//System.out.println(i+" "+j);
				matrix[i][j]=num;
		
				
			}
			
			else if( direction.equalsIgnoreCase("UP") )
			{
				i--;
				if(i==-1 || pattren.contains(i*10+j))
				{
					direction="Right";
					i++;
					continue;
				}
				
				pattren.add(i*10+j);
				//System.out.println(i+" "+j);
				matrix[i][j]=num;
		
				
			}
			else if( direction.equalsIgnoreCase("Right") )
			{
				j++;
				if(j==matrix[0].length || pattren.contains(i*10+j))
				{
					direction="down";
					j--;
					continue;
				}
				
				pattren.add(i*10+j); 
			//	System.out.println(i+" "+j);
				matrix[i][j]=num;
					
			}
			
			num++;
			
			
			
				System.out.println(Arrays.toString(matrix[i]));
			
			
		}
		System.out.println("\n\n");
		for(int m =0;m< matrix.length;m++)
		{
			System.out.println(Arrays.toString(matrix[m]));
		
		}
		
		

	}

}
