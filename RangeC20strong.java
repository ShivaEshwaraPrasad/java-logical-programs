import java.util.Scanner;
class RangeC20strong
  {
    public static void main(String args[])
    {
      int num1,num2,i,j,digit,mul,sum=0;
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the first number");
      num1=sc.nextInt();
      System.out.println("Enter the second number");
      num2=sc.nextInt();
      System.out.println("strong number "+num1+"and"+num2+"are:");
      for( i=num1;i<=num2;i++)
       {
          
          int num3=i;
          sum=0;
          digit=0;
          
     while(num3>0)
        {
          digit=num3%10;
          mul=1;
        for( j=1;j<=digit;j++)
            {
              mul=mul*j;
            }
          sum=sum+mul;
        num3=num3/10;
        }
         if(sum==i)
          {
            System.out.println(i); 
          }
         
        }
    }
  }
    
       
          
   
        
      
    
    
  
  
  