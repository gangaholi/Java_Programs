public class ExceptionExample1
{  
  public static void main(String args[])
   {  
       System.out.println("I'm here... dealing with runtime error..."); 
       int a, b;
       a=args.length;
       int aa[]= new int[5];
       try{	b=100/a;
		aa[3]=100;
        }     
        catch(ArithmeticException e)
        {   System.out.println("caught in catch block  a="+a);
            System.out.println(e);
        }
      	catch(ArrayIndexOutOfBoundsException e)
        {   System.out.println("caught in catch block   ---> aa[33]");
            System.out.println(e);
        }
	finally{
	System.out.println(".Inside finally block");
	}
       System.out.println("......rest of the code..."); 
  }  
}  