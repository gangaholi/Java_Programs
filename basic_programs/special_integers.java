class special_integers
{
     public static void main(String[] args) 
     {
         int x = 123_456_789;
         System.out.println(" x="+x);
         int B = 0b1010;
         int xy = 123___456___789;
         System.out.println(" xy="+xy);

         double num1 = 9_423_497_862.0;
         System.out.println(" Double num1="+num1);
         double num2 = 9_423_497.1_0_9;
         System.out.println(" Double num2="+num2);
         
         int B2 = 0b1101_0101_0001_1010;
         
         System.out.println(" B="+B);
         System.out.println(" B2="+B2);
         System.out.println(" B in binary ="+Integer.toBinaryString(B));
         
         System.out.println(" B2 in binary ="+Integer.toBinaryString(B2));
         String str1 = "two\nlines  \t tab space ";
         String str2 = " \"This is in quotes\"" ;
         System.out.println("String 1="+str1);
         System.out.println("String 2="+str2);
         int octal11=0123;
         System.out.println(octal11+" \612");
         System.out.println("\u234d");
              
       }
}         
         