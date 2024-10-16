class A 
{   private int i;    int j;
    A( int a, int b)
    {  i=a; j=b;  System.out.println(" super class A Constructor is called");   }

    void showij() 
    {    System.out.println("i and j: " + i + " " + j);
    }
    int sum()
    {  return i+j;}
}
// Create a subclass by extending class A.
class B extends A 
{   int k;
    B( int a, int b, int c)
    {    super(a,b);
         k=c;  
         System.out.println(" sub class B Constructor is called");
    }
   void showk() 
   {  showij();
      System.out.println("k: " + k);
   }
   int sum()
   {
      return super.sum()+k;
   }
}

public class SimpleInheritance 
{  public static void main(String args []) 
   {  A superOb = new A(10,20);
      B subOb = new B(7,8,9);
      System.out.println("Contents of superOb: ");
      superOb.showij();
      System.out.println("Sum of i, j and k in superOb:"+superOb.sum());

      System.out.println("Contents of subOb: ");
      subOb.showk();
      System.out.println();
      System.out.println("Sum of i, j and k in subOb:"+subOb.sum());
   }
}