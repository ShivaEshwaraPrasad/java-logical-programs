//Find factorial of given number
import java.util.Scanner;
class Factorialforloop
  {
    public static void main(String args[])
    {
      int i,n,fact=1;
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter n value");
      n=sc.nextInt();
      
      for(i=1;i<=n;i++)
        {
          fact=fact*i;
        }
      System.out.println("The factorial of given number:"+fact);
        }
  }