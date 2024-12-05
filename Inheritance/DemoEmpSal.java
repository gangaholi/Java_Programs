abstract class Employee
{
  String name; int EmpId;
  abstract double cal_sal();
}
class SoftwareEng extends Employee
{
    double basic, da;
    SoftwareEng(String nam, int id, double b, double d)
    {
       name=nam; EmpId=id; basic=b; da=d;
    }
    double cal_sal()
    {    
        return basic+basic*da/100;
    }
}
class HardwareEng extends Employee
{
    double basic, ta;
    HardwareEng(String nam, int id, double b, double t)
    {
       name=nam; EmpId=id; basic=b; ta=t;
    }
    double cal_sal()
    {    
        return basic+ta;
    }
}

public class DemoEmpSal
{
   public static void main(String args[])
   {   SoftwareEng   se =new SoftwareEng("AA", 44, 160000,68);
       System.out.println("salary="+se.cal_sal()); 
   }
}   