import java.util.Scanner;
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
      Scanner in = new Scanner(System.in);
      System.out.println("Enter Employee Deatils ");
      System.out.print("Employee Id ="); 
      int id= in.nextInt();
      
      System.out.print("Employee Name ="); 
      String name = in.next();
      System.out.print("Employee Salary ="); 
      double salary= in.nextDouble();
      
      Employee emp = new Employee(id, name, salary);
      System.out.println("\nEmployee details before salary raise");
      emp.display();      
      
      System.out.println("Enter percentage of Increment (0-100) ="); 
      double percentage = in.nextDouble();
      emp.raiseSalary(percentage);  
      System.out.println("\nEmployee details after salary raise");
      emp.display();  
      Employee emp1 = new Employee(5, "ABC",100000);
      emp1.display();   
      emp1.raiseSalary(30);   
      emp1.display();     
          
   }
}