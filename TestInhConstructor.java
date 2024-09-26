class Grandparent 
{  String name;
   Grandparent() //String nm)
   { // name=nm;
      System.out.println(" Grand parent Constructor is called");
    }
   void display()
   {
      System.out.println("Grand parent name is ");
   }
 }
 
class Parent extends Grandparent
{   String property; 
    Parent()  
    {  //property=pr;
       System.out.println(" Constructor B is called");
  
   }
}   
/*
class C extends B
{  int k;
   C()
   {  System.out.println(" Constructor C is called");
      k=10;
   }
}  
*/

public class TestInhConstructor 
{
  public static void main(String[] args) 
   {
      Grandparent a =  new Grandparent() ; //"Grand");
      Grandparent p = new Parent();//"ABC", "455");
    }
}   
   
   
   