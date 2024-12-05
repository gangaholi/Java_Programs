import java.util.Scanner.*;

public class AccountDemo
{   public static void main(String args[])
    {   Account arry_acc[] = new Account[5];
        for(int i=0;i<5;i++)
        {
            arry_acc[i] = new Account("Aggg", 1000,"Bangalore");
            
         }
         for(int i=0;i<5;i++)
         {
            arry_acc[i].display_account_details();
         }
    }
    
    
 }   