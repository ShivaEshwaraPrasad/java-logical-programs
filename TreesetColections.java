 import java.util.*;
class TreesetColections
  {
    public static void main(String args[])
    {
      TreeSet<String> ts=new TreeSet<String>();
      ts.add("Raj");
      ts.add("Zebra");
      ts.add("Shiva");
      ts.add("Arun");
      Iterator<String> itr=ts.iterator();
      while(itr.hasNext())
        {
          System.out.println(itr.next());
        }
    }
  }