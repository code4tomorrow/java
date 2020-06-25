package com.codefortomorrow.beginner.chapter3.solutions;

/*
 * Use String Methods to convert the following strings to the results
 * a) "A Tale of Two Cities" -> "WO CIT"
 * b) "A Handmaid's Tale" -> "s"
 * c) "wE LoVe tO CoDe" -> "e love to code"
 */
public class StringSlicer{
  public static void main(String[] args){
    //Initialize original strings
    String s1 = "A Tale of Two Cities";
    String s2 = "A Handmaid's Tale";
    String s3 = "wE LoVe tO CoDe";

    //Use substring + uppercase on the first one
    System.out.println(s1.toUpperCase().substring(11,17));

    //Use charAt for s2
    System.out.println(s2.charAt(11));

    //Use the single-argument substring + lowercase
    System.out.println(s3.toLowerCase().substring(1));
    //You can also use substring(1,15)
  }
}
