class Stringbuferreverse
{
  public static void main(String args[]) 
  {
    StringBuffer st1 =new StringBuffer();
    StringBuffer st2 =new StringBuffer("WELCOME");
   System.out.println("The Default Capacity is:"+st1.capacity());
    
    System.out.println("The Capacity of String2 is:"+st2.capacity());

System.out.println("The Reverse of the Given String is:"+st2.reverse());

  
  }
}