import java.util.Scanner;
class Array6linearsearch
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      int i, n,search;
      System.out.println("Enter array size:");
      n=sc.nextInt();
      int a[]=new int[n];
      System.out.println("Enter element to Array:");
      for(i=0;i<n;i++)
        {
          a[i]=sc.nextInt();
        }
      System.out.println("The element in an array is:");
      for(i=0;i<n;i++)
        {
          System.out.println("The a["+i+"] value is:"+a[i]);
        }  
      System.out.println("Enter the element to search");
      search=sc.nextInt();
      for(i=0;i<n;i++)
        {
          if(search==a[i])
          {
            System.out.println("Element is found");
          break;
          }
        }
      if(i==n)
        System.out.println("Element is not found");
          
        }
    }
  