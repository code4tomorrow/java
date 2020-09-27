package com.codefortomorrow.advanced.chapter14.examples;

import java.io.*;

public class FileIO {

    public static void main(String[] args) throws IOException {
        FileInputStream in = null;
        FileOutputStream out = null;
        File file = new File("names.txt");

        try {
            in = new FileInputStream(file);
            out = new FileOutputStream("names_upper.txt");
            int c;
            while ((c = in.read()) != -1) out.write(
                Character.toUpperCase((char) c)
            );
        } catch (IOException e) {
            System.out.println("An IO Exception occurred.");
            e.printStackTrace(); // Prints error output stream.
        } finally {
            if (in != null) in.close();
            if (out != null) out.close();
        }
    }
}
