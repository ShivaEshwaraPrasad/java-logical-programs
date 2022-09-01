import java.util.Scanner;
class Fabinocci
  {
    public static void main(String args[])
    {
      int n,f1=0,f2=1,f3=0;
      Scanner sc=new Scanner (System.in);
      System.out.println("Enter n value:");
      n=sc.nextInt();
       
      while(n>0)
         
        
        {
      f3=f1+f3;
      f1=f2;
      f2=f3;
      n--;
           System.out.print("\t"+f3);
        }
     
    }
  }
  