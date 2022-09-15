import java.util.Scanner;
class Primepass
  {
    int i,count;
    void prim(int n)
    {
     
      count=0;
      for(i=1;i<=n;i++)
        {
          if(n%i==0)
          {
            count++;
          }
        }
      if(count==2)
        System.out.println("It is a prime number:");
      else 
        System.out.println("It is not a prime number:");
        
    }
  }

class OopsPrime
  {
    public static void main(String args[])
    {
      int n;
      Scanner sc= new Scanner(System.in);
      System.out.println("Enter n value:");
      n=sc.nextInt();
      Primepass p =new Primepass();
      p.prim(n);
    }
  }