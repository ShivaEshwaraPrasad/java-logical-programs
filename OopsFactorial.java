import java.util.Scanner;
 class Factorialpass
  {
    int i,f=1;
   
    int fact(int n)
    { 
      for(i=1;i<=n;i++)
      f=f*i;
        return f;
    }
}
    class OopsFactorial
      {
        public static void main(String args[])
        {
          int m,z;
          Scanner sc=new Scanner(System.in);
          System.out.println("Enter m value:");
          m=sc.nextInt();
      
          Factorialpass f1=new Factorialpass();
           z= f1.fact(m);
          System.out.println("The factorial of given number:"+z);
        }
      }