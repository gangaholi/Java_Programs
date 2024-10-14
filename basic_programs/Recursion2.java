// Another example that uses recursion.
class RecTest {
   int values[];
   RecTest(int n) {
      values = new int[n];
      
      for(int i=0; i<10; i++)
          values[i] = i;
   }
   // display array -- recursively
   void printArray(int i) {
      if(i==0) return;
         else printArray(i-1);
      System.out.println("[" + (i-1) + "] " + values[i-1]);
   }
}

class Recursion2 {
   public static void main(String args[]) {
      RecTest ob = new RecTest(10);
      
      ob.printArray(10);
   }
}