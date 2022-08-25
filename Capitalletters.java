import java.util.Scanner;
class Capitalletters
  {
    public static void main (String args[])
    {
      char ch;
      Scanner sc =new Scanner(System.in);
      System.out.println("Enter any character:");
      ch=sc.next().charAt(0);
      if(ch>='a'&&ch<='z'||ch>='A'&&ch<='Z')
      {
        System.out.println("Alphabet");
      if(ch>='a'&&ch<='z')
      {
        System.out.println("Small letter");
      }
      if(ch>='A'&&ch<='Z')
      {
        System.out.println("Capital letter");
      }
        
      }
      else if(ch>='0'&&ch<='9')
      {
        System.out.println("its a digit");
      }
      else
      {
        System.out.println("Special characters");
      }
    }
  }
      
        
        
        