import java.io.*;
import java.lang.*;
public class FileWrite
{
public static void main(String args[])
  {
                try
     {
      File f=new File("hello.txt");
            FileOutputStream fos=new FileOutputStream(f);
      byte b[]={'k','a','r','u','n'};
     fos.write(b);
     System.out.println("file is Written");
     }
             catch(IOException ie)
      {
       System.out.println(ie.getMessage());
      }  
   }      
  }