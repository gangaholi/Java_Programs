class Employee
{ int id;
  String name;
  double salary;
  Employee(int id, String name, double salary)
  {
      this.id = id;
      this.name = name;
      this.salary = salary;      
  }
  void display()
  {
     System.out.println("Employee Id="+id);
     System.out.println("Employee name="+name);
     System.out.println("Employee salary="+salary);
  }
  void raiseSalary(double percentage)
  {
      salary = salary + salary * percentage/100;
  }
}

public class program3
{
   public static void main(String args[])
   {
      Employee emp = new Employee(23,"Raju", 200000);
      System.out.println("Before salary raise");
      emp.display();
      
      emp.raiseSalary(35);  
      System.out.println("After salary raise");
      emp.display();
      
   }


}