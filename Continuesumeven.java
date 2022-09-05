import java.util.Scanner;
class Continuesumeven
{
public static void main(String args[])
{
int n,i,sum=0,a=-2;
Scanner sc =new Scanner(System.in);
System.out.println("Enter n value");
n=sc.nextInt();
for(i=1;i<=n;i++)
{
  a=a+2;
  if(a%3==0)
    sum=sum+a;
}
System.out.println("Sum of even number divisible by 3:"+sum);
}
}


