import java.util.Scanner;
class Switch_statement 
{	public static void main(String args[]) throws java.io.IOException
	{   Scanner in=new Scanner(System.in);
       int choice;
       do  
	    {	System.out.println("Help on:"); 
		   System.out.println(" 1. if"); 
		   System.out.println(" 2. switch"); 
		   System.out.println(" 3. while"); 
		   System.out.println(" 4.do-while"); 
		   System.out.println(" 5. for\n"); 
		   System.out.println("Enter Choice from 1 to 5:");
         choice=in.nextInt(); 
		   switch(choice)
	      {
		      case 1 :	System.out.println("The if:\n");
		      		System.out.println("if(condition) statement;");
		      		System.out.println("else statement;");
		      		break;
		      case 2 :	System.out.println("The switch:\n");
		      		System.out.println("switch(expression) {");
		      		System.out.println(" case constant:");
		      		System.out.println(" statement sequence");
		      		System.out.println(" break;");
		      		System.out.println(" // ...");
		      		System.out.println("}");
		      		break;
		   case 3:	System.out.println("The while:\n");
		         		System.out.println("while(condition) statement;");
		      		break;
   	   case 4 :	System.out.println("The do-while:\n");
	      			System.out.println("do {");
	      			System.out.println(" statement;");
	      			System.out.println("}while (condition);");	
      				break;
		   case 5:  	System.out.println("The for:\n");
      				System.out.print("for(init; condition; iteration)");
      				System.out.println(" statement;");
      				break;
          default : System.out.println("Choice out of range;");
		 }
	 }while( choice >=1 && choice <=5); 
	    
 }
}