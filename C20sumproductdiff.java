//write  a java program to find difference between sum of the digits and product of the digits of a positive integer
import java.util.Scanner;
class C20sumproductdiff
  {
    public static void main(String args[])
    {
      int num,digit=0,sum=0,product=1,difference;
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter n value:");
      num=sc.nextInt();
     
      while(num>0)
        {
         digit=num%10;
           
          sum=sum+digit;
          product=product*digit;
          num=num/10;
    }
      System.out.println(" sum of the given number:"+sum);
      System.out.println("product of the given number:"+product);
      //difference between sum and product of number
      difference=(product-sum);
      System.out.println("Difference of the given number: "+difference);
      
    }
      
      
  }