package practiceprograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Tictactoe {
	
	public static void main(String[] args) {
		Integer array[]= {1,2,3,4,5,6,7,8,9};
		char game[][]= {{' ','|',' ','|',' '},
		                {'-','+','-','+','-'},
		                {' ','|',' ','|',' '},
		                {'-','+','-','+','-'},
		                {' ','|',' ','|',' '}};
	    List<Integer> player1=new ArrayList<Integer>();
	    List<Integer> player2=new ArrayList<Integer>();
	    List<Integer> numbers= new ArrayList<Integer>(Arrays.asList(array));
	    Scanner s=new Scanner(System.in);
	    
	    
	    for(int i=1;i<=6;i++)
	    {
	    	if(i%2==1)
	    	{
	    		System.out.println("player1 turn can enter following numbers");
	    		System.out.println(numbers);
	    		System.out.println();
	    		int number=s.nextInt();
	    		player1.add(number);
	    		for(int k=0;k<=numbers.size()-1;k++)
	    		{
	    			if(numbers.get(k)==number)
	    			{
	    				numbers.remove(k);
	    			}
	    		}
	    		if(number==1)
	    		{
	    			game[4][0]='X';
	    		}
	    		if(number==2)
	    		{
	    			game[4][2]='X';
	    		}
	    		if(number==3)
	    		{
	    			game[4][4]='X';
	    		}
	    		if(number==4)
	    		{
	    			game[2][0]='X';
	    		}
	    		if(number==5)
	    		{
	    			game[2][2]='X';
	    		}
	    		if(number==6)
	    		{
	    			game[2][4]='X';
	    		}
	    		if(number==7)
	    		{
	    			game[0][0]='X';
	    		}
	    		if(number==8)
	    		{
	    			game[0][2]='X';
	    		}
	    		if(number==9)
	    		{
	    			game[0][4]='X';
	    		}
	    		
	    		print(game);
	    		if(deside(player1)==true)
	    		{
	    			System.out.println("player1 is won");
	    			break;
	    		}
	    	}
	    	else
	    	{
	    		System.out.println("player2 turn can enter following numbers");
	    		System.out.println(numbers);
	    		System.out.println();
	    		int number=s.nextInt();
	    		player2.add(number);
	    		for(int k=0;k<=numbers.size()-1;k++)
	    		{
	    			if(numbers.get(k)==number)
	    			{
	    				numbers.remove(k);
	    			}
	    		}
	    		if(number==1)
	    		{
	    			game[4][0]='O';
	    		}
	    		if(number==2)
	    		{
	    			game[4][2]='O';
	    		}
	    		if(number==3)
	    		{
	    			game[4][4]='O';
	    		}
	    		if(number==4)
	    		{
	    			game[2][0]='O';
	    		}
	    		if(number==5)
	    		{
	    			game[2][2]='O';
	    		}
	    		if(number==6)
	    		{
	    			game[2][4]='O';
	    		}
	    		if(number==7)
	    		{
	    			game[0][0]='O';
	    		}
	    		if(number==8)
	    		{
	    			game[0][2]='O';
	    		}
	    		if(number==9)
	    		{
	    			game[0][4]='O';
	    		}
	    		
	    		print(game);
	    		if(deside(player2)==true)
	    		{
	    			System.out.println("player2 is won");
	    			break;
	    		}
	    	}
	    }
	    
	    for(int i=1;i<=2;i--)
	    	
	    {
	    	if(i%2==1)
	    	{
	    		System.out.println("player1 turn can enter following number to be replaced");
	    		System.out.println(player1);
	    		System.out.println();
	    		int remove=s.nextInt();
	    		for(int k=0;k<=player1.size()-1;k++)
	    		{
	    			if(player1.get(k)==remove)
	    			{
	    				player1.remove(k);
	    			}
	    		}
	    		if(remove==1)
	    		{
	    			game[4][0]=' ';
	    		}
	    		if(remove==2)
	    		{
	    			game[4][2]=' ';
	    		}
	    		if(remove==3)
	    		{
	    			game[4][4]=' ';
	    		}
	    		if(remove==4)
	    		{
	    			game[2][0]=' ';
	    		}
	    		if(remove==5)
	    		{
	    			game[2][2]=' ';
	    		}
	    		if(remove==6)
	    		{
	    			game[2][4]=' ';
	    		}
	    		if(remove==7)
	    		{
	    			game[0][0]=' ';
	    		}
	    		if(remove==8)
	    		{
	    			game[0][2]=' ';
	    		}
	    		if(remove==9)
	    		{
	    			game[0][4]=' ';
	    		}
	    		print(game);
	    		System.out.println("player1 turn can enter following numbers to be placed");
	    		//System.out.println(numbers);
	    		System.out.println();
	    		int number=s.nextInt();
	    		player1.add(number);
	    		for(int k=0;k<=numbers.size()-1;k++)
	    		{
	    			if(numbers.get(k)==number)
	    			{
	    				numbers.remove(k);
	    			}
	    		}
	    		if(number==1)
	    		{
	    			game[4][0]='X';
	    		}
	    		if(number==2)
	    		{
	    			game[4][2]='X';
	    		}
	    		if(number==3)
	    		{
	    			game[4][4]='X';
	    		}
	    		if(number==4)
	    		{
	    			game[2][0]='X';
	    		}
	    		if(number==5)
	    		{
	    			game[2][2]='X';
	    		}
	    		if(number==6)
	    		{
	    			game[2][4]='X';
	    		}
	    		if(number==7)
	    		{
	    			game[0][0]='X';
	    		}
	    		if(number==8)
	    		{
	    			game[0][2]='X';
	    		}
	    		if(number==9)
	    		{
	    			game[0][4]='X';
	    		}
	    		numbers.add(remove);
	    		
	    		print(game);
	    		if(deside(player1)==true)
	    		{
	    			System.out.println("player1 is won");
	    			break;
	    		}
	    		
	    		
	    	}
	    	else
	    	{
	    		System.out.println("player2 turn can enter following number to be replaced");
	    		System.out.println(player2);
	    		System.out.println();
	    		int remove=s.nextInt();
	    		for(int k=0;k<=player2.size()-1;k++)
	    		{
	    			if(player2.get(k)==remove)
	    			{
	    				player2.remove(k);
	    			}
	    		}
	    		if(remove==1)
	    		{
	    			game[4][0]=' ';
	    		}
	    		if(remove==2)
	    		{
	    			game[4][2]=' ';
	    		}
	    		if(remove==3)
	    		{
	    			game[4][4]=' ';
	    		}
	    		if(remove==4)
	    		{
	    			game[2][0]=' ';
	    		}
	    		if(remove==5)
	    		{
	    			game[2][2]=' ';
	    		}
	    		if(remove==6)
	    		{
	    			game[2][4]=' ';
	    		}
	    		if(remove==7)
	    		{
	    			game[0][0]=' ';
	    		}
	    		if(remove==8)
	    		{
	    			game[0][2]=' ';
	    		}
	    		if(remove==9)
	    		{
	    			game[0][4]=' ';
	    		}
	    		print(game);
	    		System.out.println("player2 turn can enter following numbers to be placed");
	    		//System.out.println(numbers);
	    		System.out.println();
	    		int number=s.nextInt();
	    		player2.add(number);
	    		for(int k=0;k<=numbers.size()-1;k++)
	    		{
	    			if(numbers.get(k)==number)
	    			{
	    				numbers.remove(k);
	    			}
	    		}
	    		if(number==1)
	    		{
	    			game[4][0]='O';
	    		}
	    		if(number==2)
	    		{
	    			game[4][2]='O';
	    		}
	    		if(number==3)
	    		{
	    			game[4][4]='O';
	    		}
	    		if(number==4)
	    		{
	    			game[2][0]='O';
	    		}
	    		if(number==5)
	    		{
	    			game[2][2]='O';
	    		}
	    		if(number==6)
	    		{
	    			game[2][4]='O';
	    		}
	    		if(number==7)
	    		{
	    			game[0][0]='O';
	    		}
	    		if(number==8)
	    		{
	    			game[0][2]='O';
	    		}
	    		if(number==9)
	    		{
	    			game[0][4]='O';
	    		}
	    		numbers.add(remove);
	    		
	    		print(game);
	    		if(deside(player2)==true)
	    		{
	    			System.out.println("player2 is won");
	    			break;
	    		}
	    		
	    	}
	    }
	    
	    
		

	}
	
	
	static void print(char game[][]) 
	{
//	    for (int i = 0; i<5; i++)
//	    {
//	       System.out.print('\n');
//	    }
	 
	    for(int i=0;i<=game.length-1;i++)
		{
			for(int j=0;j<=game.length-1;j++)
			{
			     System.out.print(game[i][j]);	
			}
			System.out.println();
		}
	}
	
	static boolean deside(List player)
	{
		Integer s1[]= {1,2,3};
		Integer s2[]= {4,5,6};
		Integer s3[]= {7,8,9};
		Integer s4[]= {1,5,9};    
		Integer s5[]= {3,5,7};
		Integer s6[]= {7,4,1};
		Integer s7[]= {8,5,2};
		Integer s8[]= {9,6,3};
		if(player.containsAll(new ArrayList<Integer>(Arrays.asList(s1)))||
		   player.containsAll(new ArrayList<Integer>(Arrays.asList(s2)))||
		   player.containsAll(new ArrayList<Integer>(Arrays.asList(s3)))||
		   player.containsAll(new ArrayList<Integer>(Arrays.asList(s4)))||
		   player.containsAll(new ArrayList<Integer>(Arrays.asList(s5)))||
		   player.containsAll(new ArrayList<Integer>(Arrays.asList(s6)))||
		   player.containsAll(new ArrayList<Integer>(Arrays.asList(s7)))||
		   player.containsAll(new ArrayList<Integer>(Arrays.asList(s8)))
		   )
		{
			return true;
		}
		else
		{
			return false;
		}
		
		
	}
	

}
