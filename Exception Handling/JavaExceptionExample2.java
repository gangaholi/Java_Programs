public class JavaExceptionExample2
{  
  static void func()
  {
     int a=100;
     a=a/0;
  }
  public static void main(String args[])
  {  
       System.out.println("I'm here... dealing with runtime error..."); 
       int data=10, ans,n=0;
       int a=args.length;
       System.out.println("a="+a);
       //System.out.println();  
       try
       {
       
           a=100/a;
           
           int b = a+200;
           int c= 2000;
           System.out.println("Try block  b="+b+"   c="+c);
       }
       catch(ArithmeticException e)
       {
         System.out.println(" ArithmeticException caught in catch block"); 
         a=100/2;
       }    
      // func();                  
        //rest code of the program   
       
       System.out.println("rest of the code..."+a);
    
  }  
}  