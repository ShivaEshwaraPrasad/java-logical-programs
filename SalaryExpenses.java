/*Jagadish- 90000  34000 --savings

Vamsi - 120000   78000  --savings

Subhash

WAP read 6 values  from user,

first 3 values are salaries of J,V,S and next 3 values are expences of J,V,S

salary=[] and expences=[]

public int maxSavings(int salaries[],int expences[]) {

}*/
class SalaryExpenses
  {
    public int savings(int sal[],int exp[])
    {
      int sav[]=new int[sal.length];
      int max=sav[0];
      for(int i=0;i<sal.length;i++)
        {
          sav[i]=sal[i]-exp[i];
          if(sav[i]>max)
          {
            max=sav[i];
          }
        }
      return max;
    }
    public static void main(String args[])
    {
      int sal[]={90000,120000,60000};
      int exp[] ={34000,78000,30000};
      SalaryExpenses obj=new SalaryExpenses();
      int a=obj.savings(sal,exp);
      System.out.println(a);
    }
  }