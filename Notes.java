import java.util.Scanner;
class Notes
  {
  public static void main(String args[])
    {
    int amount,r2000=0,r500=0,r200=0,r100=0,r50=0,r20=0,r10=0,r5=0,r2=0,r1=0,count=0;
    Scanner sc= new Scanner(System.in);
      System.out.println("Enter amount value");
      amount=sc.nextInt();
      while(amount>=2000)
        {
          r2000=amount/2000;
          amount=amount%2000;
          System.out.println("total number of 2000 notes:"+r2000);
          break;
        }
      while(amount>=500)
        {
          r500=amount/500;
          amount=amount%500;
          System.out.println("total number of 500 notes:"+r500);
          break;
        }
      while(amount>=200)
        {
          r200=amount/200;
          amount=amount%200;
          System.out.println("total number of 200 notes:"+r200);
          break;
        }
       while(amount>=100)
        {
          r100=amount/100;
          amount=amount%100;
          System.out.println("total number of 100 notes:"+r100);
          break;
        }
       
       while(amount>=50)
        {
          r50=amount/50;
          amount=amount%50;
          System.out.println("total number of 50 notes:"+r50);
          break;
        }
       while(amount>=20)
        {
          r20=amount/20;
          amount=amount%20;
          System.out.println("total number of 20 notes:"+r20);
          break;
        }
       while(amount>=10)
        {
          r10=amount/10;
          amount=amount%10;
          System.out.println("total number of 10 notes:"+r10);
          break;
        }
       while(amount>=5)
        {
          r5=amount/5;
          amount=amount%5;
          System.out.println("total number of 5 notes:"+r5);
          break;
        }
       while(amount>=2)
        {
          r2=amount/2;
          amount=amount%2;
          System.out.println("total number of 2 notes:"+r2);
          break;
        }
       while(amount>=1)
        {
          r1=amount/1;
          amount=amount%1;
          
          System.out.println("total number of 1 notes:"+r1);
          
        }
      count=r2000+r500+r100+r50+r20+r10+r5+r2+r1;
    }
  }