interface Area
{
   int Max=100;
   double Calculate_area(int a, int b);
   void display();
 }
 
 class Rectangle implements Area
 {
   public double Calculate_area(int a, int b)
   {
        return (a*b);    
   }
   public void display()
   {
       System.out.println("Rectangle area is calculated");
   }   
 }  
   
class Triangle implements Area
{
   public double Calculate_area(int a, int b)
   {
       return (0.5*a*b);
   }
   public void display()
   {   System.out.println("Triangle area is calculated");
      
   }
}

public class DemoInterfaceArea
{
   public static void main(String args[])
   {
      Rectangle r1 = new Rectangle();
      Triangle t1  = new Triangle();
      double result;
      result = r1.Calculate_area(10,20);
      r1.display();
      System.out.println(" Area="+result);
      t1.display();
      result = t1.Calculate_area(20,20);
      System.out.println("Area="+ result);
    }
  }         