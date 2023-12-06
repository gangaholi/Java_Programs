/* 3. A class called Employee, which models an employee with an ID, name and salary, is designed as shown in the following class diagram. The method raiseSalary (percent) increases the salary by the given percentage. Develop the Employee class and suitable main method for demonstration.*/

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

    public static void main(String[] args) {
        // Creating an Employee object
        Employee employee = new Employee(1, "Rajkumar", 50000.0);
        // Displaying employee details
        System.out.println("Initial Employee Details:");
        System.out.println(employee);
        // Raising salary by 10%
        employee.raiseSalary(10);
        // Displaying updated employee details
        System.out.println("\nEmployee Details after Salary Raise:");
        System.out.println(employee);
    }
}
