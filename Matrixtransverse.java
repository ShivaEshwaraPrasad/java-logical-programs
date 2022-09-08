import java.util.Scanner;
class Matrixtransverse
  {
    public static void main(String args [])
    {
      int r1,c1,i,j;
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter  Matrix row size:");
      r1=sc.nextInt();
      System.out.println("Enter  Matrix column size:");
      c1=sc.nextInt();
     
      if(r1==c1)
      {
      int a[][]=new int [r1][c1];
        int b[][]=new int [r1][c1];
      System.out.println("Enter  Matrix to Array:");
      for(i=0;i<r1;i++)
        {
          for(j=0;j<c1;j++)
            {
              a[i][j]=sc.nextInt();
            }
        }
       
      for(i=0;i<r1;i++)
        {
          for(j=0;j<c1;j++)
            {
              b[i][j]=a[j][i];
            }
        }
      System.out.println("The elements in an  Matrix is:\n");
      for(i=0;i<r1;i++)
        {
          for(j=0;j<c1;j++)
            {
              System.out.print("\t"+a[i][j]);
            }
          System.out.println();
        }
      
        System.out.println("The elements in Transverse  Matrix is:");
      for(i=0;i<r1;i++)
        {
          for(j=0;j<c1;j++)
            {
              System.out.print("\t"+b[i][j]);
            }
          System.out.println();
        }
      }
      else
      System.out.println("The Transverse of two Matrices is not possible");
    }
  }