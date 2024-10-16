class B extends A 
{
   int total;
   void sum() 
   {
      total = i + k;
      //total = i + j + k; // ERROR, j is not accessible here
   }
}
