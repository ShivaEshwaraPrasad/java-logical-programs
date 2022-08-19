import java.util.Scanner;
class Swappingwithouttemp
  {
    public static void main(String args[])
    {
      int a,b;
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the a value:");
      a=sc.nextInt();
      System.out.println("Enter the b value:");
      b=sc.nextInt();
      System.out.println("Before swapping:");
      System.out.println("a=:"+a);
      System.out.println("b=:"+b);
      a=a+b;
      b=a-b;
      a=a-b;
      System.out.println("after swapping:");
      System.out.println("a=:"+a);
      System.out.println("b=:"+b);
    }
  }