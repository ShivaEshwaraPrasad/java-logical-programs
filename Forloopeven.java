import java.util.Scanner;
class Forloopeven
  {
    public static void main(String args[])
    {
      int i,n;
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter n value");
      n=sc.nextInt();
      
      for(i=0;i<=n;i++)
        {
           if(i%2==0)
     System.out.println(+i);
        }
    }
  }