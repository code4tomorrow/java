package com.codefortomorrow.advanced.chapter14.solutions;
import java.io.*;

/*
The file “numbers.txt” has 100 random numbers
(one on each line). Use file i/o to find the
average of these numbers. Write “Average: ”
and display the average on the next (101st)
line of the file.

Hint: Just like BufferedReader and FileReader,
there are BufferedWriter and FileWriter classes
that allow you to add full words to files,
instead of just bytes. You should do a quick
Google search to explore these classes first,
but just to get you started:

new FileWriter(“fileName.txt”, true)

will create an instance of FileWriter, and
the “true” puts it in append mode, so you
start writing to the end of the file instead
of writing over the existing content from the beginning.
*/

public class Average {
    public static void main(String[] args) {
        File file = new File("numbers.txt");
        
        // try with resources block, which closes streams automatically
        try(BufferedReader in = new BufferedReader(
            new FileReader(file)); BufferedWriter out = new BufferedWriter(
            new FileWriter(file, true))) {

            // read the numbers (String input) and find average
            double average = 0;
            String contentLine = in.readLine();
            while (contentLine != null) {
                average += Integer.parseInt(contentLine);
                contentLine = in.readLine();
            }
            average /= 100.;

            // append average to end of file
            out.write("Average: " + average);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
