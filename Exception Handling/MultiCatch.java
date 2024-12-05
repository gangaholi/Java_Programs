// Demonstrate the multi-catch feature.
class MultiCatch 
{
   public static void main(String args[]) 
   {
      int a=10, b=0;
      int vals[] = { 1, 2, 3 };
      try {
            int result = a / b; // generate an ArithmeticException
         // vals[10] = 19; // generate an ArrayIndexOutOfBoundsException
         // This catch clause catches both exceptions.
      } catch(ArithmeticException | ArrayIndexOutOfBoundsException e) 
      {
         System.out.println("Exception caught: " + e);
      }
      finally
      {   System.out.println("Finally block.... "); }
      
      System.out.println("After multi-catch.");
      for( int i=1;i<=30;i=i+2)
      {
          System.out.print("Square of "+i+"="+(i*i));
          System.out.println("\t Cube of "+i+"="+(i*i*i));
      }
      
   }
}
