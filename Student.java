import java.util.Scanner;
class Student
  {
    public static void main (String args[])
    {
      int sno;
      String sname;
      float phy;
      float maths;
      float chem;
      float stotal;
      float savg;
      Scanner sc = new Scanner(System.in);
      System.out.println("enter the student number:");
      sno=sc.nextInt();
      System.out.println("enter the student name:");
      sname=sc.next();
      System.out.println("enter the phy marks:");
      phy=sc.nextFloat();
      System.out.println("enter the maths marks:");
      maths=sc.nextFloat();
      System.out.println("enter the chem marks:");
      chem=sc.nextFloat();
      stotal=phy+maths+chem;
      savg=stotal/3;
      System.out.println("print the student number:"+sno);
      System.out.println("print the student name:"+sname);
      System.out.println("print the physics marks:"+phy);
      System.out.println("print the maths marks:"+maths);
      System.out.println("print the chemistry marks:"+chem);
      System.out.println("print the total marks:"+stotal);
      System.out.println("print the average marks:"+savg);
    }
  }
      
      
      
      
      
      
      
      
      
      
      