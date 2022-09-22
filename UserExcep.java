/*You will be given two integers x and y as input, you have to compute x/y. If x and y are
not 32 bit signed integers or if y is zero, exception will occur and you have to report it.
Read sample Input/Output to know what to report in case of exceptions.
Sample Input 1:
10
3
Sample Output 1:
3
Sample Input 2:
10
Hello
Sample Output 2:
print InputMismatchException
Sample Input 3:
10
0
Sample Output 3:
java.lang.ArithmeticException: / by zero
Sample Input 4:
23.323
0
Sample Output 4:
print InputMismatchException*/ 
import java.util.*;
class UserExcep
  {
    public static void main(String args[])
    {
        try
          {
            int x,y,a;
             Scanner sc =new Scanner(System.in);
            System.out.println("enter x,y values");
            x=sc.nextInt();
           y=sc.nextInt();
            a=x/y;
            System.out.println("Result is"+a);
          }
        catch(ArithmeticException ae)
          {
            System.out.println("An Exception Occurs"+ae);
          }
          
    
      catch(InputMismatchException ai)
        {
          System.out.println("InputMismatchException "+ai);
        }
    }
  }
  