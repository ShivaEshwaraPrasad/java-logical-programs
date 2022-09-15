import java.util.Scanner;
 class Factorial
  {
    int i,n,fact=1;
    Scanner sc=new Scanner(System.in);

   
    void fact()
    {
       System.out.println("Enter n value:");
       n=sc.nextInt();
      for(i=1;i<=n;i++)
      fact=fact*i;
    System.out.println("The factorial of given number:"+fact);
    }
}
    class Oops
      {
        public static void main(String args[])
        {
          Factorial f1=new Factorial();
        f1.fact();
        }
      }
  