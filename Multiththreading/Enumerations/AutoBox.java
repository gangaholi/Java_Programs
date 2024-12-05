class AutoBox
 {      public static void main(String args[]) 
        {    Integer iOb = 100; // autobox an int
              int i = iOb; // auto-unbox
              System.out.println(i + " " + iOb); // displays 100  100
              String s1= new String("KSIT");
              String s2="KSIT";
              String s3="KSIT";
              String s4="ksit";
              System.out.println("s1="+s1);
              System.out.println("s2="+s2.length());
               System.out.println("s1.compareTo(s2)    is "+(s1.compareTo(s2)));
               System.out.println("s1==s2    is "+(s1==s2));
               System.out.println("s1==s2    is "+(s1==s2));

              System.out.println("s3==s4    is "+(s3==s4));
              System.out.println("KSIT_Bangalore".length());

        }
}
