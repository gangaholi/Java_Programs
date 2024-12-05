import java.util.Random;
class HandleError 
{
   public static void main(String args[]) 
   {
      int a=0, b=0, c=0;
      Random r = new Random();
      for(int i=0; i<3; i++) 
      {
        try {
             b = r.nextInt()%1000;
             c = r.nextInt()%1000;
             System.out.println("b="+b+"   c="+c);
             a = 12345 / (b/c);
             System.out.println("a="+a);
         } 
         catch (ArithmeticException e) 
         {
            System.out.println("Division by zero.");
            a = 0; // set a to zero and continue
         }
         System.out.println("a: " + a);
      }
   }
}