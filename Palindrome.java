// check number palindrome or not
import java.util.Scanner;
class Palindrome
  {
    public static void main(String args[])
    {
      int n,r=0,digit, t;
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter n value");
      n=sc.nextInt();
      t=n;
      while(n>0)
        {
          digit=n%10;
          r=r*10+digit;
          n=n/10;
        }
      if(r==t)
        System.out.println("it is a palindrome number");
      else
        System.out.println("it is not a palindrome number");
    }
  }
        
        