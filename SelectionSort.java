import java.util.Scanner;
class SelectionSort
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      int i, j,n,t;
      System.out.println("Enter array size:");
      n=sc.nextInt();
      int a[]=new int[n];
      System.out.println("Enter element to Array:");
      for(i=0;i<n;i++)
        {
          a[i]=sc.nextInt();
        }
      System.out.println("Before sorting element is:");
      for(i=0;i<n;i++)
        {
          System.out.println("The a["+i+"] value is:"+a[i]);
        } 
      
      for(i=0;i<n-1;i++)
      {
        for(j=i+1;j<n;j++)
          {
            if(a[i]>a[j])
            {
            t=a[i];
            a[i]=a[j];
            a[j]=t;
            }
          }
      }
      System.out.println("After sorting element is");
      for(i=0;i<n;i++)
        {
      System.out.println("The a["+i+"] value is:"+a[i]);
        }
        
        }
    }