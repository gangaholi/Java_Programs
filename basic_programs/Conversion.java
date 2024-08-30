class Conversion
{   public static void main(String args[])
      {	byte b;   int i = 257;   double d = 323.142;
		   System.out.println("\nConversion of int to byte.");
		   b = (byte) i;
		   System.out.println("i and b " + i + " " + b);
		   System.out.println("\nConversion of double to int.");
		   i = (int) d;
		   System.out.println("d and i " + d + " " + i);
		   System.out.println("\nConversion of double to byte.");
		   b = (byte) d;    
         System.out.println("d and b " + d + " " + b);
         
         i=126;         int k=1;
         
         for(int c=1;c<=135;c++)
         {   b = (byte) i;
             System.out.println("integer value="+i+"  and byte value= " + b);
             i++;
             
             
         }
	  }
}

