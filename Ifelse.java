import java.util.Scanner;
class Ifelse
  {
    public static void main (String args[])
    {
      int a,b;
      Scanner sc =new Scanner(System.in);
      System.out.println("Enter a value:");
      a=sc.nextInt();
      System.out.println("Enter b value:");
      b=sc.nextInt();
      if(a>b)
      {
        System.out.println("print a is big");
      }
      else
      {
        System.out.println("print b is big:");
      }
    }
  }
      
      