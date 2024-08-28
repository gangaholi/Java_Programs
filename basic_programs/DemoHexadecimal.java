public class DemoHexadecimal {
   public static void main(String []args) {
      int one = 0X123;
      int two = 0xABC;
      System.out.println("Hexadecimal number 1 is decimal : "+one);
      System.out.println("Hexadecimal number 2 is decimal : "+two);
      int three=one+two;
      System.out.println("Sum of two Hexadecimal numbers in Decimal: "+three);
      System.out.println("Sum in Hexa decimal number--->"+Integer.toHexString(three));
   }
}