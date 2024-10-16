// A Simple demonstration of abstract.
abstract class AA 
{
	abstract void callme();
	// concrete methods are still allowed in abstract classes
	void callmetoo() 
	{
		System.out.println("This is a concrete method.");
	}
}

class BB extends AA 
{ 	 void callme() 
	 {
		System.out.println("B's implementation of 											callme.");
	}
}

public class AbstractDemoAABB 
{
	public static void main(String args[]) 
	{
		BB b = new BB();
		b.callme();
		b.callmetoo();
	}
}

