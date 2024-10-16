/*class A {
   int i; // public by default
   private int j; // private to A
   protected int k;
   void setij(int x, int y, int z) 
   {  i = x;   j = y;   k = z;
   }
}

// A's j is not accessible here.
class B extends A 
{
   int total;
   void sum() 
   {
      total = i + k;
      //total = i + j + k; // ERROR, j is not accessible here
   }
}
class x
{
   void display()
   {
      B b= new B();
      b.sum();
      System.out.println("Total is " + b.total);
      System.out.println("i="+b.i);
      System.out.println("k="+b.k);
   }
}
*/
public class Access 
{
   public static void main(String args[]) 
   {
      x xx=new x();
      xx.display();
      B subOb = new B();
      
      subOb.setij(10, 12,13);
      
      subOb.sum();
      System.out.println("Total is " + subOb.total);
      System.out.println("i="+subOb.i);
      System.out.println("k="+subOb.k);
   }
}
