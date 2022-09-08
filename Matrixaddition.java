//Addition Of two matrices
import java.util.Scanner;
class Matrixaddition
  {
    public static void main(String args [])
    {
      int r1,c1,r2,c2,i,j;
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter First Matrix:");
      r1=sc.nextInt();
      c1=sc.nextInt();
      System.out.println("Enter Second Matrix:");
      r2=sc.nextInt();
      c2=sc.nextInt();
      if(r1==r2&&c1==c2)
      {
      int a[][]=new int [r1][c1];
        int b[][]=new int [r2][r2];
        int c[][]=new int [r1][c1];
      System.out.println("Enter First Matrix to Array:");
      for(i=0;i<r1;i++)
        {
          for(j=0;j<c1;j++)
            {
              a[i][j]=sc.nextInt();
            }
        }
         System.out.println("Enter second Matrix to Array:");
      for(i=0;i<r2;i++)
        {
          for(j=0;j<c2;j++)
            {
              b[i][j]=sc.nextInt();
            }
        }
      for(i=0;i<r1;i++)
        {
          for(j=0;j<c1;j++)
            {
              c[i][j]=a[i][j]+b[i][j];
            }
        }
      System.out.println("The elements in an First Matrix is:\n");
      for(i=0;i<r1;i++)
        {
          for(j=0;j<c1;j++)
            {
              System.out.print("\t"+a[i][j]);
            }
          System.out.println();
        }
        System.out.println("The elements in an second Matrix is:\n");
        for(i=0;i<r2;i++)
        {
          for(j=0;j<c2;j++)
            {
              System.out.print("\t"+b[i][j]);
            }
          System.out.println();
        }
        System.out.println("The Addition of two Matrices is:");
      for(i=0;i<r1;i++)
        {
          for(j=0;j<c1;j++)
            {
              System.out.print("\t"+c[i][j]);
            }
          System.out.println();
        }
      }
      else
      System.out.println("The Addition of two Matrices is not possible");
    }
  }
  
        