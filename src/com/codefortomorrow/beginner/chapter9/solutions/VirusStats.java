package com.codefortomorrow.beginner.chapter9.solutions;

/*
 * Create a program called VirusStats
 * which takes user input for a country
 * and type of statistic and displays the
 * statistic asked for. The program should
 * end whenever the user enters "quit".
 *
 * Use separate 1D arrays for the type of stats,
 * countries, capitals, population, number of cases,
 * deaths, recoveries, death rates, recovery rates,
 * infection rates, and "risk grade." (Please note that
 * "risk grades" are not based on actual scientific
 * fact and were made up for the purposes of this exercise.)
 *
 * The data you need can be found here:
 * https://docs.google.com/spreadsheets/d/1XZ0GjALsu2mhraGMJoj37jTmy_S2sw51FFMeywqkcnw/edit?usp=sharing
 *
 * To calculate the death rate:
 * Take that country's deaths and divide it by the number of cases.
 *
 * To calculate the recovery rate:
 * Take that country's number of recoveries and divide it
 * by the number of cases.
 *
 * To calculate the infection rate:
 * Take that country's number of cases and divide it
 * by the population.
 *
 * For the rates: Bonus points if you can round them (or format them)
 * to the nearest hundredths place.
 *
 * To determine the "risk grade", where 'A' is most dangerous
 * and 'F' is least dangerous:
 *
 * 'A' if infection rate > 0.25 OR death rate > 25
 * 'B' if infection rate > 0.2 OR death rate > 15
 * 'C' if infection rate > 0.15 OR death rate > 10
 * 'D' if infection rate > 0.1 OR death rate > 5
 * 'F' for all else
 *
 * Sample output: https://youtu.be/rFuGY2wXcKc
 */

import java.util.Scanner;

public class VirusStats {

    public static void main(String[] args) {
        // types of statistics
        String[] stats = {
            "capital",
            "number of cases",
            "population",
            "deaths",
            "recoveries",
            "death rate",
            "recovery rate",
            "infection rate",
            "risk grade",
        };

        // Data for 10 countries on COVID-19
        String[] countries = {
            "United States",
            "Spain",
            "Italy",
            "France",
            "Germany",
            "United Kingdom",
            "Turkey",
            "Iran",
            "China",
            "Russia",
        };
        String[] capitals = {
            "Washington D.C.",
            "Madrid",
            "Rome",
            "Paris",
            "Berlin",
            "London",
            "Ankara",
            "Tehran",
            "Beijing",
            "Moscow",
        };
        int[] population = {
            331002651,
            46754778,
            60461826,
            65273511,
            83783942,
            67886011,
            84339067,
            83992949,
            1439323776,
            145934462,
        };
        int[] numberOfCases = {
            826248,
            208389,
            183957,
            159315,
            149044,
            134635,
            95591,
            85996,
            83868,
            57999,
        };
        int[] deaths = {
            45894,
            21717,
            25085,
            20829,
            5165,
            18151,
            2376,
            5391,
            4636,
            513,
        };
        int[] recoveries = {
            76070,
            85915,
            54543,
            39850,
            99400,
            676,
            16477,
            63113,
            77861,
            4420,
        };

        double[] deathRate = new double[countries.length];
        double[] recoveryRate = new double[countries.length];
        double[] infectionRate = new double[countries.length];
        char[] riskGrade = new char[countries.length];

        // calculate death rate, recovery rate,
        // and infection rate for all countries
        for (int i = 0; i < countries.length; i++) {
            // convert rates to a percent, and round to the nearest hundredth
            deathRate[i] =
                Math.round(deaths[i] / (double) numberOfCases[i] * 10000) /
                100.0;
            recoveryRate[i] =
                Math.round(recoveries[i] / (double) numberOfCases[i] * 10000) /
                100.0;
            infectionRate[i] =
                Math.round(numberOfCases[i] / (double) population[i] * 10000) /
                100.0;
        }

        // determine risk grade
        for (int x = 0; x < countries.length; x++) {
            if (infectionRate[x] > 0.25 || deathRate[x] > 25) {
                riskGrade[x] = 'A';
            } else if (infectionRate[x] > 0.2 || deathRate[x] > 15) {
                riskGrade[x] = 'B';
            } else if (infectionRate[x] > 0.15 || deathRate[x] > 10) {
                riskGrade[x] = 'C';
            } else if (infectionRate[x] > 0.1 || deathRate[x] > 5) {
                riskGrade[x] = 'D';
            } else {
                riskGrade[x] = 'F';
            }
        }

        // Print out user instructions
        System.out.println(
            "The following countries have been stored in our database:"
        );

        // print countries in the countries array
        System.out.print("[");
        for (int i = 0; i < countries.length; i++) {
            System.out.print(countries[i]);
            if (i < countries.length - 1) {
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

        System.out.println(
            "\t**Risk Grade is a rating of how dangerous the virus is in that country, A being most dangerous and F being least dangerous.\n"
        );
        System.out.println("Type \"quit\" to end the program.\n");

        String country; // name of the country the user is researching
        String stat; // type of statistic the user wants
        int index = -1; // index of the country

        Scanner reader = new Scanner(System.in);

        boolean quit = false; // whether the user wants to quit
        do {
            // keep asking the user for a country until
            // they give a valid country
            while (index == -1) {
                System.out.print(
                    "Which country's stats would you like to research? "
                );
                country = reader.nextLine().toLowerCase(); // case insensitive

                // if user quits, exit the program
                if (country.equals("quit")) {
                    System.out.println("Quitting...");
                    quit = true;
                    break;
                } else { // user enters a country
                    // find the index of that country
                    for (int i = 0; i < countries.length; i++) {
                        if (country.equalsIgnoreCase(countries[i])) { // case insensitive
                            index = i; // match found
                        }
                    }

                    // if the country given is invalid
                    if (index == -1) {
                        // print error message
                        System.out.println(
                            "Sorry, we don't have data for that country. Please try again."
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
                        case "capital":
                            System.out.println(
                                countries[index] +
                                "'s capital is " +
                                capitals[index] +
                                "."
                            );
                            break;
                        case "number of cases":
                            System.out.println(
                                countries[index] +
                                " has " +
                                numberOfCases[index] +
                                " cases of COVID-19."
                            );
                            break;
                        case "population":
                            System.out.println(
                                countries[index] +
                                " has a population of " +
                                population[index] +
                                " people."
                            );
                            break;
                        case "deaths":
                            System.out.println(
                                countries[index] +
                                " has " +
                                deaths[index] +
                                " COVID-19 related deaths."
                            );
                            break;
                        case "recoveries":
                            System.out.println(
                                countries[index] +
                                " has " +
                                recoveries[index] +
                                " people who recovered from COVID-19."
                            );
                            break;
                        case "death rate":
                            System.out.println(
                                countries[index] +
                                " has a " +
                                deathRate[index] +
                                "% COVID-19 death rate."
                            );
                            break;
                        case "recovery rate":
                            System.out.println(
                                countries[index] +
                                " has a " +
                                recoveryRate[index] +
                                "% COVID-19 recovery rate."
                            );
                            break;
                        case "infection rate":
                            System.out.println(
                                countries[index] +
                                " has a " +
                                infectionRate[index] +
                                "% COVID-19 infection rate."
                            );
                            break;
                        case "risk grade":
                            System.out.println(
                                countries[index] +
                                " has a risk grade of " +
                                riskGrade[index] +
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

            // reset index (next iteration will ask user for country again)
            index = -1;
            System.out.println();
        } while (!quit);

        System.out.println("You have successfully exited the program.");

        reader.close();
    }
}
