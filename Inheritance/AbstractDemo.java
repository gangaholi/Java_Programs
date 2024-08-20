abstract class A 
{   int x;
    A()
       {  x=10;
           System.out.println("A's Constructor. x ="+x);
       }
       abstract void callme();
       // concrete methods are still allowed in abstract classes
       void callmetoo() 
       {    System.out.println("This is a concrete method in abstract class A ");
       }
}

abstract class B extends A 
{    int y;
     B()
    {  y=20;
           System.out.println("B's Constructor.y="+ y);
    }    

     void callall() 
     { System.out.println("B's implementation of call all.");
     }
     void callmetoo() 
     {    System.out.println("This is a concrete method in abstract B class ");
     }

}

class C extends B
{  int z;
     C(int a)
     {  super();
        z=a;
           System.out.println("C's Constructor.z="+z);
      }
   void callme()
   { 
   System.out.println("C's implementation of callme.");
   }

}
public class AbstractDemo 
{    public static void main(String args[]) 
     {
        // A a = new A();
	  C c = new  C(100);
		 c.callme();
       c.callmetoo();
		// c.callmetoo();
      // c.callall();
      A a = new C(66);
        a.callme();
        a.callmetoo();
      }
}


