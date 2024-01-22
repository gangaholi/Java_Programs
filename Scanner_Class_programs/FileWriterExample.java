import java.io.FileWriter;  
import java.util.Scanner;
public class FileWriterExample
{  
    public static void main(String args[])
    {    Scanner in = new Scanner(System.in);
         try{    
           FileWriter fw=new FileWriter("testout.txt"); 
           fw.write("Welcome to javaTpoint.\n");   
           System.out.println("Enter 4 text lines data :");
           String data;
           for(int i=1;i<=4;i++)
           {    data = in.nextLine();
                fw.write(data+"\n");    
           }
           fw.close();    
          }catch(Exception e){System.out.println(e);}    
          System.out.println("Success...");    
     }    
}  