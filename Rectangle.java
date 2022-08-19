import java.util.Scanner;
class Rectangle
  {
    public static void main(String args[])
    {
      float l,b,area,circumference;
       Scanner sc = new Scanner(System.in);
      System.out.println("Enter the value of l and b:");
      l= sc.nextFloat();
      b= sc.nextFloat();
      area= l * b;
      circumference= 2*(l+b);
      System.out.println(" the area of rectangle:"+area);
      System.out.println(" the circumference of rectangle:"+circumference);
      
      
        
     
    }
  }
      
      
;
      
    