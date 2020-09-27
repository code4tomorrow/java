package com.codefortomorrow.advanced.chapter14.examples;
import java.io.*;

public class TryWithResources {

    public static void main(String[] args) throws IOException {
        File file = new File("names.txt");

        try (FileInputStream in = new FileInputStream(file);
            FileOutputStream out = new FileOutputStream("names_upper.txt")) {

            int c;
            while ((c = in.read()) != -1)
                out.write(Character.toUpperCase((char)c));

        } catch (IOException e) {
            System.out.println("An IO Exception occurred.");
            e.printStackTrace();  // Prints error output stream.
        }
    }
}
