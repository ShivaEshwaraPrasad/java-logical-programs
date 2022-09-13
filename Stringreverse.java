// print a string in reverse without using reverse method
import java.util.*;
class Stringreverse
  {
    public static void main(String args[])
    {
  
      String st1="Welcome";
      System.out.println("The reverse of the given String:");

      for(int i=st1.length();i>0;i--)
        {
      System.out.println(st1.charAt(i-1));
    }
  }
  }