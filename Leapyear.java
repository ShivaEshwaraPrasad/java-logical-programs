import java.util.Scanner;
class Leapyear
  {
    public static void main (String args[])
    {
      int year;
      Scanner sc =new Scanner(System.in);
      System.out.println("Enter year:");
      year=sc.nextInt();
      if(year%4!=0)
      {
        System.out.println("print year is not leap year:");
        }
      else
        if(year%100!=0)
      {
        System.out.println("print year is leap year:");
      }
        else
          if(year%400!=0)
          {
          System.out.println("print year is not leap year:");  
          }
         else
          {
            System.out.println("print year is leap year:");
          }
    }
  }
        
      