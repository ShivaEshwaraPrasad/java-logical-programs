import java.util.Scanner;
class Ifvowel
  {
    public static void main (String args[])
    {
      char ch;
      Scanner sc =new Scanner(System.in);
      System.out.println("Enter any character:");
      ch=sc.next().charAt(0);
      if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
      {
        System.out.println("its a vowel:");
      }
      else
      {
        System.out.println("its a consonant:");
      }
    }
  }