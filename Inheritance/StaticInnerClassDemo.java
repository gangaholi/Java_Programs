// Demonstrate an inner class.
class Outer 
{ 	int outer_x = 100;
   // this is an inner class
   class Inner 
   {	void display() 
      {
         System.out.println("display: outer_x = " + outer_x);
      }
   }
   static class InnerStatic 
   {	 void showme() 
      {  Outer  outerObject = new Outer();
         outerObject.outer_x =outerObject.outer_x+100;
         System.out.println("display: outer_x = " + outerObject.outer_x);
      }
      static void meth()
      {  
         System.out.println("It is static method in static class");
      
      }
   }
   
   void test() 
   {	
      Inner inner = new Inner();
      inner.display();
      InnerStatic staticObject = new InnerStatic(); 
      staticObject.showme();
      InnerStatic.meth(); 
        
   }
   
}

public class StaticInnerClassDemo 
{ 	public static void main(String args[]) 
   {
      Outer outer = new Outer();
      outer.test();
      
   }
}
