package practiceprograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class TicTacToe2 {

	
	public static Scanner input = new Scanner(System.in);
	public static boolean result= false;
	public static char grid[][]= {
			{' ','|',' ','|',' '},
			{'-','+','-','+','-'},
			{' ','|',' ','|',' '},
			{'-','+','-','+','-'},
			{' ','|',' ','|',' '}};
	public static Set<Integer> PositionsAvilable;
	public static List<Integer> PositionsOfA = new ArrayList<Integer>();
	public static List<Integer> PositionsofB = new ArrayList<Integer>();
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Integer number;
		Integer Positions[]= {1,2,3,4,5,6,7,8,9};
		PositionsAvilable= new TreeSet<Integer>(Arrays.asList(Positions));
		printGrid(grid);
		for(int i=0;i<6;i++) 
		{
			if(i%2==0)
			{	
				System.out.println(" Player A : Avilable slots to select");
				System.out.println(PositionsAvilable.toString());
				number = input.nextInt();
				while(!placer(number, 'X'))
				{
					number = input.nextInt();
				}
				PositionsOfA.add(number);
				printGrid(grid);
				PositionsAvilable.remove(number);
				if(desider(PositionsOfA))
				{
					System.out.println("Player A Won");
					break;
				}

			}
			else
			{      
				System.out.println(" Player B : Avilable slots to select");
				System.out.println(PositionsAvilable);
				number = input.nextInt();
				while(!placer(number, 'O'))
				{
					number = input.nextInt();
				}

				PositionsofB.add(number);
				printGrid(grid);
				PositionsAvilable.remove(number);
				if(desider(PositionsofB))
				{
					System.out.println("Player B Won");
					break;
				}
			}
		}
		if(result==false)
		{
			for(int i=0;i<30;i++) 
			{
				if(i%2==0)
				{	
					System.out.println(" Player A : Avilable slots to remove");
					System.out.println(PositionsOfA.toString());
					number = input.nextInt();
					while(!remover(number, PositionsOfA))
					{
						number = input.nextInt();
					}
					PositionsOfA.remove(new Integer(number));
					printGrid(grid);
					System.out.println(" Player A : Avilable slots to select");
					System.out.println(PositionsAvilable.toString());
					PositionsAvilable.add(number);
					number = input.nextInt();
					while(!placer(number, 'X'))
					{
						number = input.nextInt();
					}
					PositionsOfA.add(number);
					printGrid(grid);
					PositionsAvilable.remove(number);
					if(desider(PositionsOfA))
					{
						System.out.println("Player A Won");
						break;
					}

				}
				else
				{      
					System.out.println(" Player B : Avilable slots to remove");
					System.out.println(PositionsofB.toString());
					number = input.nextInt();
					while(!remover(number, PositionsofB))
					{
						number = input.nextInt();
					}
					PositionsofB.remove(new Integer(number));	
					printGrid(grid);
					System.out.println(" Player B : Avilable slots to select");
					System.out.println(PositionsAvilable);
					PositionsAvilable.add(number);
					number = input.nextInt();
					while(!placer(number, 'O'))
					{
						number = input.nextInt();
					}

					PositionsofB.add(number);
					printGrid(grid);
					PositionsAvilable.remove(number);
					if(desider(PositionsofB))
					{
						System.out.println("Player B Won");
						break;
					}
				}
			}
		}



	}

	public static boolean placer(int number,char symbol)
	{
		if(PositionsAvilable.contains(number))
		{
			if(number==1)
			{
				grid[4][0]=symbol;
			}
			if(number==2)
			{
				grid[4][2]=symbol;
			}
			if(number==3)
			{
				grid[4][4]=symbol;
			}
			if(number==4)
			{
				grid[2][0]=symbol;
			}
			if(number==5)
			{
				grid[2][2]=symbol;
			}
			if(number==6)
			{
				grid[2][4]=symbol;
			}
			if(number==7)
			{
				grid[0][0]=symbol;
			}
			if(number==8)
			{
				grid[0][2]=symbol;
			}
			if(number==9)
			{
				grid[0][4]=symbol;
			}

			return true;
		}
		else
		{

			System.out.println(" Invalid input : Please select only from "+PositionsAvilable);
			return false;
		}
	}

	public static boolean remover(int number, List<Integer> l)
	{
		if(l.contains(number))
		{
			if(number==1)
			{
				grid[4][0]=' ';
			}
			if(number==2)
			{
				grid[4][2]=' ';
			}
			if(number==3)
			{
				grid[4][4]=' ';
			}
			if(number==4)
			{
				grid[2][0]=' ';
			}
			if(number==5)
			{
				grid[2][2]=' ';
			}
			if(number==6)
			{
				grid[2][4]=' ';
			}
			if(number==7)
			{
				grid[0][0]=' ';
			}
			if(number==8)
			{
				grid[0][2]=' ';
			}
			if(number==9)
			{
				grid[0][4]=' ';
			}

			return true;
		}
		else
		{

			System.out.println(" Invalid input : Please select only from "+ l);
			return false;
		}
	}
	public static void printGrid(char [][]grid)
	{
		for(int i=0;i<=grid.length-1;i++)
		{
			for(int j=0;j<= grid[0].length-1;j++)
			{
				System.out.print(grid[i][j]);
			}
			System.out.println();
		}

		for(int i=0;i<5;i++)
		{
			System.out.println();
		}
	}
	public static boolean desider(List<Integer> s)
	{
		Integer p1[]= {1,2,3};
		Integer p2[]= {4,5,6};
		Integer p3[]= {7,8,9};
		Integer p4[]= {1,4,7};
		Integer p5[]= {2,5,8};
		Integer p6[]= {3,6,9};
		Integer p7[]= {3,5,7};
		Integer p8[]= {1,5,9};

		if(s.containsAll(Arrays.asList(p1)) ||
				s.containsAll(Arrays.asList(p2)) ||
				s.containsAll(Arrays.asList(p3)) ||
				s.containsAll(Arrays.asList(p4)) ||
				s.containsAll(Arrays.asList(p5)) ||
				s.containsAll(Arrays.asList(p6)) ||
				s.containsAll(Arrays.asList(p7)) ||
				s.containsAll(Arrays.asList(p8)) ) 
		{
			result=true;
			return true;
		}
		else
		{
			return false;
		}
	}
	
	
}
