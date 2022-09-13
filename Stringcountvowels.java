import java.util.*;
class Stringcountvowels
  {
    public static void main(String args[])
    {
      String st1="hello";
      int v=0;
      int c=0;
    

      for(int i=0;i<st1.length();i++)
        {
          char ch=st1.charAt(i);

          if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
          {
            v++;
          }
          else
          {
            c++;
          }
        }
      System.out.println("The number of vowels in the string are "+v);
      System.out.println("The number of consonants in the string are "+c);
    }
  }