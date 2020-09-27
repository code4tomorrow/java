package com.codefortomorrow.advanced.chapter14.examples;

import java.io.*;

public class Throws {

    public static void main(String[] args) {
        try {
            File file = null;
            access(file);
        } catch (IOException e) {
            System.out.println("There was an IOException.");
        }
    }

    public static void access(File file) throws IOException {
        if (file == null) throw new IOException();
    }
}
