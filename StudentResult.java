/* JFM1T7_Assignment2:

   Create a Student Result Processing System for 3 students.
   
   Sample inputs: Console input roll numbers, names and 5 subject marks for each student
   
   Sample output: Display roll numbers, names and percentage obtained by all 3 students in the following format:
   Roll Number: 1
   Name: Shree Balaji
   Percentage: 99%

*/
import java.util.*;
class Student
  {
    Scanner sc= new Scanner(System.in);
    int Rollno;
    String name;
    double phy,maths,chem,Bio,comp,total,percentage;
    void read()
    {
       System.out.println("Enter the student RollNumber:");
      Rollno=sc.nextInt();
      System.out.println("Enter the student name:");
      name=sc.nextLine();
      name+=sc.nextLine();
      System.out.println("Enter Physics marks:");
      phy=sc.nextDouble();
      System.out.println("Enter Maths marks:");
      maths=sc.nextDouble();
      System.out.println("Enter chemistry marks:");
      chem=sc.nextDouble();
      System.out.println("Enter Biology  marks:");
      Bio=sc.nextDouble();
      System.out.println("Enter Computer marks:");
      comp=sc.nextDouble();
    }
      
    }
class derive1 extends Student
{
  void calculate()
  {
    total=phy+maths+chem+Bio+comp;
    percentage=total/5;
  }
    
  }
class derive2 extends derive1
  {
    void report()
    {
      System.out.println("The RollNumber:"+Rollno);
       System.out.println("The  name is:"+name);
       System.out.println("The Percentage is:"+percentage);
    }
  }
  
  

public class StudentResult {
  public static void main(String args[])
  {
    
    derive2 d1= new derive2();
    derive2 d2=new derive2();
    derive2 d3=new derive2();
    d1.read();
    d2.read();
    d3.read();
    d1.calculate();
    d2.calculate();
    d3.calculate();
    d1.report();
    d2.report();
    d3.report();
  }
}
//main method

//initialize student constructor 3 times with different names

//Create an array and add the 3 student to it

//create displayPercentage static method in that add a for loop for student array

//calculate percentage

//display student details

//create getStudentInput method in that create a Scanner object and take input from user

//print 5 subject marks using for loop
     


//create Student class 

//declare and initialize variables

//add getters and setters method
