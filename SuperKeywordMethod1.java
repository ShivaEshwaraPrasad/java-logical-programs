class Base
  {
    int i=10;
  }
class derive extends Base
  {
    int i=20;
    void disp()
    {
      System.out.println("The i value in base classs is:"+super.i);
       System.out.println("The i value in base classs is:"+i);
    }
  }
  class SuperKeywordMethod1
    {
      public static void main(String args[])
      {
        derive d1=new derive();
        d1.disp();
      }
      
    }