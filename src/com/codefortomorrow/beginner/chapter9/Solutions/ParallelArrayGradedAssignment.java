package com.codefortomorrow.beginner.chapter9.solutions;

import java.util.Scanner;

public class ParallelArrayGradedAssignment
{

	public static void main(String[] args) 
	{
		Scanner reader = new Scanner (System.in);

		// Case, death, and recovery numbers are those reported by John Hopkins University at 2:01 PM on Wednesday 4/22/2020
		// Population is as reported by worldometers.info at 2:01 PM on 4/22/2020
		// Death rate, recovery rate, and infection rate are calculated using above data.
		// Alveera's Risk Letter Grade is self determined and is a fun educated guess not actual scientific fact

		//Data
		String[] countries = {"United States", "Spain", "Italy", "France", "Germany", "United Kingdom", "Turkey", "Iran", "China", "Russia"};
		String[] capitals = {"Washington D.C.", "Spain", "Rome", "Paris", "Berlin", "London", "Ankara", "Tehran", "Beijing", "Moscow"};
		int[] population = {331002651, 46754778, 60461826, 65273511, 83783942, 67886011, 84339067, 83992949, 1439323776, 145934462};
		int[] numofcases = {826248, 208389, 183957, 159315, 149044, 134635, 95591, 85996, 83868, 57999};
		int[] deaths = {45894, 21717, 25085, 20829, 5165, 18151, 2376, 5391, 4636, 513};
		int[] recoveries = {76070, 85915, 54543, 39850, 99400, 676, 16477, 63113, 77861, 4420};
		double[] deathrate = {Math.round(deaths[0]/(double)numofcases[0]*10000)/100.0, Math.round(deaths[1]/(double)numofcases[1]*10000)/100.0, Math.round(deaths[2]/(double)numofcases[2]*10000)/100.0, Math.round(deaths[3]/(double)numofcases[3]*10000)/100.0, Math.round(deaths[4]/(double)numofcases[4]*10000)/100.0, Math.round(deaths[5]/(double)numofcases[5]*10000)/100.0, Math.round(deaths[6]/(double)numofcases[6]*10000)/100.0, Math.round(deaths[7]/(double)numofcases[7]*10000)/100.0, Math.round(deaths[8]/(double)numofcases[8]*10000)/100.0, Math.round(deaths[9]/(double)numofcases[9]*10000)/100.0};
		double[] recoveryrate = {Math.round(recoveries[0]/(double)numofcases[0]*10000)/100.0, Math.round(recoveries[1]/(double)numofcases[1]*10000)/100.0, Math.round(recoveries[2]/(double)numofcases[2]*10000)/100.0, Math.round(recoveries[3]/(double)numofcases[3]*10000)/100.0, Math.round(recoveries[4]/(double)numofcases[4]*10000)/100.0, Math.round(recoveries[5]/(double)numofcases[5]*10000)/100.0, Math.round(recoveries[6]/(double)numofcases[6]*10000)/100.0, Math.round(recoveries[7]/(double)numofcases[7]*10000)/100.0, Math.round(recoveries[8]/(double)numofcases[8]*10000)/100.0, Math.round(recoveries[9]/(double)numofcases[9]*10000)/100.0};
		double[] infectionrate = {Math.round(numofcases[0]/(double)population[0]*10000)/100.0, Math.round(numofcases[1]/(double)population[1]*10000)/100.0, Math.round(numofcases[2]/(double)population[2]*10000)/100.0, Math.round(numofcases[3]/(double)population[3]*10000)/100.0, Math.round(numofcases[4]/(double)population[4]*10000)/100.0, Math.round(numofcases[5]/(double)population[5]*10000)/100.0, Math.round(numofcases[6]/(double)population[6]*10000)/100.0, Math.round(numofcases[7]/(double)population[7]*10000)/100.0, Math.round(numofcases[8]/(double)population[8]*10000)/100.0, Math.round(numofcases[9]/(double)population[9]*10000)/100.0};
		char[] riskgrade = new char [10];
		
		// Determining Risk Grade
		for (int x = 0; x < countries.length; x++)
		{
			if (infectionrate[x] > 0.25 || deathrate[x] > 25)
			{
				riskgrade[x] = 'A';
			}
			else if (infectionrate[x] > 0.2 || deathrate[x] > 15)
			{
				riskgrade[x] = 'B';
			}
			else if (infectionrate[x] > 0.15 || deathrate[x] > 10)
			{
				riskgrade[x] = 'C';
			}
			else if (infectionrate[x] > 0.1 || deathrate[x] > 5)
			{
				riskgrade[x] = 'D';
			}
			else
			{
				riskgrade[x] = 'F';
			}
		}

		// Printing out instructions
		System.out.println("The following countries have been stored in our database:");
		System.out.println("[United States, Spain, Italy, France, Germany, United Kingdom, Turkey, Iran, China, Russia]\n");
		System.out.println("The following stats are available for selection:");
		System.out.println("[Capital, Number of Cases, Population, Deaths, Recoveries, Death Rate, Recovery Rate, Infection Rate, Risk Grade]");
		System.out.println("\t**Risk Grade is a rating of how dangerous the virus is in that country, A being most dangerous and F being least dangerous.\n");
		System.out.println("Type \"quit\" to end the program.\n");

		String country = "";
		String stat;
		int index = -1;
		
		// Enter a country
		while (!country.equalsIgnoreCase("quit"))
		{
			while (index == -1)
			{
				System.out.print("Which country’s stats would you like to research? ");
				country = reader.nextLine();
				// Break While
				if (country.equalsIgnoreCase("quit"))
				{
					index = -2;
				}
				// Finds index
				for (int x = 0; x < countries.length; x++)
				{
					if (countries[x].equalsIgnoreCase(country))
					{
						index = x;
					}
				}
				// Invalid Response
				if (index == -1)
				{
					System.out.println("This response was invalid; try again.");
				}
			}
			
			// QUIT GAME
			if (country.equalsIgnoreCase("quit"))
			{
				break;
			}
			
			// Instructions
			System.out.print("Which stat would you like? ");
			stat = reader.nextLine();
			System.out.println();
			
			// Bring stat
			if (stat.equalsIgnoreCase("capital"))
			{
				System.out.println(countries[index] + "'s capital is " + capitals[index] + ".");
			}
			else if (stat.equalsIgnoreCase("number of cases"))
			{
				System.out.println(countries[index] + " has " + numofcases[index] + " cases of COVID-19.");
			}
			else if (stat.equalsIgnoreCase("population"))
			{
				System.out.println(countries[index] + " has a population of " + population[index] + " people.");
			}
			else if (stat.equalsIgnoreCase("deaths"))
			{
				System.out.println(countries[index] + " has " + deaths[index] + " coronavirus related deaths.");
			}
			else if (stat.equalsIgnoreCase("recoveries"))
			{
				System.out.println(countries[index] + " has " + recoveries[index] + " people who recovered from COVID-19.");
			}
			else if (stat.equalsIgnoreCase("death rate"))
			{
				System.out.println(countries[index] + " has a " + deathrate[index] + "% coronavirus death rate.");
			}
			else if (stat.equalsIgnoreCase("recovery rate"))
			{
				System.out.println(countries[index] + " has a " + recoveryrate[index] + "% coronavirus recovery rate.");
			}
			else if (stat.equalsIgnoreCase("infection rate"))
			{
				System.out.println(countries[index] + " has a " + infectionrate[index] + "% COVID-19 infection rate.");
			}
			else if (stat.equalsIgnoreCase("risk grade"))
			{
				System.out.println(countries[index] + " has a risk grade of " + riskgrade[index] + ".");
			}
			else
			{
				System.out.println("This response was invalid; try again.");
			}
			
			// Prepare for loop
			index = -1;
			System.out.println();
			System.out.println();
		}
		reader.close();
	}
}
