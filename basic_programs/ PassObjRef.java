class Test {
   int a, b;
   Test(int i, int j) {
      a = i;
      b = j;
   }
   // pass an object
   void meth(Test o) {
      o.a *= 2;
      o.b /= 2;
   }
   void callbyValue(int a, int b)
   {
      a=a*2; b=b*2;
   }
}

class PassObjRef {
   public static void main(String args[]) {
      Test ob = new Test(15, 20);
      System.out.println("ob.a and ob.b before call: " +ob.a + " " + ob.b);
      ob.meth(ob);
      System.out.println("ob.a and ob.b after call: " +ob.a + " " + ob.b);
      int a=15,b=20;
      System.out.println("Call by value method- a and b before call: " +a + " " + b);
      ob.callbyValue(a,b);
      System.out.println("Call by value method -a and b after call: " +a + " " + b);
   }
}