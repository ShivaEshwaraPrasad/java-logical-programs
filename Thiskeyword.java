class Condemo1
  {
    int a,b;
   Condemo1(int a,int b) // Parameterized Constructor
    {
       this.a=a;
       this.b=b;
    }
    void display()
    {
      System.out.println("The A value is:"+a);
      System.out.println("The B value is:"+b);
      System.out.println("The Addition value is:"+(a+b));
    }
  }
class Thiskeyword
  {
     public static void main(String args[])
     {
       int m=23,n=54;
       Condemo1 c1=new Condemo1(m,n);
       c1.display();     
     }
  }