/* 6. Develop a JAVA program to create an abstract class Shape with abstract methods calculateArea() and calculatePerimeter(). Create subclasses Circle and Triangle that extend the Shape class and implement the respective methods to calculate the area and perimeter of each shape. */
// Abstract Shape class

abstract class Shape {
    // Abstract methods
    abstract double calculateArea();

    abstract double calculatePerimeter();
}

// Circle class (subclass of Shape)
class Circle extends Shape {
    private double radius;
    // Constructor
    public Circle(double radius) {
        this.radius = radius;
    }
    // Implementing abstract methods
    double calculateArea() {
        return Math.PI * radius * radius;
    }
     double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }
}

// Triangle class (subclass of Shape)
class Triangle extends Shape {
    private double side1, side2, side3;
    // Constructor
    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    // Implementing abstract methods
    double calculateArea() {
        // Using Heron's formula to calculate the area of a triangle
        double s = (side1 + side2 + side3) / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }

    double calculatePerimeter() {
        return side1 + side2 + side3;
    }
}

public class TestAbstract{
   public static void main(String[] args) {
        // Creating objects of different shapes
        Circle circle = new Circle(5.0);
        Triangle triangle = new Triangle(3.0, 4.0, 5.0);

        // Displaying area and perimeter of each shape
        displayShapeInfo(circle);
        displayShapeInfo(triangle);
    }
    // Method to display area and perimeter of a shape
    private static void displayShapeInfo(Shape shape) {
        System.out.println("Area: " + shape.calculateArea());
        System.out.println("Perimeter: " + shape.calculatePerimeter());
        System.out.println();
    }
}
