class Condemo1
  {
    int a,b;
   Condemo1(int x,int y)
    {
       a=x;
       b=y;
    }
    void display()
    {
      System.out.println("The A value is:"+a);
      System.out.println("The B value is:"+b);
      System.out.println("The Addition value is:"+(a+b));
    }
  }
class Parametrizedconstructor
  {
     public static void main(String args[])
     {
       int m=23,n=54;
       Condemo1 c1=new Condemo1(m,n);
       c1.display();   
     }
  }