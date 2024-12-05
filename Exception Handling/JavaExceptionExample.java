public class JavaExceptionExample
{  
  public static void main(String args[])
  {   
      int a=args.length;
       System.out.println("a="+a);
        try{  
         if(a==1) a = a/(a-a); // division by zero
            /* If two command-line args are used, then generate an out-of-bounds exception. */
         if(a==2) 
         {  int c[] = new int[3];
            c[42] = 99; // generate an out-of-bounds exception
           }
         String name=null; //"KSIT";
         System.out.println("Length="+name.length());                       
       }    
       catch(ArithmeticException e)
       {  System.out.println(" divide by zero"+e);
            
       }
       catch(ArrayIndexOutOfBoundsException e)
       {  System.out.println(" ArrayIndexOutOfBoundsException  "+e);
       } 
       catch(NullPointerException e)
       {  System.out.println(" Null in Name ....>"+e);     
       } 
       finally{
        System.out.println("In finally block");
       }
       int bb[]= new int[3];
       String name1="KSIT_ICB";
       System.out.println(" Length of name1="+name1+" is "+name1.length());
       System.out.println(name1.indexOf('m')); 
       String s = "example";  
       System.out.println(" length of example="+s.length());
       try{
          String substring = s.substring(2, 8);        
       }   
      catch(StringIndexOutOfBoundsException e)
      {  System.out.println(" StringIndexOutOfBounds ---> "+e);       
      }
      try
      {
         int nn=Integer.parseInt(args[1]);
      }   
      catch(NumberFormatException e)
      {  System.out.println(" Number is required not string ---> "+e);
      }
      //rest code of the program   
      System.out.println("rest of the code...");
   }  
}  