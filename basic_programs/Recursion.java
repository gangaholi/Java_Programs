// A simple example of recursion.
class Factorial {
// this is a recursive method
   int fact(int n) {
      int result;
      if(n==1) return 1;
         result = fact(n-1) * n;
      return result;
   }
}

class Recursion {
   int cube( int n)
   {
      return n*n*n;
   }
   
   // static method
   static void static_method()
   { 
        System.out.println("Static method");
   }
   
   public static void main(String args[]) {
      Factorial f = new Factorial();
      System.out.println("Factorial of 3 is " + f.fact(3));
      System.out.println("Factorial of 4 is " + f.fact(4));
      System.out.println("Factorial of 5 is " + f.fact(5));
      
      Recursion r = new Recursion();
      int cu=r.cube(6);
      System.out.println("Cube  of 6 is " + cu);
      System.out.println("Cube  of 7 is " + r.cube(7));
      static_method();
            
   }
}