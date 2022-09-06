import java.util.Scanner;
class Array3
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      int i, n;
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
          System.out.print("\t"+a[i]);
        }
    }
  }