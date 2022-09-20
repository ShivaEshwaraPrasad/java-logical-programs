import java.util.*;
class Student
  {
   Scanner sc=new Scanner(System.in);
    int sno;
    String sname;
    double phy,maths,chem,stotal,savg;
    void read()
    {
      System.out.println("Enter the student number:");
      sno=sc.nextInt();
      System.out.println("Enter the student name:");
      sname=sc.next();
      System.out.println("Enter Phy marks:");
      phy=sc.nextDouble();
      System.out.println("Enter Maths marks:");
      maths=sc.nextDouble();
      System.out.println("Enter chem marks:");
      chem=sc.nextDouble();
      
    }
  }
class derive1 extends Student
  {
    void calculate()
    {

      stotal=phy+maths+chem;
      savg=stotal/3;
  }
  }
class derive2 extends derive1
  {
    void report()
    {
      System.out.println("The student number is:"+sno);
       System.out.println("The student name is:"+sname);
       System.out.println("The student physics marks is:"+phy);
       System.out.println("The student maths marks is:"+maths);
       System.out.println("The student chemistry marks is:"+chem);
       System.out.println("The student total marks is:"+stotal);
       System.out.println("The student average marks is:"+savg);
    }
  }
class Multilevelinherit
  {
    public static void main(String args[])
    {
      derive2 d2 =new derive2();
      d2.read();
      d2.calculate();
      d2.report();
    }
  }
  
  