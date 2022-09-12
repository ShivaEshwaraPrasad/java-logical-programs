// find length of string using foreach method
class Stringlengthforeach
  {
    public static void main(String args[])
    {
      String st1 ="WELCOME";
      int c=0;
      for(char c1:st1.toCharArray())
      {
        c++;
      }
  System.out.println("The Length of the Given String is"+c);
    }
  }