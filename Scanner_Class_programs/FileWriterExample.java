import java.io.FileWriter;  
import java.util.Scanner;
public class FileWriterExample
{  
    public static void main(String args[])
    {    Scanner in = new Scanner(System.in);
         try{    
           FileWriter fw=new FileWriter("ICBDept.txt"); 
           fw.write("Welcome to KSIT .\n");   
           System.out.println("Enter 5 text lines data :");
           String data;
           for(int i=1;i<5;i++)
           {    data = in.nextLine();
                fw.write(data+"\n");    
           }
           fw.close();    
          }catch(Exception e){System.out.println(e);}    
          System.out.println("Success...");    
     }    
}  