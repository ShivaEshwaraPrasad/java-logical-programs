import java.util.*;
class Factorial
  {
    int n;
    Scanner sc=new Scanner(System.in);
    void read()
    {
    System.out.println("Enter n value:");
      n=sc.nextInt();
    }
  }
   
interface Intrdemo
  {
    public void fact();
    public void disp();
  }
class Interface extends Factorial implements Intrdemo
  {
    int i,f=1;
    public void fact()
    {
    for(i=1;i<=n;i++)
      {
        f=f*i;
      }
    }
      public void disp()
        {
    System.out.println("The given factorial:"+f);
    }
      
  }
class FactInterface
  {
    public static void main(String args[])
    {
      Interface i=new Interface();
      i.read();
      i.fact();
      i.disp();
    }
  }
  