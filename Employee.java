/* 3. A class called Employee, which models an employee with an ID, name and salary, is designed as shown in the following class diagram. The method raiseSalary (percent) increases the salary by the given percentage. Develop the Employee class and suitable main method for demonstration.*/
import java.util.Scanner;
public class Employee {
    private int id;
    private String name;
    private double salary;

    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public void raiseSalary(double percent) {
        if (percent > 0) {
            double raiseAmount = salary * (percent / 100);
            salary += raiseAmount;
            System.out.println(name + "'s salary raised by " + percent + "%. New salary: $" + salary);
        } else {
            System.out.println("Invalid percentage. Salary remains unchanged.");
        }
    }

    public String toString() {
        return "Employee ID: " + id + ", Name: " + name + ", Salary: Rs." + salary;
    }
}
public class  TestEmployee{
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.println("Enter n=");
        int n=in.nextInt();
        // Creating an Employee object
       
        Employee employee[] = new Employee[10];
        for (int i=0;i<n;i++)
        {
          System.out.println("Enter Employee ID, Name, Salary:");
          int id; String name; double salary;
          id=in.nextInt();
          name=in.next();
          salary=in.nextDouble();
          employee[i] = new Employee(id,name, salary); 
        }
        // Displaying employee details
        System.out.println("Initial Employee Details:");
        for (int i=0;i<n;i++)
        {
           System.out.println(employee[i]);
        } 
        //  Raising salary by 10% ans Displaying updated employee details
        for (int i=0;i<n;i++)
        { 
            employee[i].raiseSalary(10);
            System.out.println(employee[i]);
        }    
    }
}
