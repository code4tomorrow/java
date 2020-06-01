package parallelArrayProgramAMunshi;

import java.util.Scanner;

public class ParallelArrayProgramAMunshi 
{

	public static void main (String[]args) 
	{

		Scanner reader = new Scanner (System.in);
		
		String title[] = {"Game of Thrones", "Breaking Bad", "The Walking Dead", "Supernatural", "FRIENDS", "Doctor Who", "Black Mirror", "The Simpsons", "The Big Bang Theory", "How I Met Your Mother"};
		int seasons[] = {8, 5, 10, 15, 10, 12, 5, 31, 12, 9};
		int episodes[] = {73, 62, 144, 319, 236, 156, 22, 676, 281, 208};
		int wins[] = {313, 138, 69, 22, 71, 113, 23, 173, 67, 25};
		int nominations[] = {505, 217, 195, 85, 211, 195, 75, 309, 236, 90};
		double rating[] = {8.8, 9.0, 8.1, 8.5, 8.5, 7.7, 7.9, 7.2, 7.9, 8.2};
		int start[] = {2011, 2008, 2010, 2005, 1994, 2005, 2011, 1989, 2007, 2005};
		int end[] = {2019, 2013, 2020, 2020, 2004, 2020, 2020, 2020, 2019, 2014};
		
		System.out.println("The following shows have been stored in the array:\n");
		System.out.println("[Game of Thrones, Breaking Bad, The Walking Dead, Supernatural, FRIENDS, Doctor Who, Black Mirror, The Simpsons, The Big Bang Theory, How I Met Your Mother]");
		System.out.println("The following stats are available for selection:\n");
		System.out.println("[Seasons, Episodes, Wins, Nominations, Rating, Start Year, End Year]\n");
		System.out.println("Type \"quit\" to end the program.\n");
		
		String show = "";
		String stat = "";
		int index = 0;
		while (!show.equalsIgnoreCase("quit"))
		{
			System.out.print("Which show’s stats would you like to research? ");
			show = reader.nextLine();
			if (show.equalsIgnoreCase("quit"))
			{
				break;
			}
			for (int x = 0; x < title.length; x++)
			{
				if (title[x].equalsIgnoreCase(show))
				{
					index = x;
				}
			}
			System.out.print("Which stat would you like? ");
			stat = reader.nextLine();
			if (stat.equalsIgnoreCase("seasons"))
			{
				System.out.println(show + " has aired " + seasons[index] + " seasons.");
			}
			if (stat.equalsIgnoreCase("episodes"))
			{
				System.out.println(show + " has aired " + episodes[index] + " episodes.");
			}
			if (stat.equalsIgnoreCase("wins"))
			{
				System.out.println(show + " recieved " + wins[index] + " wins.");
			}
			if (stat.equalsIgnoreCase("nominations"))
			{
				System.out.println(show + " recieved " + nominations[index] + " nominations.");
			}
			if (stat.equalsIgnoreCase("rating"))
			{
				System.out.println(show + " has a rating of " + rating[index]);
			}
			if (stat.equalsIgnoreCase("start year"))
			{
				System.out.println(show + " started airing in " + start[index] + " seasons.");
			}
			if (stat.equalsIgnoreCase("end year"))
			{
				System.out.println(show + " last aired in " + end[index] + " seasons.");
			}
			
			System.out.println();
			System.out.println();
		}

	}
}
