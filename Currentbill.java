import java.util.Scanner;
class Currentbill
  {
    public static void main (String args[])
    {
      int cno;
      String cname;
      float pmr,lmr,tu,bill,cost=3.80F;
      Scanner sc =new Scanner (System.in);
      System.out.println("enter the consumer number:");
      cno=sc.nextInt();
      System.out.println("enter the consumer name:");
      cname=sc.next();
      System.out.println("enter the present month reading:");
      pmr=sc.nextFloat();
      System.out.println("enter the last month reading:");
      lmr=sc.nextFloat();
      tu=pmr-lmr;
      bill=tu*3.80F;
      System.out.println("print the consumer number:"+cno);
      System.out.println("print the consumer name:"+cname);
      System.out.println("print the consumer present month reading:"+pmr);
      System.out.println("print the consumer last month reading:"+lmr);
      System.out.println("print the total units:"+tu);
      System.out.println("print the current bill:"+bill);
    }
  }
      
      
      
      
      
      
      
      
      