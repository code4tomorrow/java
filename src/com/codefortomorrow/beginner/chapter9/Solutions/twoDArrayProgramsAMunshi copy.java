package twoDArrayProgramsAMunshi;

public class twoDArrayProgramsAMunshi {

	public static void main(String[] args) {

		// 1
		int a[][] = new int[4][6];
		int sum = 0;
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		for (int x = 0; x < 4; x++) 
		{
			for (int y = 0; y < 6; y++) 
			{
				a[x][y] = (int) (Math.random() * 71 + 7);
				System.out.print(a[x][y] + "\t");
				sum += a[x][y];
				if (a[x][y] < min)
					min = a[x][y];
				if (a[x][y] > max)
					max = a[x][y];

			}
			System.out.println();
		}
		System.out.println("Sum: " + sum);
		System.out.println("Max: " + max);
		System.out.println("Min: " + min);
		System.out.println();
		System.out.println();

		// 2
		String b[][] = new String[3][3];
		String str = "*";
		int ast = 0;
		for (int x = 0; x < 3; x++) 
		{
			for (int y = 0; y < 3; y++) 
			{
				b[x][y] = str;
				System.out.print(b[x][y] + "\t");
				ast += (x + 1);

			}
			System.out.println();
			str += "*";
		}
		System.out.println("Number of Asterisks: " + ast);
		System.out.println();
		System.out.println();

		// 3
		int c[][] = new int[5][4];
		for (int power = 2; power < 7; power++) 
		{
			for (int base = 2; base < 6; base++) 
			{
				int res = 1;
				for (int j = power; j > 0; j--) 
				{

					res = res * base;
					c[power - 2][base - 2] = res;
				}

				System.out.print(c[power - 2][base - 2] + "\t");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println();
		
		//1
		int quiz[][] = new int [3][4];
		for (int row = 0; row < quiz.length; row++) 
		{
			for (int col = 0; col < quiz[row].length; col++) 
			{
				quiz[row][col] = (int) (Math.random() * 37 + 21);
				System.out.print(quiz[row][col] + "\t");

			}
			System.out.println();
		}
		
		sum = 0;
		for (int col = 0; col < quiz[1].length; col++)
		{
			sum+=quiz[1][col];
		}
		System.out.println("Sum of row 2: " + sum);

	}
}