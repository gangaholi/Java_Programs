class A {
int i;
int j;
A( int a, int b)
{  
   i=a; j=b;  System.out.println(" super class A Constructor is called");
}

void showij() {
System.out.println("i and j: " + i + " " + j);
}
}
// Create a subclass by extending class A.
class B extends A {
int k;

B( int a, int b, int c)
{
  super(a,b);
  
   k=c;  
   System.out.println(" sub class B Constructor is called");
}
void showk() {
showij();
System.out.println("k: " + k);
}

void sum() {
System.out.println("i+j+k: " + (i+j+k));
}
}
class SimpleInheritance {
public static void main(String args []) {
A superOb = new A(10,20);
B subOb = new B(7,8,9);
// The superclass may be used by itself.


System.out.println("Contents of superOb: ");
superOb.showij();
System.out.println();
/* The subclass has access to all public members of
its superclass. */
subOb.showk();
System.out.println("Contents of subOb: ");
subOb.showij();
subOb.showk();
System.out.println();
System.out.println("Sum of i, j and k in subOb:");
subOb.sum();
}
}