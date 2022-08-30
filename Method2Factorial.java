import java.util.Scanner;
class Method2Factorial
  {
    public static void main(String args[])
    {
      int n,fact=1;
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter n value");
      n=sc.nextInt();
      
      for( ;n>=1;n--)
        {
          fact=fact*n;
        }
      System.out.println("The factorial of given number:"+fact);
        }
  }