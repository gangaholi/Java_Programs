//6. Develop a JAVA program to create an abstract class Shape with abstract methods calculateArea() and calculatePerimeter(). Create subclasses Circle and Triangle that extend the Shape class and implement the respective methods to calculate the area and perimeter of each shape.
// Abstract Shape class
abstract class Shape1 
{
   abstract double calculateArea();
   abstract double calculatePerimeter();
}
   // Circle class extending Shape
class Circle1 extends Shape1 
{
   private double radius;
   public Circle1(double radius) 
   {
      this.radius = radius;   
   }
   @Override
   double calculateArea() {
      return Math.PI * radius * radius;
   }
   @Override
  double calculatePerimeter() {
      return 2 * Math.PI * radius;
   }
}
// Triangle class extending Shape 
class Triangle1 extends Shape1 {
   private double side1;
   private double side2;
   private double side3;
   public Triangle1(double side1, double side2, double side3) {
      this.side1 = side1;
      this.side2 = side2;
      this.side3 = side3;
   }
   @Override
   double calculateArea() {
      // Heron's formula to calculate area of a triangle
      double s = (side1 + side2 + side3) / 2;
      return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
   }
   @Override
   double calculatePerimeter() {
      return side1 + side2 + side3;
   }
}
public class Program6 {
   public static void main(String[] args) {
   // Creating a circle and calculating its area and perimeter
      Circle1 circle = new Circle1(5);
      System.out.println("Circle Area: " + circle.calculateArea());
      System.out.println("Circle Perimeter: " + circle.calculatePerimeter());
      // Creating a triangle and calculating its area and perimeter 
      Triangle1 triangle = new Triangle1(3, 4, 5);
      System.out.println("Triangle Area: " + triangle.calculateArea());
      System.out.println("Triangle Perimeter: " + triangle.calculatePerimeter());
   }
}