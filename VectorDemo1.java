import java.util.*;
public class VectorDemo1
{
    public static void main(String[] args) 
    {
        Vector<Object> list=new Vector<Object>();
        
        list.add(new Date());
        list.add(new Integer(1000));
        list.add("bitLabs");
        list.add(new Double(43040.39));
        list.add("Shiva");
        list.add(new Double(43040.39));
        
        for(int i=0;i<list.size();i++)
        {
        System.out.println(list.elementAt(i));
        }
                   
    }
}