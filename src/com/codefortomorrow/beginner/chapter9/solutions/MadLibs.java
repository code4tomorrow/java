package com.codefortomorrow.beginner.chapter9.solutions;

/*
 * Create a program called MadLibs
 * which prompts the person for different
 * types of words (like in a game of Mad Libs)
 * and then prints the Mad Libs story with the
 * given words. You can use the Mad Libs template
 * below, or you can search up your own!
 *
 * Mad Libs - Bookish Mad Libs:
 * https://i.pinimg.com/originals/d0/3a/b9/d03ab930f0f65a3b58aa6770095b1fef.jpg
 *
 * Hint: Use an array to store the word types
 * and the words themselves. You may also
 * want to use String formatting to print
 * the Mad Libs story.
 */

import java.util.Scanner;

public class MadLibs {
	public static void main(String[] args) {
		String[] partsOfSpeech = {
				"adjective",
				"noun",
				"plural noun",
				"person in room (female)",
				"adjective",
				"article of clothing",
				"noun",
				"city",
				"plural noun",
				"adjective",
				"part of the body",
				"letter of the alphabet",
				"celebrity",
				"plural noun",
				"adjective",
				"place",
				"part of the body",
				"adjective",
				"adjective",
				"verb",
				"plural noun",
				"number"
		};

		String[] words = new String[partsOfSpeech.length];

		Scanner input = new Scanner(System.in);

		for (int i = 0; i < partsOfSpeech.length; i++) {
			System.out.print("Enter a(n) " + partsOfSpeech[i] + ": ");
			words[i] = input.nextLine();
		}

		System.out.println("\nBookish Mad Libs\n");

		System.out.printf(
				"There are many %s ways to choose a/an %s to read. First, you could ask\n" +
				"for recommendations from your friends and %s. Just don't ask Aunt %s --\n" +
				"she only reads %s books with %s-ripping goddesses on the cover. If your\n" +
				"friends and family are no help, try checking out the %s Review in The %s\n" +
				"Times. If the %s featured there are too %s for your taste, try something\n" +
				"a little more low-%s, like %s: The %s Magazine, or %s Magazine. You could\n" +
				"also choose a book the %s-fashioned way. Head to your local library or %s\n" +
				"and browse the shelves until something catches your %s. Or, you could save\n" +
				"yourself a whole lot of %s trouble and log on to www.bookish.com, the %s new\n" +
				"website to %s for books! With all the time you'll save not having to search\n" +
				"for %s, you can read %s more books!\n",

				words[0],
				words[1],
				words[2],
				words[3],
				words[4],
				words[5],
				words[6],
				words[7],
				words[8],
				words[9],
				words[10],
				words[11],
				words[12],
				words[13],
				words[14],
				words[15],
				words[16],
				words[17],
				words[18],
				words[19],
				words[20],
				words[21]
		);
	}
}
