// A simple package
package newpackage;
class Balance 
{
   String name;
   double bal;
   Balance(String n, double b) 
   {
      name = n;
      bal = b;
   }
   void show() 
   {  if(bal<0)
         System.out.print("--> ");
      System.out.println(name + ": Rs. " + bal);
   }
}

public class AccountBalance 
{    public static void main(String args[]) 
     {    Balance current[] = new Balance[4];
          current[0] = new Balance("A.P J ", 1123.23);
          current[1] = new Balance("Well Tell", 157.02);
          current[2] = new Balance("Tom Jackson", -012.33);
          current[3] = new Balance("John Dickenson", -3312.33);
          int n=current.length;
          for(int i=0; i<n; i++) 
            current[i].show();
     }     
}