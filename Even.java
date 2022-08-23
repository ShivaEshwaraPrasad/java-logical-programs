import java.util.Scanner;
class Even
  {
    public static void main (String args[])
    {
      int num;
      Scanner sc =new Scanner(System.in);
      System.out.println("Enter num value:");
      num=sc.nextInt();
      if(num%2==0)
      {
        System.out.println("print num is even");
      }
      else
      {
        System.out.println("print num is not even");
      }
    }
  }
        
      