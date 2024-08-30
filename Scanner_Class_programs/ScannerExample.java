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
          System.out.println("Integer Data=");
          int x = in.nextInt();
          System.out.println("x="+x);
          System.out.println("Double Data=");
          double data=in.nextDouble();
          System.out.println("double="+data);
          in.close();             
          }  
}  