package parallelArrayPrograms;

import java.util.Scanner;
public class ParallelArrayPrograms 
{
	public static void main(String[]args)
	{
		//1
		int num[][] = new int [1][5];
		String street[][] = new String [1][5];
		String apt[][] = new String [1][5];
		int zip[][] = new int [1][5];
		initintArray(num, "number");
		initstrArray(street, "street");
		initstrArray(apt, "apartment");
		initintArray(zip, "zipcode");
		System.out.println();
		for (int c = 0; c < num[0].length; c++)
		{
			if (apt[0][c].equals("-"))
				System.out.println(num[0][c] + " " + street[0][c] + " " + zip[0][c]);
			else
				System.out.println(num[0][c] + " " + street[0][c] + " Apt " + apt[0][c] + " " + zip[0][c]);
		}
		
		//2
		String fn[][] = new String [1][6];
		String li[][] = new String [1][6];
		int id[][] = new int [1][6];
		int pe[][] = new int [1][6];
		int pp[][] = new int [1][6];
		double g[][] = new double [1][6];
		initstrArray(fn, "first name");
		initstrArray(li, "last initial");
		initintArray(id, "student ID");
		initintArray(pe, "points earned");
		initintArray(pp, "points possible");
		for (int c = 0; c < g[0].length; c++)
		{
			g[0][c] = (pe[0][c])/((double)(pp[0][c])) * 100;
		}
		System.out.println();
		for (int c = 0; c < fn[0].length; c++)
		{
			System.out.println(fn[0][c] + " " + li[0][c] + " " + id[0][c] + " " + pe[0][c] + " " + pp[0][c] + " " + (int)g[0][c] + "%");
		}
		
	}
	public static void initintArray (int[][] n, String message)
	{
		Scanner reader = new Scanner(System.in);
		for (int x = 0; x < n[0].length; x++)
		{
			System.out.print("Please enter a " + message + " " + (x+1) + ": ");
			n[0][x] = reader.nextInt();
		}
		
	}
	public static void initstrArray (String[][] n, String message)
	{
		Scanner reader = new Scanner(System.in);
		for (int x = 0; x < n[0].length; x++)
		{
			System.out.print("Please enter a " + message + " " + (x+1) + ": ");
			n[0][x] = reader.nextLine();
		}
		
	}
}
