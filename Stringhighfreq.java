//program to find Highest frequency of each character in a string
import java.util.*;
class Stringhighfreq
  {
    public static void main(String args[])
    {
      int max=0,charindex=0;
    
      Scanner sc =new Scanner(System.in);
      System.out.println("Enter any string:");
      String st1=sc.nextLine();
      int n=st1.length();
      boolean visited[]=new boolean[n];
      for(int m=0;m<n;m++)
        visited[m]=false;
      System.out.println("Element count");
      for(int i=0;i<n;i++)
        {
          if(visited[i]==true)
            continue;
          int count=1;
          for(int j=+1;j<n;j++)
            {
              if(st1.charAt(i)==st1.charAt(j))
              {
                visited[j]=true;
                count++;
              }
            }
          if(max<count)
       max=count;
          charindex=i;
        }
System.out.println("Highest frequency  character is:"+st1.charAt(charindex)+" and occurs "+max+"times");
      
    }
  }