// Using run-time polymorphism.
abstract class Figure 
{ 	double dim1;
   double dim2;
   Figure(double a, double b) 
   {  	dim1 = a;
         dim2 = b;
   }
   abstract double area() ;
   void display()
   {
      System.out.println(" Dim1="+dim1+ "   Dim2="+dim2);
   }
}
class Rectangle extends Figure 
{   Rectangle(double a, double b) 
   {   super(a, b);
   }
   // override area for rectangle
   double area() 
   {   System.out.println("Inside Area for Rectangle.");
      return dim1 * dim2;
   }
}
class Triangle extends Figure 
{   Triangle(double a, double b) 
    {  super(a, b);
    }
   // override area for right triangle
   double area() 
   {  System.out.println("Inside Area for Triangle.");
      return dim1 * dim2 / 2;
   }
}

public class Abstract_AreasDemo 
{  public static void main(String args[]) 
   {     //Figure f = new Figure(10, 10);
         Rectangle r = new Rectangle(9, 5);
         Triangle t = new Triangle(10, 8);
         Figure figref;
         figref = r;   
         figref.display();
         r.display();
         System.out.println("Area is " + figref.area());
         figref = t;
         figref.display();
         //t.display();`
         System.out.println("Area is " + figref.area());
   }
}
