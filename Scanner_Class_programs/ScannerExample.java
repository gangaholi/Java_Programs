import java.util.*;  
public class ScannerExample {  
public static void main(String args[]){  
          Scanner in = new Scanner(System.in);  
          System.out.print("Enter your name: ");  
          String name = in.nextLine();  
          System.out.println("Name is: " + name);             

          System.out.print("Enter your College name: ");  
          String cname = in.next();  
          System.out.println("Name is: " + cname); 
          in.close();             
          }  
}  