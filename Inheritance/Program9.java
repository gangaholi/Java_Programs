/*9. Develop a JAVA program to raise a custom exception (user defined exception) for 
DivisionByZero using try, catch, throw and finally. Custom exception class for DivisionByZero  8*/

class DivisionByZeroException extends Exception 
{  public DivisionByZeroException(String message) 
   {  super(message);
   }
} 

public class Program9 
{
    public static void main(String[] args) 
    {    int dividend = 10;
         int divisor = 0;
         try {
            if (divisor == 0) {
               throw new DivisionByZeroException("Cannot divide by zero");
             }
             int result = dividend / divisor;
             System.out.println("Result: " + result);
          } catch (DivisionByZeroException e) {
         System.out.println("DivisionByZeroException caught: " + e.getMessage());
         } finally {
            System.out.println("Finally block executed");
      }
}
}