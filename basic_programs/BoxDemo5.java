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
    System.out.println(" Default constructor  ....\n");
}
Box5(double w, double h, double d)
{
    width =w;
    height =h;
    depth = d;
    System.out.println(" 3 parametrized constructor  ....\n");
}

Box5(double x)
{
    width =height =depth = x;
    System.out.println(" 1 parametrized constructor  ....\n");

}

Box5(double x, double y)
{
    width =height= x;
    depth = y;
    System.out.println(" 2 parametrized constructor  ....\n");

}

Box5(Box5 satvik)
{   width =satvik.width;
    height =satvik.height;
    depth = satvik.depth;
    System.out.println(" Object  parametrized constructor  ....\n");

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
      Box5 mybox2 = new Box5(3,4,6);
      Box5 mybox3 = new Box5(6);
      Box5 mybox4 = new Box5(6,5);
      double vol;
      // get volume of first b,ox
      mybox1.display();
      vol = mybox1.volume();
      System.out.println(" mybox1 Volume is " + vol);
      // get volume of second box
      mybox2.display();
      vol = mybox2.volume();
      System.out.println("mybox2  Volume is " + vol);
      mybox3.display();
      vol = mybox3.volume();
      System.out.println("mybox3  Volume is " + vol);
      mybox4.display();
      vol = mybox4.volume();
      System.out.println("mybox4  Volume is " + vol);
      
      Box5 ss=new Box5(mybox2);
      ss.display();
      vol = ss.volume();
      System.out.println(" ss Volume is " + vol);
            
   }
}