//5. Develop a JAVA program to create a class named shape. Create three sub classes namely: circle, triangle and square, each class has two member functions named draw () and erase (). Demonstrate polymorphism concepts by developing suitable methods, defining member data and main program.
// Shape class (superclass)
	class Shape {
	    public void draw() {
	        System.out.println("Drawing a shape");
	    }

	    public void erase() {
	        System.out.println("Erasing a shape");
	    }
	}

	// Circle class (subclass)
	class Circle extends Shape {
	    @Override
	    public void draw() {
	        System.out.println("Drawing a circle");
	    }

	    @Override
	    public void erase() {
	        System.out.println("Erasing a circle");
	    }
	}

	// Triangle class (subclass)
	class Triangle extends Shape {
	    @Override
	    public void draw() {
	        System.out.println("Drawing a triangle");
	    }

	    @Override
	    public void erase() {
	        System.out.println("Erasing a triangle");
	    }
	}

	// Square class (subclass)
	class Square extends Shape {
	    @Override
	    public void draw() {
	        System.out.println("Drawing a square");
	    }

	    @Override
	    public void erase() {
	        System.out.println("Erasing a square");
	    }
	}

	public class Program5 {
	    public static void main(String[] args) {
	        // Creating objects of each shape
	        Shape circle = new Circle();
	        Shape triangle = new Triangle();
	        Shape square = new Square();

	        // Demonstrating polymorphism
	        // Calling draw() and erase() methods on different shapes
	        circle.draw();
	        circle.erase();

	        triangle.draw();
	        triangle.erase();

	        square.draw();
	        square.erase();
	    }
	}
