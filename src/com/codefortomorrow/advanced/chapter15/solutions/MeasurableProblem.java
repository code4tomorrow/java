package com.codefortomorrow.advanced.chapter15.solutions;
import java.util.Arrays;
/*
Create a Measurable interface
that is used to “measure” anything. Add necessary methods.
Required Methods: double average(Measurable[] items),
largest(Measurable[] items) or smallest(Measurable[] items).
Create a Student class that implements Measurable and
it’s methods(you can compare whatever you measure, i.e. GPA).
Note: for the largest/smallest methods don’t worry
about the case if they are equal.

Problem adapted from Java SE 9 Textbook
*/
public class MeasurableProblem{
  public static void main(String[] args){
    Object[] students = {
      new Student("John", 2.7),
      new Student("Josh", 1.2),
      new Student("Jacob", 3.4),
      new Student("Rebecca", 3.5),
      new Student("Arnav", 4.0)
    };
    Student test = new Student();
    System.out.println("Average: " + test.average(students));
    System.out.println("Largest: " + test.largest(students));
    System.out.println("Smallest: " + test.smallest(students));
  }
}
interface Measurable{
  abstract double average(Object[] students);
  abstract String largest(Object[] students);
  abstract String smallest(Object[] students);
}
class Student implements Measurable{
  private double GPA;
  private String name;
  public Student(String name, double GPA){
    this.name = name;
    this.GPA = GPA;
  }
  public Student(){
    name = "";
    GPA = 0.0;
  }
  public double average(Object[] orig){
    Student[] students = Arrays.copyOf(orig, orig.length, Student[].class); //Casting
    double sum = 0;
    for(Student s: students)
      sum += s.getGPA();
    return sum / students.length;
  }
  public String largest(Object[] orig){
    Student[] students = Arrays.copyOf(orig, orig.length, Student[].class); //Casting
    Student curr = students[0];
    for(Student s: students){
      if(s.getGPA() > curr.getGPA())
        curr = s;
    }
    return curr.getName();
  }
  public String smallest(Object[] orig){
    Student[] students = Arrays.copyOf(orig, orig.length, Student[].class); //Casting
    Student curr = students[0];
    for(Student s: students){
      if(s.getGPA() < curr.getGPA())
        curr = s;
    }
    return curr.getName();
  }
  public double getGPA(){
    return GPA;
  }
  public String getName(){
    return name;
  }
}
