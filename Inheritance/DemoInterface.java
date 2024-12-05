// Java 9 program to illustrate 
// private methods in interfaces 
interface TempI { 
	public abstract void mul(int a, int b);  // abstract method
public default void add(int a, int b) 
	{       // private method inside default method 
		sub(a, b); 
// static method inside other non-static method 
		div(a, b); 
		System.out.print("Answer by Default method = "); 
		System.out.println(a + b); 
	} 
	public static void mod(int a, int b) 
	{        div(a, b); // static method inside other static method 
		System.out.print("Answer by Static method = "); 
		System.out.println(a % b); 
	} 

	private void sub(int a, int b) 
	{ 	System.out.print("Answer by Private method = "); 
		System.out.println(a - b); 
	} 
	private static void div(int a, int b) 
	{ 
		System.out.print("Answer by Private static method = "); 
		System.out.println(a / b); 
	} 
} 
class SubTemp implements TempI { 
	public void mul(int a, int b) 
	{  	System.out.print("Answer by Abstract method = "); 
		System.out.println(a * b); 
	} 
}
public class DemoInterface
{	public static void main(String[] args) 
	{ 
		SubTemp in = new SubTemp(); 
		in.mul(2, 3); 
		in.add(6, 2); 
		TempI.mod(5, 3); 
	} 
}
