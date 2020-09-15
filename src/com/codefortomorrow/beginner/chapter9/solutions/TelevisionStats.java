package com.codefortomorrow.beginner.chapter9.solutions;

/*
 * Create a program called TelevisionStats
 * which takes user input for a show
 * and type of statistic and displays the
 * statistic asked for. The program should
 * end whenever the user enters "quit".
 *
 * Use separate 1D arrays for the type of stats,
 * shows, seasons, episodes, wins, nominations,
 * rating, start year, and end year.
 *
 * The data you need can be found here:
 * https://docs.google.com/spreadsheets/d/15A5AdwYm45FZvHizYGYuJXdQJwnKlildm6y8vp4P-jI/edit?usp=sharing
 *
 * Sample output: https://youtu.be/auKR4KX74q8
 */

import java.util.Scanner;

public class TelevisionStats {

    public static void main(String[] args) {
        // types of statistics
        String[] stats = {
            "seasons",
            "episodes",
            "wins",
            "nominations",
            "rating",
            "start year",
            "end year",
        };

        // show statistics
        String[] shows = {
            "Game of Thrones",
            "Breaking Bad",
            "The Walking Dead",
            "Supernatural",
            "FRIENDS",
            "Doctor Who",
            "Black Mirror",
            "The Simpsons",
            "The Big Bang Theory",
            "How I Met Your Mother",
        };

        int[] seasons = { 8, 5, 10, 15, 10, 12, 5, 31, 12, 9 };
        int[] episodes = { 73, 62, 144, 319, 236, 156, 22, 676, 281, 208 };
        int[] wins = { 313, 138, 69, 22, 71, 113, 23, 173, 67, 25 };
        int[] nominations = { 505, 217, 195, 85, 211, 195, 75, 309, 236, 90 };
        double[] rating = { 8.8, 9.0, 8.1, 8.5, 8.5, 7.7, 7.9, 7.2, 7.9, 8.2 };
        int[] start = {
            2011,
            2008,
            2010,
            2005,
            1994,
            2005,
            2011,
            1989,
            2007,
            2005,
        };
        int[] end = {
            2019,
            2013,
            2020,
            2020,
            2004,
            2020,
            2020,
            2020,
            2019,
            2014,
        };

        // Print out user instructions
        System.out.println(
            "The following shows have been stored in our database:"
        );

        // print shows in the shows array
        System.out.print("[");
        for (int i = 0; i < shows.length; i++) {
            System.out.print(shows[i]);
            if (i < shows.length - 1) {
                System.out.print(", ");
            } else {
                System.out.println("]");
            }
        }

        System.out.println();

        // print stat types
        System.out.println("The following stats are available for selection:");
        System.out.print("[");
        for (int i = 0; i < stats.length; i++) {
            System.out.print(stats[i]);
            if (i < stats.length - 1) {
                System.out.print(", ");
            } else {
                System.out.println("]");
            }
        }

        System.out.println("\nType \"quit\" to end the program.\n");

        String show; // name of the show the user is researching
        String stat; // type of statistic the user wants
        int index = -1; // index of the show

        Scanner reader = new Scanner(System.in);

        boolean quit = false; // whether the user wants to quit
        do {
            // keep asking the user for a show until
            // they give a valid show
            while (index == -1) {
                System.out.print(
                    "Which show's stats would you like to research? "
                );
                show = reader.nextLine().toLowerCase(); // case insensitive

                // if user quits, exit the program
                if (show.equals("quit")) {
                    System.out.println("Quitting...");
                    quit = true;
                    break;
                } else { // user enters a show
                    // find the index of that show
                    for (int i = 0; i < shows.length; i++) {
                        if (show.equalsIgnoreCase(shows[i])) { // case insensitive
                            index = i; // match found
                        }
                    }

                    // if the show given is invalid
                    if (index == -1) {
                        // print error message
                        System.out.println(
                            "Sorry, we don't have data for that show. Please try again."
                        );
                    }
                }
            }

            if (!quit) {
                boolean validStatistic = false; // whether the user has entered a valid stat type

                // keep asking user for a stat type until they give a valid stat type or quit the program
                while (!validStatistic) {
                    System.out.print("Which stat would you like? ");
                    stat = reader.nextLine().toLowerCase(); // case insensitive
                    validStatistic = true; // assume stat type is valid

                    // bring up the stat the user wants
                    switch (stat) {
                        case "seasons":
                            System.out.println(
                                shows[index] +
                                " has aired " +
                                seasons[index] +
                                " seasons."
                            );
                            break;
                        case "episodes":
                            System.out.println(
                                shows[index] +
                                " has aired " +
                                episodes[index] +
                                " episodes."
                            );
                            break;
                        case "wins":
                            System.out.println(
                                shows[index] +
                                " received " +
                                wins[index] +
                                " wins."
                            );
                            break;
                        case "nominations":
                            System.out.println(
                                shows[index] +
                                " received " +
                                nominations[index] +
                                " nominations."
                            );
                            break;
                        case "rating":
                            System.out.println(
                                shows[index] +
                                " has a rating of " +
                                rating[index]
                            );
                            break;
                        case "start year":
                            System.out.println(
                                shows[index] +
                                " started airing in " +
                                start[index] +
                                "."
                            );
                            break;
                        case "end year":
                            System.out.println(
                                shows[index] +
                                " last aired in " +
                                end[index] +
                                "."
                            );
                            break;
                        case "quit":
                            System.out.println("Quitting...");
                            quit = true;
                            break;
                        default: // invalid stat type
                            System.out.println(
                                "Sorry, we don't have that stat. Please try again."
                            );
                            validStatistic = false;
                    }
                }
            }

            // reset index (next iteration will ask user for show again)
            index = -1;
            System.out.println();
        } while (!quit);

        System.out.println("You have successfully exited the program.");

        reader.close();
    }
}
