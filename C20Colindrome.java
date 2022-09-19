/*Check if a string is Colindrome String or Not?
A string is said to be colindrome if it has consecutive 3 alphabets followed by the reverse of these 3 alphabets and so on.

Input : cappaccappac
Output : String is colindrome

Input : mollomaappaa
Output : String is Colindrome*/
import java.util.Scanner;
class C20Colindrome
  {
    public static void main (String args[])
    {
      String st1,st2,st3,st4;
      int i;
      Scanner sc= new Scanner(System.in);
      System.out.println("Enter any string");
      st1=sc.next();
      st2="";
      st3="";
      st4="";
  
    for(i=0;i<st1.length();i++)
      {
        if(i<3)
        {
          st2=st2+st1.charAt(i);
        }
        else if (i>=3 && i<=5)
        {
         st3=st3+st1.charAt(i); 
        }
      }
      for(int j=st2.length();j>0;j--)
        {
         st4=st4+st2.charAt(j-1); 
        }
    if(st4.equals(st3))
    {
         System.out.println("String is colindrome");
           }
         else 
         {
           System.out.println("String is Not colindrome");
         }
    }
      
  }
  
  