import java.util.Scanner;
class Whilefactorial2
  {
    public static void main(String args[])
    {
      int n,fact=1;
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter n value");
      n=sc.nextInt();
      
      while(n>=1)
        { 
        fact= fact*n;
         n--;
        }
      System.out.println("The factorial of given number:"+fact);   
    }
  }