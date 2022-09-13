/*WAP to count Total number of Alphabets,digits and special characters in a String?
            count the total alphabets  -------> count of Capitals and Smalls

   65  to 90  --------> A -Z
    97-122 --------->  a-z

   48-57    --------> 0-9

   remaining special character*/
import java.util.*;
class StringAlphabets
  {
    public static void main(String args[])
    {
      String st1="Hello@256$";
      int i,c=0,s=0,d=0,sc=0;
    
    
      for(i=0;i<st1.length();i++)
        {
         char ch=st1.charAt(i);
        
        if(ch>=65&&ch<=90)
          {
            c++;
          }
          else if(ch>=97&&ch<=127)
          {
            s++;
          }
          else if(ch>=48&&ch<=57)
          {
            d++;
          }
          else
          {
            sc++;
          }
        }
    
      System.out.println("The number of capital alphabets:"+c);
      System.out.println("The number of smallalphabets:"+s);
      System.out.println("The number of digits:"+d);
      System.out.println("The number of special characters:"+sc);
      
      
        }
    }
  