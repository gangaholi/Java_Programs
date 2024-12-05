public class TestThrow1 {   
    public static void validate(int age) {  
        if(age<18) {  
            //throw Arithmetic exception if not eligible to vote  
            throw new ArithmeticException("Person is not eligible to vote");    
        }  
        else {  
            System.out.println("Person is eligible to vote!!");  
        }  
    }  
    //main method  
    public static void main(String args[]){  
        //calling the function
        try{
          
           validate(13); 
           }
           catch(ArithmeticException e)
           {
              System.out.println("Caught in cath block"+e);
           } 
        System.out.println("rest of the code...");
        System.out.println("rest of the code...");
        System.out.println("rest of the code..."); 
        System.out.println("rest of the code...");   
  }    
}
