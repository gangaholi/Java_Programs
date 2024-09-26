class Recursion2 
{
   public static void main(String args[]) 
   {
      RecuTest ob = new RecuTest(10);
      int i;
      for(i=0; i<10; i++) ob.values[i] = i;
      
      ob.printArray(10);
   }
}