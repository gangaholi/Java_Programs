class MyMath
{
   static double PI=3.142;
   static int cube(int n)
   {
       return n*n*n;
   }
   static int square(int n)
   {
       return n*n;
   }
}   

class MyMathDemo
{

   public static void main(String args[])
   {
     MyMath ob= new MyMath();
     System.out.println(" Cube of 6="+ MyMath.cube(6));
     System.out.println(" Square of 66="+ MyMath.square(66)+ "PI value is="+MyMath.PI);      
     System.out.println(" Cube of 6="+ ob.cube(6));
     System.out.println(" Square of 66="+ ob.square(66)+ "PI value is="+ob.PI); 
   }

}