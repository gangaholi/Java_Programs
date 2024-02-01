import java.io.FileReader;  
public class FileReaderExample {  
    public static void main(String args[])throws Exception{    
          FileReader fr=new FileReader("ICBDept.txt");    
          int i;    String names[]= new String[12];
          int k=0; String str=" ";
          while((i=fr.read())!=-1)    
          {  if(i=='\n')
             {  names[k++] = str; 
                str=" ";
             }
             else 
             {   str=str + (char)i;    
             }
          }
          System.out.println("\n");
          fr.close();  
          for(int j=0;j<k;j++)
             System.out.println(names[j]);  
    }    
}    