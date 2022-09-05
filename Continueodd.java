import java.util.Scanner;
class Continueodd
{
public static void main(String args[])
{
int n,i;
Scanner sc =new Scanner(System.in);
System.out.println("Enter n value");
n=sc.nextInt();
for(i=1;i<=n;i++)
{
if(i%2==1)
{

continue;

}
System.out.println(i);
}
}
}