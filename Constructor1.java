class Condemo
  {
    int a,b;
   Condemo()
    {
       a=10;
       b=20;
      System.out.println("The A value is:"+a);
      System.out.println("The B value is:"+b);
      System.out.println("The Addition value is:"+(a+b));
    }
  }
class Constructor1
  {
     public static void main(String args[])
     {
       Condemo c1=new Condemo();
     }
  }