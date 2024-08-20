//5. Develop a JAVA program to create a class named shape. 
//Create three sub classes namely: circle, triangle and square, each class has two member functions named draw () and erase (). Demonstrate polymorphism concepts by developing suitable methods, defining member data and main program // Shape class
class Shape {
    // Member functions
    void draw() {
        System.out.println("Drawing a shape");
    }
    void erase() {
        System.out.println("Erasing a shape");
    }
}

// Circle class (subclass of Shape)
class Circle extends Shape {
    // Override draw method
    void draw() {
        System.out.println("Drawing a circle");
    }
   void erase() {
        System.out.println("Erasing a circle");
    }
}

// Triangle class (subclass of Shape)
class Triangle extends Shape {
    void draw() {
        System.out.println("Drawing a triangle");
    }
   void erase() {
         System.out.println("Erasing a triangle");
    }
}

// Square class (subclass of Shape)
class Square extends Shape {
    void draw() {
        System.out.println("Drawing a square");
    }
    void erase() {
        System.out.println("Erasing a square");
    }
}

public class testInheritance {
   // Method demonstrating polymorphism
    private static void performDrawAndErase(Shape shape) {
        // Call draw and erase methods
        shape.draw();
        shape.erase();
        System.out.println(); // Add a newline for better readability
   }
   // Main program to demonstrate polymorphism

    public static void main(String[] args) {
        // Creating objects of different shapes
         /*Shape circle = new Circle();
         Shape triangle = new Triangle();
         Shape square = new Square();
         performDrawAndErase(circle);
         performDrawAndErase(triangle);
         performDrawAndErase(square); 
         */
         Circle c= new Circle();
        Triangle t = new Triangle();
        c.draw();
            
     }   
}

