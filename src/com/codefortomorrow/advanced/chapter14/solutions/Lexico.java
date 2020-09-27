package com.codefortomorrow.advanced.chapter14.solutions;

import java.io.*;

/*
Practice: Use File I/O to compare two files lexicographically.
Lexicographical order is very similar to alphabetical order,
except that it includes more than just lowercase alphabets.
Given two text files f1 and f2, write a program that will
compare their contents and output to the console the
title of the file which comes first lexicographically.

Hint: Java’s String.compareTo method may be of use to you.
*/

public class Lexico {

    public static void main(String[] args) {
        try(BufferedReader br = new BufferedReader(new FileReader("f1.txt"));
        BufferedReader br2 = new BufferedReader(new FileReader("f2.txt"));) {
            String line1 = br.readLine();
            String line2 = br2.readLine();
            int c = line1.compareTo(line2);
            while (c == 0){
              line1 = br.readLine();
              line2 = br2.readLine();
              c = line1.compareTo(line2);
            }
            if(c > 0)
              System.out.println("File 2");
            else
              System.out.println("File 1");
        } catch(IOException e){
          e.printStackTrace();
        }
    }
}
