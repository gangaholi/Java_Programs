public class DemoOctal {
   public static void main(String []args) {
      int myOctal_1 = 023; //otcal numbers are respresented with beginning 0
      int myOctal_2 = 010;
      System.out.println(myOctal_1);
      System.out.println(myOctal_2);
      
      int myOctal_3= myOctal_1+myOctal_2;
      
      System.out.println(myOctal_3);
      
      System.out.println(Integer.toOctalString(myOctal_3));
      
      
   }
}