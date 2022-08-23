import java.util.Scanner;
class Positive
  {
    public static void main (String args[])
    {
      int num;
      Scanner sc =new Scanner(System.in);
      System.out.println("Enter num value:");
      num=sc.nextInt();
      if(num>0)
      {
        System.out.println("print num is positive integer");
      }
      else
      {
        System.out.println("print num is not positive integer");
      }
    }
  }