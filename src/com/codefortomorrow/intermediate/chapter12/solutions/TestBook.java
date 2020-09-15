package com.codefortomorrow.intermediate.chapter12.solutions;

/*
Create a driver class called TestBook to test your Book class
that you wrote in the last practice exercise. In the main method of TestBook,
create a Book object using the 5-argument constructor. Print out the result
of calling all of the getter methods on the Book object. Then use the setter
methods to change each of the 5 fields, and print out the result of calling
all of the getter methods on the Book object again to check that the setter methods work.
 */

public class TestBook {

    public static void main(String[] args) {
        // create a book object using 5-arg constructor
        Book myBook = new Book(
            "Six of Crows",
            "Leigh Bardugo",
            "fantasy",
            465,
            5
        );

        // call all getters
        System.out.println(myBook.getTitle());
        System.out.println(myBook.getAuthor());
        System.out.println(myBook.getGenre());
        System.out.println(myBook.getNumberOfPages());
        System.out.println(myBook.getRating());

        // call all setters
        myBook.setTitle("The Lost Hero");
        myBook.setAuthor("Rick Riordan");
        myBook.setGenre("sci-fi fantasy");
        myBook.setNumberOfPages(553);
        myBook.setRating(4.5);

        // call all getters
        System.out.println(myBook.getTitle());
        System.out.println(myBook.getAuthor());
        System.out.println(myBook.getGenre());
        System.out.println(myBook.getNumberOfPages());
        System.out.println(myBook.getRating());
    }
}
