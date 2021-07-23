package classdatabase;
import java.lang.Math;

public class ClassDatabase {
  public static void main (String []args) {
    Classroom hamdan = new Classroom();
  }
}//------------end of main()-------------------
class Student {
  private String surname;
  private String givenName;
  private int[] marks = new int[10];
  Student()//default constructor that sets Strings as null and integers as -1 
  {
    givenName = null;
    surname = null;
    for(int i = 0; i < marks.length; i++) {
    marks[i] = -1;
    }
  }
  Student(String x , String y) {//captures the parameters from the array of objects
    givenName = y; surname = x;
  }
  public String getSurname() {
    return surname;
  }
  public String getGivenname() {
    return givenName;
  }
  public int[] getMarks() {
    return marks;
  }
  public void fillRandom() {//for loop that fills the array of marks with random numbers between 50-100
    for(int i = 0; i < marks.length; i++) {
    marks[i] = (int)(Math.random() * 50+51);
    }
  }
  public double calcAverage() {//calculates the average of the students 10 marks
    double average = 0;
    for(int i = 0; i < marks.length; i++) {
    average = average + marks[i];
    }
    average = (average/10);
    return average;
  }
  public void display(){//displays the students name, marks, and average
    System.out.println("===================================");
    System.out.printf("%s %s \n", givenName, surname);
    System.out.println("=======================");
    System.out.print("Marks: [");
    for(int i = 0; i < (marks.length -1); i++) {
    System.out.print(marks[i]);
    System.out.print(", ");
    }
    System.out.print(marks[9]);
    System.out.println("]");
    System.out.printf("Average: %.1f \n", calcAverage());
  }
}//----------end of Student class-----------------
class Classroom {
  Student [] objStud = new Student[5];//creates memory space for 5 objects
  Classroom()
  {
  objStud[0] = new Student("Agostini", "Aldo");//Array of Objects :Database
  objStud[0].fillRandom();//calls each of the methods from the Student class
  objStud[0].calcAverage();
  objStud[0].display();
  objStud[1] = new Student("Spano", "Joe");
  objStud[1].fillRandom();
  objStud[1].calcAverage();
  objStud[1].display();
  objStud[2] = new Student("Menesis", "Alain");
  objStud[2].fillRandom();
  objStud[2].calcAverage();
  objStud[2].display();
  objStud[3] = new Student("Perrone", "Maria");
  objStud[3].fillRandom();
  objStud[3].calcAverage();
  objStud[3].display();
  objStud[4] = new Student("Ribkoff", "Jordan");
  objStud[4].fillRandom();
  objStud[4].calcAverage();
  objStud[4].display();
  calcAverage();//calls the metohds from the Classroom class
  display();
  }
  public double calcAverage() {//calculates the average of the class
    double sum = 0.0;
    for(int i = 0; i < 5; i++) {
    sum = sum + objStud[i].calcAverage();
    }
  return (sum/5.0);
  }
  public void display(){//displays the class average
  System.out.println("===================================");
  System.out.printf("Class Average: %.1f\n", calcAverage());
  }
}//----------end of Classroom class----------------- 
