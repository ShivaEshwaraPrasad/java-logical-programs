//Write a JAVA program to count total number of even and odd elements in an array.
import java.util.Scanner;
class Arrayevenodd
  {
    public static void main(String args[])
    {
      int i,n,ec=0,oc=0;
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the array size");
      n=sc.nextInt();
      int a[]=new int[n];
      System.out.println("enter the array elements :");
      for(i=0;i<n;i++)
        {
          a[i]=sc.nextInt();
        }
      System.out.println("the elements of array is :");
      for(i=0;i<n;i++)
        {
          System.out.println("\t" +a[i]);
        }
      for(i=0;i<n;i++)
        {
          if(a[i]%2==0)
          {
            ec++;
          }
          else 
          {
            oc++;
          }
          
        }
      System.out.println("the number of even elements are "+ec);
       System.out.println("the number of odd elements are "+oc);

    }
  }