import java.util.*;
class Customer
{  int amount=10000;    
   synchronized void withdraw(int amount)
   {     System.out.println("Amount="+amount);
         System.out.println("going to withdraw...");    
         if(this.amount<=amount)
         {    System.out.println("Less balance; waiting for deposit...");    
               try
               {   wait(); }
               catch(Exception e){  System.out.println("Caught"+e); }    
         }    
         this.amount=this.amount-amount;    
         System.out.print("withdraw "+ amount); 
         System.out.println(" is completed..Balance="+this.amount);    
    }    
    synchronized void deposit(int amount){    
    System.out.println("going to deposit...");    
    this.amount=this.amount+amount;    
    System.out.print("deposite "+amount);
    System.out.println(" is completed and Balance="+this.amount);    
    notify();    
   }    
}    

class WithdrawT extends Thread
{ Customer c;
  int amount;
  WithdrawT(Customer cc, int amt)
  { c=cc; amount=amt; 
    start();  
   }
   public void run()
   {  c.withdraw(amount);
   }
}
 
class DepositT extends Thread
{ Customer c;
  int amount;
  DepositT(Customer cc, int amt)
  { c=cc; 
    amount=amt;
    start();  
   }
   public void run()
   {  c.deposit(amount);
   }
}
     
public class Test
{    
   public static void main(String args[])
   {  Scanner in= new Scanner(System.in);  
      final Customer c=new Customer();
      new WithdrawT(c,15000); 
      new DepositT(c, 10000);  
   }  
}