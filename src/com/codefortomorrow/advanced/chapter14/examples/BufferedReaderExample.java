package com.codefortomorrow.advanced.chapter14.examples;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * Source: https://beginnersbook.com/2014/01/how-to-read-file-in-java-using-bufferedreader/
 */
public class BufferedReaderExample {
    public static void main(String[] args) {

        BufferedReader br = null;
        BufferedReader br2 = null;

        try {
            br = new BufferedReader(new FileReader("B:\\myfile.txt"));

            //One way of reading the file
            System.out.println("Reading the file using readLine() method:");
            String contentLine = br.readLine();
            while (contentLine != null) {
                System.out.println(contentLine);
                contentLine = br.readLine();
            }

            br2 = new BufferedReader(new FileReader("B:\\myfile2.txt"));

            //Second way of reading the file
            System.out.println("Reading the file using read() method:");
            int num=0;
            char ch;
            while((num=br2.read()) != -1)
            {
                ch=(char)num;
                System.out.print(ch);
            }

        }
        catch (IOException ioe)
        {
            ioe.printStackTrace();
        }
    }
}

