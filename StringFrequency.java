//program to find frequency of each character in a string
import java.util.*;
class StringFrequency
  {
    public static void main(String args[])
    {
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
          System.out.println(st1.charAt(i)+"\t"+count);
        }
    }
  }