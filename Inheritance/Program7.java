// program 7
interface Resizable 
{
  void resizeWidth(int width);
   void resizeHeight(int height);
}
// Rectangle class implementing Resizable interface
class Rectangle implements Resizable 
{
   private int width;
   private int height;
   public Rectangle(int width, int height) 
   {
      this.width = width;
      this.height = height;
   }
   public void displayDimensions() 
   {    System.out.print("Rectangle Dimensions: Width = " + width);
         System.out.println(", Height = " + height);
   }
   @Override
   public void resizeWidth(int width) 
   {    this.width = width;
   }
   @Override
   public void resizeHeight(int height) 
   {   this.height = height;
   }
}
public class Program7 
{
   public static void main(String[] args) 
   {  Rectangle rectangle = new Rectangle(5, 10);
      // Displaying initial dimensions
      System.out.println("Before resizing:");
      rectangle.displayDimensions();
      // Resizing the rectangle
      rectangle.resizeWidth(8);
      rectangle.resizeHeight(12);
      // Displaying updated dimensions after resizing
      System.out.println("\nAfter resizing:");
      rectangle.displayDimensions();
   }
}