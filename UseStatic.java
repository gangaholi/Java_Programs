// Demonstrate static variables, methods, and blocks.
class UseStatic 
{
   static int a = 3;
   static int b;
   
   static void meth(int x) 
   {  System.out.println("Method meth is called");
      System.out.println("x = " + x);
      System.out.println("a = " + a);
      System.out.println("b = " + b);
   }

   static {
      System.out.println("Static block initialized.");
      
      System.out.println("a = " + a);
      System.out.println("b = " + b);
      b = a * 4;
    }
   

   public static void main(String args[]) 
   {
      meth(42);
   }
}

