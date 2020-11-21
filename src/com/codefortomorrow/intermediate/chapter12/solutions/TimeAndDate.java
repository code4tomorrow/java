package com.codefortomorrow.intermediate.chapter12.solutions;

/*
Create 2 classes: MyTime and MyDate.

MyTime UML:
+ hours: int
+ minutes: int
+ seconds: int
----------------------------------------
+ MyTime()
+ MyTime(hours: int, minutes: int: seconds: int)
+ toString()

MyDate UML:
+ month: int
+ day: int
+ year: int
----------------------------------------
+ MyDate()
+ MyDate(month: int, day: int: year: int)
+ toString()

The toString() method for the MyTime class should
display the object like so: hours:minutes:seconds
For example, 5 hours, 35 minutes, and 45 seconds would be:
5:35:45

The toString() method for the MyDate class should
display the object like so: MM/DD/YYYY
For example, May 25, 2020 would be:
5/25/2020

Create a driver program called TimeAndDate,
which creates a MyTime and MyDate object
and prints out the current time and date.
 */

public class TimeAndDate {

    public static void main(String[] args) {
        MyTime time = new MyTime(5, 35, 45);
        MyDate date = new MyDate(5, 25, 2020);
        System.out.println("The time is " + time);
        System.out.println("The date is " + date);
    }
}

class MyTime {

    public int hours;
    public int minutes;
    public int seconds;

    public MyTime() {
        hours = 0;
        minutes = 0;
        seconds = 0;
    }

    public MyTime(int hours, int minutes, int seconds) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    @Override
    public String toString() {
        return String.format("%d:%d:%d", hours, minutes, seconds);
    }
}

class MyDate {

    public int month;
    public int day;
    public int year;

    public MyDate() {
        month = 1;
        day = 1;
        year = 2000;
    }

    public MyDate(int month, int day, int year) {
        this.month = month;
        this.day = day;
        this.year = year;
    }

    @Override
    public String toString() {
        return String.format("%d/%d/%d", month, day, year);
    }
}
