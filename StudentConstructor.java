/* JFM1T7_Assignment1:

   Write a program to initialize data members of Student class using constructor.
   Prompt the user for the  values to be input from the terminal

   Sample Input:
   Enter student name: Shree Balaji
   Enter student Roll no: 01

   Expected Output:
   Name: Shree Balaji    Roll no: 01

*/

import java.util.Scanner;
class Student1
  {
    private String Rollno;
    private String name;
    Student1()
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the Student Name:");
      name=sc.nextLine();
      System.out.println("Enter the Student Rollno:");
      Rollno=sc.nextLine();
      System.out.println();
    }
//main method
//initialize Student class using constructor
//Get student name and rollno from user and set it to the Student object  
//print result
//Create Student class in that declare variables name and roll number 
//create Scanner object
//take input from user
//add  setter method for rollno
public void setRollno(String Rollno)
{ 
         this.Rollno = Rollno; 
} 

//add getter method for rollno
public String getRollNo()
  { 
      return this.Rollno; 
} 
  public void display()
  {
    System.out.println("Expected Output:");
    System.out.println("Name:"+name+" Rollno:"+this.Rollno);
  } 
}
  

//add setters and getters for name fields also
  public class StudentConstructor {
    public static void main(String args[])
    {
      Student1 s =new Student1();
      s.display();
    }
}


