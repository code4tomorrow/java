package com.codefortomorrow.intermediate.chapter11.practice.JingleRelays;

/*
This is the second of a series of problems.
Credit: Christopher Haver, Computer Science, South Brunswick High School, New Jersey

	Using ony method calls and the String song. Print
	"Jingle Bells Jingle Bells Jingle All The Way" vertically
	with one letter on each line.  If you do so correctly
	the "You Win!" graphic will print at the bottom.
*/

public class Jingle2 {

    public static void main(String[] args) {
        String song = ""; //DO NOT CHANGE THESE
        String winningString =
            "J\ni\nn\ng\nl\ne\n\nB\ne\nl\nl\ns\n\nJ\ni\nn\ng\nl\ne\n\nB\ne\nl\nl\ns\n\nJ\ni\nn\ng\nl\ne\n\nA\nl\nl\n\nT\nh\ne\n\nW\na\ny\n\n";

        /*****   ONLY WRITE THE CODE BETWEEN THESE COMMENTS TO CALL METHODS FOR A SOLUTION  ******/
        song += ""; //Build your string here using the methods below to match the winning string

        /******   WRITE CODE ABOVE, NO CHANGES BELOW   *******/

        System.out.println(song);
        if (song.equals(winningString)) win(); else System.out.println(
            "Sorry, not quite right"
        );
    }

    //   YOU MAY NOT CHANGE ANY OF THE METHODS BELOW

    public static String ingle() {
        return "i\nn\ng\nl\ne\n\n";
    }

    public static String J() {
        return "J\n";
    }

    public static String B() {
        return "B\n";
    }

    public static String end(boolean x, boolean y) {
        String outString = "A\nl\nl\n\n";
        if (!(x || !y)) outString += "N\ni\ng\nh\nt\n\n";
        if (x != y && !y) outString += "T\nh\ne\n\nW\na\ny\n\n";
        if (x == y && x) outString += "Y\no\nu\n\nW\na\nn\nt\n\n";
        return outString;
    }

    public static String ingleElls(String a, String b) {
        switch (a) {
            case "j":
                a = J();
                break;
            case "J":
                a = "j\n\n";
                break;
            default:
                a = "B\n\n";
        }
        switch (b) {
            case "b":
                b = B();
                break;
            case "B":
                b = "b\n\n";
                break;
            default:
                a = "J\n\n";
        }

        return a + ingle() + b + "e\nl\nl\ns\n\n";
    }

    public static void win() {
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
