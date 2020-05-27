package com.codefortomorrow.intermediate.chapter12.solutions;

/*
Create a class called Book with 5 private fields:
title (String), author (String), genre (String),
numberOfPages (int), and rating (a double from 0 to 5).
Create a default constructor and a 5-argument constructor.
Create getters and setters for all of the fields.
Bonus points if you write Javadoc comments for each of the methods!
 */

public class Book {
	private String title;
	private String author;
	private String genre;
	private int numberOfPages;
	private double rating;

	/** Constructs a default Book */
	public Book() {
		title = "";
		author = "";
		genre = "";
		numberOfPages = 0;
		rating = 0;
	}

	/**
	 * Constructs a Book given its title,
	 * author, genre, number of pages,
	 * and rating
	 * @param title  the title of the book
	 * @param author  the book's author
	 * @param genre  the genre of the book
	 * @param numberOfPages  the number of pages in the book
	 * @param rating  the book's rating from 0 to 5 stars
	 */
	public Book(String title, String author, String genre, int numberOfPages, double rating) {
		this.title = title;
		this.author = author;
		this.genre = genre;
		this.numberOfPages = numberOfPages;
		this.rating = rating;
	}

	/**
	 * Returns the book's title
	 * @return the book's title
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * Sets the book's title
	 * to a new value
	 * @param title  the new title
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	/**
	 * Returns the book's author
	 * @return the book's author
	 */
	public String getAuthor() {
		return author;
	}

	/**
	 * Sets the book's author to
	 * a new value
	 * @param author  the new author
	 */
	public void setAuthor(String author) {
		this.author = author;
	}

	/**
	 * Returns the book's genre
	 * @return the book's genre
	 */
	public String getGenre() {
		return genre;
	}

	/**
	 * Sets the book's genre
	 * to a new value
	 * @param genre  the new genre
	 */
	public void setGenre(String genre) {
		this.genre = genre;
	}

	/**
	 * Returns the number of pages
	 * in this book
	 * @return the number of pages
	 * in this book
	 */
	public int getNumberOfPages() {
		return numberOfPages;
	}

	/**
	 * Sets the number of pages
	 * to a new value, if the
	 * new value is positive
	 * @param numberOfPages  the new number of pages
	 */
	public void setNumberOfPages(int numberOfPages) {
		if (numberOfPages >= 0) {
			this.numberOfPages = numberOfPages;
		}
	}

	/**
	 * Returns the book's rating
	 * @return the book's rating
	 */
	public double getRating() {
		return rating;
	}

	/**
	 * Sets the book's rating
	 * to a new value, if the
	 * new rating is between
	 * 0 and 5 (inclusive)
	 * @param rating
	 */
	public void setRating(double rating) {
		if (rating >= 0 && rating <= 5) {
			this.rating = rating;
		}
	}
}
