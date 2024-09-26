// Now, volume() returns the volume of a box.
class Box5 {
double width;
double height;
double depth;
Box5()
{
    width =1;
    height =1;
    depth = 1;
}
Box5(double w, double h, double d)
{
    width =w;
    height =h;
    depth = d;
}

Box5(double x)
{
    width =height =depth = x;
}

Box5(double x, double y)
{
    width =height= x;
    depth = y;
}

// compute and return volume
double volume() {
return width * height * depth;
}

void display()
{
   System.out.println("Width:"+width+" height: "+ height+" Height: "+  depth);
}
}

public class BoxDemo5 {
   public static void main(String args[]) {
      Box5 mybox1 = new Box5();
      Box5 mybox11 = new Box5(3,4,6);
      Box5 mybox2 = new Box5(6);
      Box5 mybox21 = new Box5(6,5);
      double vol;
      // get volume of first b,ox
      mybox1.display();
      vol = mybox1.volume();
      System.out.println("Volume is " + vol);
      // get volume of second box
      mybox11.display();
      vol = mybox11.volume();
      System.out.println("Volume is " + vol);
      mybox2.display();
      vol = mybox2.volume();
      System.out.println("Volume is " + vol);
      mybox21.display();
      vol = mybox21.volume();
      System.out.println("Volume is " + vol);
   }
}