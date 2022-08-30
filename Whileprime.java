// check prime number or not
import java.util.Scanner;
class Whileprime
  {
    public static void main(String args[])
    {
      int i=1,n,count=0;
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter n value");
      n=sc.nextInt();
      while(i<=n)
        {
          if(n%i==0)
          count++;
          i++;
         }
      if(count==2)
        System.out.println("it is a prime number");
      else
        System.out.println("it is not a prime number");
    }
  }