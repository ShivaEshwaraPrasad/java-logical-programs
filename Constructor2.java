//Default constructor
class Employee
  {
    int eno;
    String ename;
    double esal;
    Employee()
    {
      eno=101;
      ename="shiva";
      esal=455.45;
      System.out.println("The given employee number is:"+eno);
      System.out.println("The given employee name is:"+ename);
      System.out.println("The given employee salary is:"+esal);
    }
  }
class Constructor2
  {
    public static void main(String args[])
    {
    Employee e1=new Employee();
  }
  }