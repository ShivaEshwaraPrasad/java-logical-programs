import java.util.Scanner;
class Newpercentage
  {
    public static void main (String args[])
    {
      int sno;
      String sname;
      int max ;
      float phy;
      float maths;
      float chem;
      float computer;
      float biology;
      float stotal;
      float percentage;
      Scanner sc = new Scanner(System.in);
      System.out.println("enter the student number:");
      sno=sc.nextInt();
      System.out.println("enter the student name:");
      sname=sc.next();
       System.out.println("enter the max marks:");
      max=sc.nextInt();
      
      System.out.println("enter the phy marks:");
      phy=sc.nextFloat();
      System.out.println("enter the maths marks:");
      maths=sc.nextFloat();
      System.out.println("enter the chem marks:");
      chem=sc.nextFloat();
       System.out.println("enter the computer marks:");
      computer=sc.nextFloat();
       System.out.println("enter the biology marks:");
      biology=sc.nextFloat();
      stotal=phy+maths+chem+computer+biology;
      percentage=(stotal/max)*100;
      System.out.println("print the student number:"+sno);
      System.out.println("print the student name:"+sname);
      System.out.println("print the maximum marks:"+max);
      System.out.println("print the physics marks:"+phy);
      System.out.println("print the maths marks:"+maths);
      System.out.println("print the chemistry marks:"+chem);
      System.out.println("print the computer marks:"+computer);
      System.out.println("print the biology marks:"+biology);
      System.out.println("print the total marks:"+stotal);
      System.out.println("print the  percentage marks:"+percentage);
      //To check student pass or fail
      if(percentage>=90)
      {
       System.out.println("Grade A"); 
      }
      //student is pass allot the grade
      else if(percentage>=80&&percentage<=89)
       {
        System.out.println("Grade B");
       }
      else if(percentage>=70&&percentage<=79)
      {
        System.out.println("Grade C");
      }
       else if(percentage>=60&&percentage<=69)
      {
        System.out.println("Grade D");
      }
      
     else if(percentage>=40&&percentage<=59)
      {
        System.out.println("Grade E");
      }
      
      else if(percentage<=40)
      {
        System.out.println("Grade F");
      }
      else
      {
        System.out.println("Result Fail");
      }
    } 
    } 