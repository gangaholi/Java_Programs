//8. Develop a JAVA program to create an outer class with a function display. Create another class inside the outer class named inner with a function called display and call the two functions in the main class. // Outer class
class Outer 
{
   void display() 
   { System.out.println("Outer display method");
   }
   // Inner class inside Outer class
   class Inner 
   { 
     void display() 
     {
         System.out.println("Inner display method");
      }
   }
}

public class Program8 
{
   public static void main(String[] args) 
   {  Outer outer = new Outer();
      Outer.Inner inner = outer.new Inner();
      // Calling display methods from outer and inner classes
      outer.display();
      inner.display();
   }
}