import java.util.Scanner;
class Calculator
  {
    public static void main (String args[])
    {
      
      int a,b,c,choice;
      Scanner sc =new Scanner(System.in);
      System.out.println("[1].Addition");
      System.out.println("[2].Subtraction");
      System.out.println("[3].Multiplication");
      System.out.println("[4].Division");
      System.out.println("[5].Remainder");
      System.out.println("enter your choice:");
      choice=sc.nextInt();
      System.out.println("enter a value:");
      a=sc.nextInt();
      System.out.println("enter b value:");
      b=sc.nextInt();
      switch(choice)
        {
          case 1:
            c=a+b;
            System.out.println("Perform Addition:"+c);
            break;
            case 2:
            c=a-b;
            System.out.println("Perform Subtraction:"+c);
            break;
            case 3:
            c=a*b;
            System.out.println("Perform MUltiplication:"+c);
            break;
            case 4:
            c=a/b;
            System.out.println("Perform Division:"+c);
            break;
            case 5:
            c=a%b;
            System.out.println("Perform Remainder:"+c);
            break;
          default:
             System.out.println("Wrong choice");
        }
    }
  }
            
            
            
            
        
      
      
      
        
      