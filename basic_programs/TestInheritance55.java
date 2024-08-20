class Shape 
{ int i;
  Shape()
  {
     i=1;
     System.out.println("super default constuctor i="+i);
  }
  Shape(int x)
  {
    i=x;
    System.out.println("super parameterized constuctori="+i);
 
  }   
  
  void draw()
  {
       System.out.println(" Shape is draw  "+i);
  } 
  void erase()
  {
       System.out.println(" Shape is erased");
  } 
}
class Circle extends Shape 
{ int j;
   Circle()
   {
     i=1;
     System.out.println("sub default constuctor i="+i);
   }
  Circle(int x, int y)
  { super(y);
    j=y;
    System.out.println("sub parameterized constuctori="+i);
    System.out.println("sub parameterized constuctori="+j);
    
  }   
  
  
  
  void draw()
  {
       System.out.println(" Circle is draw");
  } 
  void erase()
  {
       System.out.println(" Parameterized constuctor Circle is erased");
  } 
}

public class TestInheritance55
{
  public static void main(String args[])
  {
      Shape s1= new Shape();
      Shape s2= new Shape(3);
     
      Circle c1= new Circle();
      Circle c2= new Circle(55,566);
      //s.draw();
      //c.draw();
      
     
  }
}