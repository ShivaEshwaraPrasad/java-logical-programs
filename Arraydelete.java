//Write a JAVA program to delete an element from an array at specified position.
import java.util.Scanner;
class Arraydelete
{
  public static void main(String args[])
  {
    int i,index,n;
 Scanner sc=new Scanner(System.in);
  System.out.println("enter array size ");
    n=sc.nextInt();
    int a[]=new int[n];
    
    System.out.println("Enter elements to array:");
    for(i=0;i<n;i++)
      {
        a[i]=sc.nextInt();
      }
    System.out.println("The elements in an array:");
    for(i=0;i<n;i++)
      {
        System.out.print("\t"+a[i]);
      }
    System.out.println("\n Enter the index at which element is removed from array:");
    
    
        index=sc.nextInt();
        System.out.println("The elements in an array after deleting:\n");
    
    for(i=0;i<n;i++)
      {
        if(i==index)
        {
          continue;

        }
        
    System.out.print(+a[i]);
  }
}
}
        
      