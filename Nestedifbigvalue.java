import java.util.Scanner;
class Nestedifbigvalue
  {
    public static void main (String args[])
    {
      int a,b,c;
      Scanner sc=new Scanner(System.in);
      System.out.println("enter a value:");
      a=sc.nextInt();
      System.out.println("enter b value:");
      b=sc.nextInt();
      System.out.println("enter c value:");
      c=sc.nextInt();
      if(a>b)
      {
        if(a>c)
          System.out.println("print a is big:");
        else
          System.out.println("print c is big:");
         }
      else
      {
      if(b>c)
        System.out.println("print b is big:");
        else
        System.out.println("print c is big:");
      }
    }
  }
      