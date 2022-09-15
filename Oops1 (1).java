import java.util.Scanner;
 class Factorialpass
  {
    int i,fact=1;
    

   
    void fact(int n)
    {
       
      for(i=1;i<=n;i++)
      fact=fact*i;
    System.out.println("The factorial of given number:"+fact);
    }
}
    class Oops1
      {
        public static void main(String args[])
        {
          int n;
          Scanner sc=new Scanner(System.in);
          System.out.println("Enter n value:");
          n=sc.nextInt();
          Factorialpass f1=new Factorialpass();
         f1.fact(n);
        }
      }