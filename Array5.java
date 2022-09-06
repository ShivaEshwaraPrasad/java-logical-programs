import java.util.Scanner;
class Array5
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      int i, n,max,min;
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
      max=min=a[0];
      for(i=0;i<n;i++)
        {
          if(max<a[i])
            max=a[i];
          if(min>a[i])
            min=a[i];
        }
          System.out.println("The maximum value of array is:"+max);
       System.out.println("The minimum value of array is:"+min);
           
    }
  }