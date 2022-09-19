//Constructor over loading.
class Employee
  {
    int eno;
    String ename;
    double esal;
    Employee()
    {
      System.out.println("Its non parameterized constructor:");
    }
    Employee(int n)
    {
      System.out.println("the employee number:"+n);
    }
    Employee(int x,String y,double z )
    {
      eno=x;
      ename=y;
      esal=z;
    }
    void display()
    {
      System.out.println("The given employee number is:"+eno);
      System.out.println("The given employee name is:"+ename);
      System.out.println("The given employee salary is:"+esal);
    }
  }
class Constructor4
  {
    public static void main(String args[])
    {
      int a=101;
      String b="shiva";
      double c=450.54;
    Employee e1=new Employee(a,b,c);
      e1.display();
      Employee e2=new Employee(102);
      Employee e3=new Employee();
  }
  }