import java.util.Scanner;
class Dowhilefact
  {
    public static void main(String args[])
    {
      int n,i,fact=1;
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter n value");
      n=sc.nextInt();
      i=1;
      do
        {
        fact=fact*i;
      
         i++;
      
      
        System.out.println("The factorial of given number" +fact);
        }
    
        while(i<=n);
      
    }
  }


      
      
    
  