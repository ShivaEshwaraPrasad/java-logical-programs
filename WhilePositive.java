import java.util.Scanner;
class WhilePositive
  {
    public static void main(String args[])
    {
      int num,sum=0,digit=0;
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter number value");
      num=sc.nextInt();
      
      
      while(num>0)
        {
          digit=num%10;
          sum=sum+digit;
          num=num/10;
        }
      System.out.println("Sum of digits of positive integer:" +sum);
    }
  }