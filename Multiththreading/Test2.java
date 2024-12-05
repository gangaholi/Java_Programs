import java.util.*;
class Customer
{    
   int amount=10000;    
   synchronized void withdraw(int amount)
   {     System.out.println("Amount="+amount);
         System.out.println("going to withdraw...");    
         if(this.amount<=amount)
         {    System.out.println("Less balance; waiting for deposit...");    
               try
               {   wait(); }
               catch(Exception e){  ; }    
         }    
         this.amount-=amount;    
         System.out.println("withdraw completed..Balance="+this.amount);    
    }    
    synchronized void deposit(int amount){    
    System.out.println("going to deposit...");    
    this.amount+=amount;    
    System.out.println("deposit completed... Balance="+this.amount);    
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
     
public class Test2
{    
   public static void main(String args[])
   {  Scanner in= new Scanner(System.in);  
      final Customer c=new Customer();    
      int amt;
      while(true)
      {  
           System.out.println(" 1. Deposite  ");
           System.out.println(" 2. Withdraw ");
           System.out.println(" 3. balannce");
           System.out.println(" 4. exit");
           System.out.println("Enter the choice=");
           int ch= in.nextInt();
           switch(ch)
           {
               case 1 : System.out.println("Enter amount to be deposited=");
                        amt =in.nextInt();
                        new DepositT(c, amt); break;
               case 2 : System.out.println("Enter amount to be withdrawn=");
                        amt =in.nextInt();
                        new WithdrawT(c, amt); break;
               case 3 : System.out.println("Balance amount="+c.amount); break;
               case 4 : return;
               default :System.out.println("Enter correct choice"); break;
           }
        }   
 
     }  
}