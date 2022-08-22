import java.util.Scanner;
class Simpleintrest
  {
    public static void main (String args[])
    {
      float p,r,t,si,ta;
      Scanner sc = new Scanner(System.in);
      System.out.println("enter the value of p:");
      p=sc.nextFloat();
      System.out.println("enter the value of r:");
      r=sc.nextFloat();
      System.out.println("enter the value of t:");
      t=sc.nextFloat();
      si=(p*t*r)/100;
      ta=p+si;
      System.out.println("print the si:"+si);
      System.out.println("print the ta:"+ta);
    }
  }
    