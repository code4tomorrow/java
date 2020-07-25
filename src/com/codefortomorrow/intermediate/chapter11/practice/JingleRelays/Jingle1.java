package com.codefortomorrow.intermediate.chapter11.practice.JingleRelays;
/*
This is the first of a series of problems.
Credit: Christopher Haver, Computer Science, South Brunswick High School, New Jersey

Jingle Bell Challenge!  Problem 1

Using ony method calls and the String song. Print
"Jingle Bells Jingle Bells Jingle All The Way" vertically
with one letter on each line.  If you do so correctly
the "You Win!" graphic will print at the bottom.

Only write code where the comments direct you to.
*/

public class Jingle1{

public static void main(String[]args){

	String song = ""; //DO NOT CHANGE THESE
	String winningString = "J\ni\nn\ng\nl\ne\n\nB\ne\nl\nl\ns\n\nJ\ni\nn\ng\nl\ne\n\nB\ne\nl\nl\ns\n\nJ\ni\nn\ng\nl\ne\n\nA\nl\nl\n\nT\nh\ne\n\nW\na\ny\n\n";

	/*****   ONLY WRITE THE CODE BETWEEN THESE COMMENTS TO CALL METHODS FOR A SOLUTION  ******/
	song += ""; //Build your string here using the methods below to match the winning string

	/******   WRITE CODE ABOVE, NO CHANGES BELOW   *******/

	System.out.println(song);
	if (song.equals(winningString))
		win();
	else
		System.out.println("Sorry, not quite right");

}

//   YOU MAY NOT CHANGE ANY OF THE METHODS BELOW

public static String jingle(){
	return "J\ni\nn\ng\nl\ne\n\n";
}

public static String end(double x){
	String outString = "A\nl\nl\n\n";
	x *= -3.3;
	if (x < 0)
		outString += "N\ni\ng\nh\nt\n\n";
	if (x != 0)
		outString += "T\nh\ne\n\nW\na\ny\n\n";
	else
		outString += "Y\no\nu\n\nW\na\nn\nt\n\n";
	return outString;
}

public static String jingleBells(int x){
	String outString = "";
	if (x == 2){
		outString += jingle() + "B\ne\nl\nl\ns\n\n";
	}
	outString += jingle() + "B\ne\nl\nl\ns\n\n";
	return outString;


}


public static void win(){
	System.out.println("\n              YOU WIN!		\n");
	System.out.println("              ((\\o/))			");
	System.out.println("         .-----//^\\\\-----.	");
	System.out.println("         |    /`| |`\\    |		");
	System.out.println("         |      | |      |		");
	System.out.println("         |      | |      |		");
	System.out.println("         |      | |      |		");
	System.out.println("         '------===------'	\n\n");

}

}
