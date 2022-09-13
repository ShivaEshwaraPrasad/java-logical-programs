//program to find first occurence of character in string
import java.util.*;
class Stringfirstocc
  {
    public static void main(String arg[])
    {
      
      char ch;
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter  String to find first occurence of string:");
      String st1=sc.nextLine();
       System.out.println("Enter the character:");
      ch=sc.next().charAt(0);
      int index=st1.indexOf(ch);
      System.out.println("The first occurence of a character"+ch+" in a string "+st1+"and index is"+index);
    }
  }
      