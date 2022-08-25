import java.util.Scanner;
class Currentladder
  {
    public static void main (String args[])
    {
      int cno;
      String cname;
      double pmr,lmr,tu,bill=0;
      Scanner sc =new Scanner (System.in);
      System.out.println("enter the consumer number:");
      cno=sc.nextInt();
      System.out.println("enter the consumer name:");
      cname=sc.next();
      System.out.println("enter the present month reading:");
      pmr=sc.nextDouble();
      System.out.println("enter the last month reading:");
      lmr=sc.nextDouble();
      tu=pmr-lmr;
      
      System.out.println("print the consumer number:"+cno);
      System.out.println("print the consumer name:"+cname);
      System.out.println("print the consumer present month reading:"+pmr);
      System.out.println("print the consumer last month reading:"+lmr);
      System.out.println("print the total units:"+tu);
      
    
      if(tu<=50)
      {
        bill=tu*3.40;
        
    
      }
      else if (tu<=100)
      { 
        bill= 50*3.40 +(tu-50)*4.56;
        
      }
      else if (tu<=200)
      {
        bill= 50*3.40 +50*4.56+(tu-100)*5.43;
        
      }
     
      else if (tu<=300)
      {
        bill= 50*3.40 +50*4.56+100*5.43+ (tu-200)*6.54;
         
       
       }
      else 
      {
        bill= 50*3.40 +50*4.56+100*5.43 +200*6.54+(tu-300)*7.54;
         
      }
     
         System.out.println("the given bill:"+bill);
      
    }
     }
  
  