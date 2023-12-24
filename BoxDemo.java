/* A program that uses the Box class.
Call this file BoxDemo.java
*/
class Box {
	double width;
	double height;
	double depth;
}

// This class declares an object of type Box.
class BoxDemo {
	public static void main(String args[]) {
		Box mybox = new Box();
		double vol;
		// assign values to mybox's instance variables
		mybox.width = 10;
		mybox.height = 20;
		mybox.depth = 15;
		// compute volume of box
		vol = mybox.width * mybox.height * mybox.depth;
		System.out.println("Volume is " + vol);
      Box mybox1 = new Box();
		double vol1;
		// assign values to mybox's instance variables
		mybox1.width = 30;
		mybox1.height = 20;
		mybox1.depth = 15;
		// compute volume of box
		vol1 = mybox1.width * mybox1.height * mybox1.depth;
		System.out.println("Volume is " + vol1); 
      System.out.println(mybox);   
	}
}
