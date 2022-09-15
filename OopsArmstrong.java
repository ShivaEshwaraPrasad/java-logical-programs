import java.util.Scanner;
class Strong
  {
    int sum=0,digit=0;
    int arm(int n)
    {
      while(n>0)
        {
          digit=n%10;
          sum=sum+digit*digit*digit;
          n=n/10;
        }
        
        return sum;
    }
  }
    class OopsArmstrong
      {
        public static void main(String args[])
        {
          int m,z;
          Scanner sc=new Scanner(System.in);
          System.out.println("Enter m value:");
          m=sc.nextInt();
          Strong s=new Strong();
         z= s.arm(m);
        if(z==m)
        {
          System.out.println("It is Armstrong number:");
        }
          else 
        {
          System.out.println("It is not Armstrong number:");
        }
        }
      }
      
      
    
  