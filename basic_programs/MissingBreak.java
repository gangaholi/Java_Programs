class MissingBreak 
{
   public static void main(String args[]) {
      for(int i=0; i<12; i++)
      switch(i) 
      {
         case 0 : System.out.println("i is less than 5="+i);
         case 1 : System.out.println("i is less than 5="+i);
         case 2 : System.out.println("i is less than 5="+i);
         case 3 : System.out.println("i is less than 5="+i);
         case 4 : System.out.println("i is less than 5="+i);
                  System.out.println("i is less than 5="+i);
                  break;
         case 5 : System.out.println("i is less than 10="+i);
         case 6 : System.out.println("i is less than 10="+i);
         case 7 : System.out.println("i is less than 10="+i);
         case 8 : System.out.println("i is less than 10="+i);
         case 9 : System.out.println("i is less than 10="+i);
                  System.out.println("i is less than 10 ="+i);
                  break;
         default:
                  System.out.println("i is 10 or more");
      }
   }
}