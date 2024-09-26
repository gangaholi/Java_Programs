class MyMath
{
   static int n=10;
   static int square(int number)  // instance method
   {  return number*number;
   } 
  static void display()
  {  n=n+10;
     System.out.println(" n: "+n);
  }
   
}


public class testMyMath
{  static int fact(int n)
   { int f=1;
     for(int i=1;i<=n;i++)
        f=f*i;
     return f;  
   }
   public static void main(String args[])
   {   // MyMath m1= new MyMath();
       int sq=MyMath.square(6);
       System.out.println("square of 6="+sq); 
       MyMath.display();
       //testMyMath t=new testMyMath();
       
       System.out.println("fact of 5="+fact(5));
   }
}   
   