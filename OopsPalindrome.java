import java.util.Scanner;
class Palindromepass
  {
    int r=0,d,t;
    void palin(int n)
    {
      
      t=n;
      while(n>0)
        {
          d=n%10;
          r=r*10+d;
          n=n/10;
        }
      if(r==t)
        System.out.println("It is palindrome:");
      else 
        System.out.println("not a palindrome:");
      
    }
  }
class OopsPalindrome
  {
    public static void main(String args[])
    {
      Scanner sc =new Scanner(System.in);
      System.out.println("Enter the value:");
      int n= sc.nextInt();
      Palindromepass p1 =new Palindromepass();
      p1.palin(n);
      
    }
  }