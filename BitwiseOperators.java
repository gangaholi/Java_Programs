public class BitwiseOperators
{  public static void main(String args[])
	{  int m = 5, n = 3;
      int andResult = m & n;  // Bitwise AND
      int orResult = m | n;   // Bitwise OR
      int xorResult = m ^ n;  // Bitwise XOR
      int leftShift = m << 1; // Left Shift
      int rightShift = m >> 1; // Right Shift
      System.out.println("Bitwise AND Result: " + andResult);
      System.out.println("Bitwise OR Result: " + orResult);
      System.out.println("Bitwise XOR Result: " + xorResult);
      System.out.println("Left Shift Result: " + leftShift);
      System.out.println("Right Shift Result: " + rightShift);
      int a=-1;
      System.out.println(" a<<1="+(a>>>24));
      if(a==-1)
         System.out.println("true");
      if(a=10)
        System.out.println("true=  "+a );
      
      
      
    }
 }