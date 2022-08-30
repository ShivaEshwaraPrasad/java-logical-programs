//print first n natural numbers
import java.util.Scanner;
class Whilenatural
  {
    public static void main(String args[])
    {
      int i,n;
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter n value");
      n=sc.nextInt();
      i =1;
      while(i<=n)
       {
        System.out.println(+i); 
         i++;
        }
    }
  }