//switch Statements
// Strings are also used as Index along with integer data and char
import java.util.Scanner;
public class TestSwitch {
  public static void main(String[] args) 
  {	Scanner in = new Scanner(System.in);
      System.out.println("Choice ch=");
      int ch=in.nextInt();
      switch(ch)
      {
       case 1: System.out.println("Choice="+ch);
               break;
       case 2: System.out.println("Choice="+ch);
               break;
               
       default : System.out.println("Default Choice="+ch);
       }
      }
      }