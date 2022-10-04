import java.io.*;
class Bufferinteger
{
  public static void main(String args[])throws IOException 
  {
     int n;
    InputStreamReader in=new InputStreamReader(System.in);
    BufferedReader br=new BufferedReader(in);
// BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    
    System.out.println("Enter Any Character:");
    n=Integer.parseInt(br.readLine());

    System.out.println("The Given Integer is :"+n); 
  }
}