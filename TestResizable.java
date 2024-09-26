7. Develop a JAVA program to create an interface Resizable with methods resizeWidth(int width) and resizeHeight(int height) that allow an object to be resized. Create a class Rectangle that implements the Resizable interface and implements the resize methods 
// Resizable interface
interface Resizable {
    void resizeWidth(int width);

    void resizeHeight(int height);
}

// Rectangle class implementing Resizable interface
class Rectangle implements Resizable {
    private int width;
    private int height;

    // Constructor
    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    // Implementing Resizable interface methods
    @Override
    public void resizeWidth(int width) {
        this.width = width;
    }

    @Override
    public void resizeHeight(int height) {
        this.height = height;
    }

    // Method to display the dimensions of the rectangle
    public void displayDimensions() {
        System.out.println("Width: " + width);
        System.out.println("Height: " + height);
    }
}

// Main program to demonstrate the usage
public class TestResizable {
    public static void main(String[] args) {
        // Creating a rectangle
        Rectangle rectangle = new Rectangle(5, 10);

        // Displaying original dimensions
        System.out.println("Original Dimensions:");
        rectangle.displayDimensions();

        // Resizing the rectangle
        rectangle.resizeWidth(8);
        rectangle.resizeHeight(12);

        // Displaying resized dimensions
        System.out.println("\nResized Dimensions:");
        rectangle.displayDimensions();
    }
}
