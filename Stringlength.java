//without using length method
class Stringlength
  {
    public static void main(String args[])
    {
      String st1 ="WELCOME"+'\0';
      int c=0;
      for(int i=0;st1.charAt(i)!='\0';i++)
        {
          c++;
        }
      System.out.println("The length of the given string:"+c);
    }
  }