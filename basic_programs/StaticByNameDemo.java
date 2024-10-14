class StaticUsage {
   static int a = 42;
   static int b = 99;
   
   static void callme() {
       System.out.println("a = " + a);
       System.out.println("++b = " + (++b));
   }
}

public class StaticByNameDemo 
{  static int square(int n)
   {
      return n*n;
   }

   public static void main(String args[]) 
   {
      StaticUsage.callme();
      System.out.println("b = " + StaticUsage.b); 
      StaticUsage.callme();  
      
      System.out.println("b = " + StaticUsage.b);
      System.out.println("Square of 5="+square(5));
      
      System.out.println("Square of 6="+StaticByNameDemo.square(6));
   }
}