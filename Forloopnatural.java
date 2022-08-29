import java.util.Scanner;
class Forloopnatural
  {
    public static void main(String args[])
    {
      int i,n;
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter n value");
      n=sc.nextInt();
      
      for(i=1;i<=n;i++)
        {
        System.out.println(+i);  
        }
    }
  }