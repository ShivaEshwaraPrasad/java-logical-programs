/*  JFM1T7_Assignment4:

    Write a program to declare a static variable roll_number inside student class. Create 3 student objects and print their names and roll numbers.
    Hint: Use increment operator to get different value of roll_number for 3 students.

   
    Expected Output:
    Roll no:1  Name: Shree 
    Roll no:2  Name: Balaji
    Roll no:3  Name: Ajay
*/
import java.util.*;
class Student
  {
  String name;
  static int Rollno;
  Student(String b)
    {
    name=b;
    Rollno++;
    }
  void display()
    {
    System.out.println("Roll no:"+Rollno+" Name:"+name);
     }
    }

public class StaticVariable {
  public static void main(String args[])
  {
    Student s1=new Student("Shree");
    s1.display();
     Student s2=new Student("Balaji");
    s2.display();
     Student s3=new Student("Ajay");
    s3.display();
  }
    
  }

//main method

//initializing Student class constructor by 3 times and passing 3 student names

//displaying student name and roll number
     


//declare Student class andd add declare name, rollno(static)

//add getters and setterss