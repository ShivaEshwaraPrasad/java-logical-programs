
class SpaceSquarepattern
  {
  public static void main(String args[])
    {
      int i,j, size=5;
      for(i=0;i<5;i++)
        {
          for(j=0;j<5;j++)
            {
              if(i==0||i==size-1)
              {
                System.out.print("*");
              }
              else
                if(j==0||j==size-1)
                {
                  System.out.print("*");
                }
               else 
                {
                  System.out.print(" ");
                }
           
            }
           System.out.println();
        }
        
            
        }
    }
  