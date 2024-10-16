
class AB {
   int i; // public by default
   int j; // private to A
   protected int k;
   AB(int x, int y, int z) 
   {  i = x;   j = y;   k = z;
   }
   public String toString()
   {  return "i="+i+" j="+j+"  k="+k;
   }
   
}
 
public class PSTDemo
{
   public static void main(String args[])
   {
         AB ab =new AB(3,4,5);
         String s1="Hello";           
         String s2="Hello";
         String s3=new String("Hello");
           
         AB ab1 =new AB(3,4,5);
           
         System.out.println("ab=ab1="+ab.equals(ab1)); 
         System.out.println(" Object ab :"+ab);
         System.out.println("s1=s2="+s1.equals(s2)); 
         System.out.println("s1=s3="+s1.equals(s3));
         System.out.println("s1=s2="+(s1==s2)); 
         System.out.println("s1=s3="+(s1==s3));   
   }

}

