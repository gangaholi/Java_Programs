// Program on interface 
import java.lang.Math;

interface  Polygon {
   void getArea();
  
 // calculate the perimeter of a Polygon
 // getPerimeter method takes variable length arguments
   default void getPerimeter(int... sides) {
      int perimeter = 0;
      for (int side: sides) {
         perimeter += side;
      }

   System.out.println("Perimeter: " + perimeter);
   }
}

class Triangle implements Polygon {
   private int a, b, c;
   private double s, area;

// initializing sides of a triangle
   Triangle(int a, int b, int c) {
      this.a = a;
      this.b = b;
      this.c = c;
      s = 0;
   }

// calculate the area of a triangle
   public void getArea() {
      s = (double) (a + b + c)/2;
      area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
      System.out.println("Area: " + area);
   }
}

class Rectangle implements Polygon {
   private int a, b;
   private double s, area;

// initializing sides of a triangle
   Rectangle(int a, int b) {
      this.a = a;
      this.b = b;
      s = 0;
   }

// calculate the area of a triangle
   public void getArea() {
      area = a*b;
      System.out.println("Area: " + area);
   }
}

public class InterfaceDemo {
   public static void main(String[] args) {
      Triangle t1 = new Triangle(2, 3, 4);

// calls the method of the Triangle class
      t1.getArea();

// calls the method of Polygon
      t1.getPerimeter( 3,4,5);
      Rectangle r1= new Rectangle(8,6);
      r1.getArea();
      r1.getPerimeter(8,6,8,6);
   }
}
