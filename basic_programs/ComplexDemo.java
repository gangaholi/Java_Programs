class Complex
{  int r,i;
   Complex()
  {   
     r=1; i=1;
  }
  Complex(int x, int y)
  {   
    r=x; i=y;
  }
  Complex add(Complex c2)
  {
    Complex c3 = new Complex();
    c3.r=r+c2.r;
    c3.i=i+c2.i;
   return c3;
 }
 
 void display()
 {  
    System.out.println(r+ "+j" +i); 
 }
} 
 
 public class ComplexDemo
 {
 
     public static void main(String args[])
     {
       Complex c1= new Complex(5,7);
       Complex c2= new Complex(15,17);
       Complex c3;
           
       System.out.print("Complex no 1"); c1.display(); 
       System.out.print("Complex no 2"); c2.display(); 
       c3=c1.add(c2);
       System.out.print("Complex no 3"); c3.display(); 
      
     }
     
}     