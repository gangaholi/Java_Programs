// Another example that uses recursion.
class RecuTest 
{
   int values[];
   private int a;
   RecuTest(int i) 
   {  values = new int[i];
   }
   void display()
   {  a=a+100;
      System.out.println("a="+a);
      a=a+100;
   }
   // display array -- recursively
   void printArray(int i) 
   {   if(i==0) return;
      else printArray(i-1);
         System.out.println((i-1) + " location value is   " + values[i-1]);
   }
}

class Recursion2 
{
   public static void main(String args[])
   { 
         RecuTest ob = new RecuTest(10);
         int i;
         for(i=0; i<10; i++) ob.values[i] = i;
         ob.printArray(10);
        // System.out.println("ob.a="+ob.a);
         ob.display();
         //System.out.println("ob.a="+ob.a);
         //ob.a=3000;
         ob.display();
         //System.out.println("ob.a="+ob.a);
   }
}