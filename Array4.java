import java.util.Scanner;
class Array4
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      int i, n,sum=0;
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
      //sum of array
      for(i=0;i<n;i++)
        {
      sum=sum+a[i];
        }
      System.out.println("The sum of array elements is:"+sum);
    }
  }