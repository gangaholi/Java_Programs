// This program creates a custom exception type.
class MyException extends Exception 
{
  private int detail;
  MyException(int a) 
  {
      detail = a;
  }
  public String toString() 
  {   return "MyException[" + detail + "]";
  }
}


public class ExceptionDemo 
{
    static void compute(int a) throws MyException 
    {   System.out.println("Called compute(" + a + ")");
        if(a > 10)
            throw new MyException(a);
        System.out.println("Normal exit");
      }
      public static void main(String args[]) 
      {
         try {
            compute(1);
            compute(20);
            compute(2);
            
         } catch (MyException e) 
         {
            System.out.println("Caught " + e);
         }    
          
          for( int i=1;i<28;i=i+6)
          {
               try {
                 compute(i);        
              } 
              catch (MyException e) 
              {
                      System.out.println("Caught " + e);
                      System.out.println(e.getCause());
              }
          } 
    }
}