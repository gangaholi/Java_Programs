// Demonstrating Strings.
class StringDemo {
   public static void main(String args[]) 
   {  String strOb1 = "String";
      String strOb2 = "String";
      String s= new String("String");
      String strOb3 = strOb1 + " and " + strOb2;
      System.out.println(strOb1);
      System.out.println(strOb2);
      System.out.println(strOb3);
      System.out.println(strOb1==s) ;     
      System.out.println("Length of strOb1: " +strOb1.length());
      System.out.println("Char at index 3 in strOb1: " +strOb1.charAt(3));
      if(strOb1.equals(strOb2))
         System.out.println("strOb1 == strOb2");
      else
         System.out.println("strOb1 != strOb2");
      if(strOb1.equals(s))
         System.out.println("strOb1 == s");
      else
        System.out.println("strOb1 != s"); 
  }
}
