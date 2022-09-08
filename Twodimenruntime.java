//Two dimension for 3x2 matrix on runtime
import java.util.Scanner;
class Twodimenruntime
  {
    public static void main(String args [])
    {
      int r1,c1,i,j;
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter Row size:");
      r1=sc.nextInt();
      System.out.println("Enter Column size:");
      c1=sc.nextInt();
      int a[][]=new int [r1][c1];
      System.out.println("Enter element to Array:");
      for(i=0;i<r1;i++)
        {
          for(j=0;j<c1;j++)
            {
              a[i][j]=sc.nextInt();
            }
        }
      System.out.println("The elements in an Array is:\n");
      for(i=0;i<r1;i++)
        {
          for(j=0;j<c1;j++)
            {
              System.out.print("\t"+a[i][j]);
            }
          System.out.println();
        }
    }
  }
        
        
      
    
  