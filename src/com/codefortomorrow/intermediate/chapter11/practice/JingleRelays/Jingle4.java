package com.codefortomorrow.intermediate.chapter11.practice.JingleRelays;
/*
This is the fourth of a series of problems.
Credit: Christopher Haver, Computer Science, South Brunswick High School, New Jersey

	Using ony method calls and the String song. Print
	"Jingle Bells Jingle Bells Jingle All The Way" vertically
	with one letter on each line.  If you do so correctly
	the "You Win!" graphic will print at the bottom.
*/

public class Jingle4{

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


public static String end(boolean a, boolean b, boolean c, boolean d){
	boolean flag = (!(a && !b)  || c && !d);
	String outString = "";
	if (flag)
		outString = "A\nl\nl\n\nT\nh\ne\n\nW\na\ny\n\n";
	else
		outString = "A\nl\nl\n\nD\na\ny\n\nL\no\nn\ng\n\n";



	return outString;
}

public static String jingleBells(int a){
	String outputString = "";
	switch ((a/2) % 17) {
		case 12: outputString += "\n";
				break;
		case 11: outputString += "B\n";
		case 10: outputString += "e\n";
		case 9: outputString += "l\n";
		case 8: outputString += "l\n";
		case 7: outputString += "s\n";
				break;

		case 6: outputString += "J\n";
		case 5: outputString += "i\n";
		case 4: outputString += "n\n";
		case 3: outputString += "g\n";
		case 2: outputString += "l\n";
		case 1: outputString += "e\n\n";
				break;

	}


	return outputString;


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
