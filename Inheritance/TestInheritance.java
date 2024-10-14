class Animal
{  
   void eat()
   {  System.out.println("eating...");}  
}  
class Dog extends Animal
{  
   void bark()
   {     System.out.println("barking...");}  
}  

class TestInheritance
{  
   public static void main(String args[])
   {  Animal a= new Animal();
      a.eat();
      Dog d=new Dog();  
      d.bark();  
      d.eat();  
   }
}  