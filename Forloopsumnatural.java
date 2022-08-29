import java.util.Scanner;
class Forloopsumnatural
  {
    public static void main(String args[])
    {
      int i,n,sum=0;
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter n value");
      n=sc.nextInt();
      
      for(i=1;i<=n;i++)
        {
          sum=sum+i;
        }
      System.out.println("The sum of natural numbers:"+sum);
        }
  }