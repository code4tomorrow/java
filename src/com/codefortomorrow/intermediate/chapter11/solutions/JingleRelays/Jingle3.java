package com.codefortomorrow.intermediate.chapter11.solutions.JingleRelays;
/*
This is the third of a series of problems.
Problem Credit: Christopher Haver, Computer Science, South Brunswick High School, New Jersey


Jingle Bell Challenge!  Problem 3

Using ony method calls and the String song. Print
"Jingle Bells Jingle Bells Jingle All The Way" vertically
with one letter on each line.  If you do so correctly
the "You Win!" graphic will print at the bottom.

This is one of a few possible solutions.
*/
public class Jingle3{

public static void main(String[]args){

	String song = ""; //DO NOT CHANGE THESE
	String winningString = "J\ni\nn\ng\nl\ne\n\nB\ne\nl\nl\ns\n\nJ\ni\nn\ng\nl\ne\n\nB\ne\nl\nl\ns\n\nJ\ni\nn\ng\nl\ne\n\nA\nl\nl\n\nT\nh\ne\n\nW\na\ny\n\n";

	/*****   ONLY WRITE THE CODE BETWEEN THESE COMMENTS TO CALL METHODS FOR A SOLUTION  ******/

	song += jingleBells(6,1) + jingleBells(6,1) + jingle() + end(98,99,100,101,102);


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

public static String end(int a, int b, int c, int d, int e){
	String outString = "A\nl\nl\n\n";
	int sum = a + b + c + d + e;
	double mean = (a + b + c + d + e) / 5.0;
	if (sum >= 473)
		if (a != b && b != c && c!= d && d != e )
			if (mean == 100.0)
				outString += "T\nh\ne\n\nW\na\ny\n\n";
			else
				outString += "N\ni\ng\nh\nt\n\n";
		else
			outString += "Y\no\nu\n\nW\na\nn\nt\n\n";
	else
		outString += "A\nr\no\nu\nn\nd\n\n";
	return outString;
}

public static String jingleBells(int a,int b){
	String outputString = "";
	switch (a % 7) {
		case 6: outputString += "J\n";
		case 5: outputString += "i\n";
		case 4: outputString += "n\n";
		case 3: outputString += "g\n";
		case 2: outputString += "l\n";
		case 1: outputString += "e\n";
		default: outputString += "\n";

	}

	switch (a /b ){
	 	case 6: outputString += "B\ne\nl\nl\ns\n\n";
			break;
		default:  outputString += "B\nl\no\nr\np\n\n";
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
