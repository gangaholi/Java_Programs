class Animal
{  
   void eat()
   {  System.out.println("eating...");}  
}  
class Dog extends Animal
{  
   void eat()
   {  System.out.println("eat function in Dog class");} 
   void bark()
   {     System.out.println("barking...");
   }  
}  

class TestInheritance
{  
   public static void main(String args[])
   {  Animal a= new Animal();
      a.eat();
      Dog d=new Dog();
      d.eat();    
      d.bark();
      Animal dd=new Dog();      
      dd.eat();  
      //dd.bark();  

   }
}  