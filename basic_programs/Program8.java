//program 8

class Outer {
    void display() {
        System.out.println("Outer display method");
    }
    // Inner class inside Outer class
    class Inner {
        void display() {
            System.out.println("Inner display method");
        }
    }
}
public class Program8 {
    public static void main(String[] args) {
        Outer outer = new Outer();
        Outer.Inner inner = outer.new Inner();
 
        // Calling display methods from outer and inner classes
        outer.display();
        inner.display();
    }
}
