import java.io.*;
import java.lang.*;
public class FileRead
{
public static void main(String args[])
  {
             try
     {
      File f=new File("Mainfile.txt");
      FileInputStream fos=new FileInputStream(f);
      int ch;
      while( (ch=fos.read()) !=-1)
       {
        System.out.print((char)ch);
                     Thread.sleep(100);
                     }    
     }
              catch(IOException ie)
      {
       System.out.println(ie.getMessage());
     }  
              catch(InterruptedException iee)
      {
       System.out.println(iee.getMessage());
     }  
   }      
  }