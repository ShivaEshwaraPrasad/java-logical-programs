import java.util.*;

  class StringTokenizerprogram
    {
      public static void main(String args[])
      {
        String st1="Hai Hello Welcome to Bitlabs";
        StringTokenizer t=new StringTokenizer(st1);
        System.out.println("The count No of Tokens in given string is:"+t.countTokens());
        System.out.println("The tokens are:");
        while(t.hasMoreTokens())
          {
            System.out.println(t.nextToken());
          }
      }
    }
