/*Write a class Worker and derive classes DailyWorker and SalariedWorker from it. Every worker has a name and a salary rate. Write method ComPay (int hours) to compute the week pay of every worker. A Daily Worker is paid on the basis of the number of days he/she works. The Salaried Worker gets paid the wage for 40 hours a week no matter what the actual hours are. Test this program to calculate the pay of workers. You are expected to use the concept of polymorphism to write this program.*/
class Worker
  {
    String name;
    
    Worker(String n)
    {
      name=n;
    }
    
    void disp()
    {
      System.out.println("Employ name:"+name);
       
      
    }
  }
class dailyworker extends Worker
  {
   int days;
    dailyworker(String n, int d)
    {
      
      super(n);
      days =d;
    }
    void company(int hrs)
    {
    System.out.println("dailyworkerSalary:"+days*hrs);
    }
  }
class Salariedworker extends Worker
  {
    int days;
    Salariedworker( String n,int d)
    {
      super(n);
      days=d;
    }
    int hour =40;
    void company()
    {
      System.out.println(" Salariedworker Salary:"+days*hour);
    }
  }
class C20polymorphism
  {
  public static void main(String args[])
    {
    dailyworker dw=new dailyworker("Ram",35);
    Salariedworker sw=new Salariedworker("Raj",85);
      dw.company(40);
      dw.disp();
      sw.company();
      sw.disp();
      
    }
  }
  
