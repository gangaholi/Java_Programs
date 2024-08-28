class Scope
{	public static void main(String args[])
   {	int x=10; // known to all code within main x = 10;
      if(x == 10)
      { // start new scope
         int y = 20; // known only to this block
         System.out.println("x : "+x);
			System.out.println("y : "+y);
			x = y * 2;
         for(int i=1;i<=4;i++)
             System.out.print("  i =  "+i);
      }
      //y=99;
      //System.out.print("i =  "+i);
      //y=100;  
         
   }
}
