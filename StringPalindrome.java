class StringPalindrome
  {
    public static void main(String args[])
    {
      String st1="Mam";
      String st2="";
    for(int i=st1.length();i>0;i--)
      {
        st2=st2+st1.charAt(i-1);
      }
     
         if(st1.equalsIgnoreCase(st2))
         {
         System.out.println("String is palindrome");
       }
         else 
         {
           System.out.println("String is Not palindrome");
         }
    }
    
  }