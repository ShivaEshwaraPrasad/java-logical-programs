import java.util.Scanner;
class Dowhilenatural
  {
    public static void main(String args[])
    {
      int n,i;
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter n value");
      n=sc.nextInt();
       i=1;
      do
      {
    
        System.out.println(+i ); 
      
         i++;
      }
        while(i<=n);
        
    }
  }