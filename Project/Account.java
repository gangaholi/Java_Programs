
public class Account
{   static int accountNumber=100;
    int acc_number;
    String name;
    double balance;
    String place;
    Account(String nam, double amt, String plac)
    {  accountNumber++;
       acc_number=accountNumber;
       name=nam;
       balance=amt;
       place=plac;
    }
    void display_account_details()
    {
        System.out.println(" Account Details\n");
        System.out.println("Account Numer="+acc_number);
        System.out.println("Account Name="+name);
        System.out.println("Account Holder address="+balance);
        System.out.println("Account Holder place="+place);
    }
  
}


