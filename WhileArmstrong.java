import java.util.Scanner;
class WhileArmstrong
  {
    public static void main(String args[])
    {
      int num,number,sum=0,digit=0;
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter number value");
      number=sc.nextInt();
      num=number;
      
      
      while(num>0)
        {
          digit=num%10;
          sum=sum+digit*digit*digit;
          num=num/10;
        }
      if(sum==number)
      System.out.println("Armstrong number");
      else
         System.out.println("not Armstrong number");
        


    }
  }
        
      
      
    
  