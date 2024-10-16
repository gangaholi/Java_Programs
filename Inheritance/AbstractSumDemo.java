// Java Program to implement
// Abstract Method in Interface
import java.io.*;

// declaring an interface
abstract class Sum {
    // declaring abstract methods inside the interface
    public abstract int Operation_two_var(int a, int b);

    abstract int Operation_three_var(int a, int b, int c); 
    void show()
    {
           System.out.println(" Non SAbstract Method in Abstract class");
    }
}

// Main Class
public class AbstractSumDemo extends Sum {
    public int Operation_two_var(int a, int b)
    {
        return a * b;
    }

    public int Operation_three_var(int a, int b, int c)
    {
        return a * b * c;
    }

    // main function
    public static void main(String args[])
    {
        Sum object = new AbstractSumDemo();
        System.out.println(object.Operation_two_var(10, 20));
        System.out.println(object.Operation_three_var(10, 20, 30));
    }
}
