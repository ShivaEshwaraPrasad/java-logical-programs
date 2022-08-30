// given number is 1234 and print as 4321
import java.util.Scanner;
class Reversenum
  {
    public static void main(String args[])
    {
      int n,revn=0,digit=0;
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter n value");
      n=sc.nextInt();
      
      while(n>0)
        {
          digit=n%10;
          revn=revn*10+digit;
          n=n/10;
        }
      System.out.println("it is Resverse number" +revn);
    }
  }