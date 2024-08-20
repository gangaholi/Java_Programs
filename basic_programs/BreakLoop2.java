//Using break to exit a while loop. 
class BreakLoop2 
{     public static void main(String args[]) 
      {	 int i = 0;
	       while(i < 15)
          { i++;
            if(i ==10)  break; // terminate loop if i is 10
	         System.out.println("i: " + i);
	         System.out.println("printed");
	      }
	      System.out.println("Loop complete."+i);
     }
}
