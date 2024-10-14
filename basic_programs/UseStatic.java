// Demonstrate static variables, methods, and blocks.
class UseStatic 
{
   static int a = 3;
   static int b;
   
   UseStatic()
   {
        System.out.println("InsideConstructor.....");
   }
   static void meth(int x) 
   {
      System.out.println("x = " + x);
      System.out.println("a = " + a);
      System.out.println("b = " + b);
   }
   static 
   {
      System.out.println("Static block initialized  a="+a+" b="+b);
      b = a * 4;
      System.out.println("After updating a & b --> a="+a+" b="+b);
   }
   public static void main(String args[]) 
   {  
      UseStatic ob = new UseStatic();  
      meth(42);
      ob.meth(777);
      ob.display();
   }
}

