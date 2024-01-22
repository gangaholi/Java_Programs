import java.util.*;  
public class ScannerClassExample2 {    
      public static void main(String args[]){                       
          String str = "Hello/This is JavaTpoint/My name is Abhishek.";  
          //Create scanner with the specified String Object  
          Scanner scanner = new Scanner(str);  
          System.out.println("Boolean Result: "+scanner.hasNextBoolean());            
          //Change the delimiter of this scanner  
          scanner.useDelimiter("/");  
          //Printing the tokenized Strings  
          System.out.println("---Tokenizes String---");   
        while(scanner.hasNext()){  
            System.out.println(scanner.next());  
        }  
          //Display the new delimiter  
          System.out.println("Delimiter used: " +scanner.delimiter());            
          scanner.close();  
          }    
}  