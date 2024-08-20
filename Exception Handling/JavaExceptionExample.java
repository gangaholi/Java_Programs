public class JavaExceptionExample
{  
  public static void main(String args[])
  {  
       System.out.println("I'm here... dealing with runtime error..."); 
       int data=10, ans,n=0;
       int a=args.length;
       System.out.println("a="+a);
        try{  
         if(a==1) a = a/(a-a); // division by zero
            /* If two command-line args are used,  then generate an out-of-bounds exception. */
         if(a==2) {
            int c[] = { 1 };
            c[42] = 99; // generate an out-of-bounds exception
         }
  
          data=100;
          ans= data/a;  
          System.out.println(ans);  
            
          String s=null;
         int l=s.length();
                   
       }
       catch(ArithmeticException e)
       {  System.out.println(" divide by zero"+e);
            
       } 
      catch(NullPointerException e)
       {  System.out.println(" Null pointer"+e);
            
       } 
       
     finally{
     System.out.println("In finally block");
    } 
    try{
     
    int nn=Integer.parseInt(args[1]);
    }   
    catch(NumberFormatException e)
    {  System.out.println(" Null pointer"+e);
            
    }
    //rest code of the program   
    System.out.println("rest of the code...");
    
  }  
}  