public class JavaExample
{  
  public static void main(String args[])
  {  
       System.out.println("I'm here... dealing with runtime error..."); 
       
       try{
             int data=100/0;  
             System.out.println("......rest of the code...");  
        } catch(ArithmeticException e)
        {   System.out.println("caught in catch block");
            System.out.println(e);
        }
       
        System.out.println("rest of the code..."); 
         String s=null;  
       //System.out.println(s.length());//NullPointerException 
      
       int a[]=new int[5];  
       //a[10]=50; //ArrayIndexOutOfBoundsException   
         catch(ArithmeticException e)
        {   System.out.println("caught in catch block");
            System.out.println(e);
        }
        finally{
        
        System.out.println(" finally rest of the code...");       
        }
       
  }  
}  