class RightTri
  {
  public static void main(String args[])
    {
      int i,j, k,size=5;
      for(i=0;i<5;i++)
        {
          for(j=1;j<5-i;j++)
            {
              System.out.print(" ");
            }
          for(k=0;k<=i;k++)
            {
              System.out.print("*");
            }
          System.out.println();
        }
    }
  }
          