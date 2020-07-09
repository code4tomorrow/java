package com.codefortomorrow.intermediate.chapter10.examples;

public class Arrays2D {

    public static void main(String[] args) {
        String[][] list = {
            { "hello", "world", "code" },
            { "docs", "slides", "sheets" },
            { "google", "amazon", "facebook" },
            { "this", "is", "java" },
        };

        for (int row = 0; row < list.length; row++) {
            for (int col = 0; col < list[row].length; col++) {
                System.out.println(list[row][col]);
            }
        }
    }
}
