/* JFM1T6_Assignment2:
   Write a method that takes 2 numbers as arguments/parameters and returns the value of num2 to the power of num1 back to the main method.
   Prompt the user for the base and power values to be input from the terminal.

   Sample input:
   num1 = 3
   num2 = 2
    
   Expected Output:
   result = 9
   
*/
import java.util.*;
class Square
  {
    int num1,num2,r=1;
    int pow(int n,int p)
    {
    num1=n;
    num2=p;
      if(n>=0&&p==0)
      {
        System.out.println("0");
      }
      else if(n==0&&p>=1)
        System.out.println("1");
      else
      {
        for(int i=1;i<=p;i++)
          {
            r=r*n;
          }
      }
      return r;
    }
  }
   
      
public class Power {

//main method
public static void main(String args[])
  {
    int a,b,c;

//create scanner class object
Scanner sc =new Scanner(System.in);
//take input from user
  System.out.println(" num1 =");
    a=sc.nextInt();
    System.out.println("num2 =");
    b=sc.nextInt();
    Square c1=new Square();
    c=c1.pow(a,b);
    
     System.out.println("result="+c);
  }
}

//check if (n>=0&&p==0) if true then it prints 1 else if check (n==0&&p>=1) if true then print zero else multiply r*n

//print result

