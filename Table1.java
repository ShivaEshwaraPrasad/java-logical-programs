import java.util.Scanner;
class Table1
  {
    public static void main(String args[])
    {
      int i,n;
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter n value");
      n=sc.nextInt();
      
      for(i=1;i<=10;i++)
        {
        System.out.println(n+ "X" +i+"="+i*n);  
        }
    }
  }