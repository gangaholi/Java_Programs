// Now, volume() returns the volume of a box.
class Rectangle {
double length;
double breadth;
Rectangle()
{   length=1;
    breadth=1;
    System.out.println(" Default constructor  ....\n");
}

Rectangle(double x)
{
    length=breadth = x;
    System.out.println(" 1 parametrized constructor  ....\n");

}

Rectangle(double x, double y)
{
    length=x;
    breadth=y;
    System.out.println(" 2 parametrized constructor  ....\n");

}

Rectangle(Rectangle rec)
{   length=rec.length;
    breadth=rec.breadth;
    System.out.println(" Object  parametrized constructor  ....\n");

}

// compute and return volume
double area() {
return length* breadth;
}

void display()
{
   System.out.println("Length="+length+" Breadth: "+ breadth);
}
}

public class RectangleDemo {
   public static void main(String args[]) {
     Rectangle rect1 = new Rectangle();
     Rectangle rect2 = new Rectangle(2);
     Rectangle rect3 = new Rectangle(3,4);
     Rectangle rect4 = new Rectangle(rect1);
     Rectangle rect5 = new Rectangle(10);      
     double area;
      // get volume of first b,ox
      rect1.display();
      area = rect1.area();
      System.out.println(" Rect 1 area is " + area);
      // get volume of second box
     /* mybox2.display();
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
       */     
   }
}