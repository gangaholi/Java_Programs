/*
8. Develop a JAVA program to create an outer class with a function display. Create another class inside the outer class named inner with a function called display and call the two functions in the main class.

 */
// Outer class
class Outer {
    // Outer class display method
    void display() {
        System.out.println("Outer class display");
    }

    // Inner class
    class Inner {
        // Inner class display method
        void display() {
            System.out.println("Inner class display");
        }
    }
}

// Main method  class
public class TestOuterInner {
    public static void main(String[] args) {
        // Create an instance of the outer class
        Outer outerObj = new Outer();

        // Call the display method of the outer class
        outerObj.display();

        // Create an instance of the inner class using the outer class instance
        Outer.Inner innerObj = outerObj.new Inner();

        // Call the display method of the inner class
        innerObj.display();
    }
}
