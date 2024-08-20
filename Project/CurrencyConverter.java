import java.util.*;
import java.text.DecimalFormat;
class Currency
{  String currencyNames[];
   double  currencyValue[][];
  Currency(double  aarr[][], String names[])
  {    currencyNames=names;
       currencyValue=aarr;  
  }
  void display()
  {  
      for(int i=0;i<3;i++)
         System.out.println("names of the currency "+currencyNames[i]);
    for(int i=0;i<3;i++)
    {    for(int j=0;j<3;j++)
              System.out.print(currencyValue[i][j]+"\t"); 
         System.out.println("\n");
    }
    
  }

   int getPosition( String currency)
   {
       boolean flag=false;  int position=-1;
       for(int i=0;i<3;i++)
       {
           if(currency.equals(currencyNames[i]))
           {
              flag=true;  position =i;
              break;
           }   
       }
       return position;
   }
   void convert(String from, String to, double fromAmount)
   {   
     int fromPosition, toPosition;
     fromPosition=getPosition(from);
     if(fromPosition<0)
     {
         System.out.println(" Currency not found ..");  return;
     }
     toPosition=getPosition(to);
     if(toPosition<0)
     {
         System.out.println(" Currency not found ..");  return;
     }
     double rate=currencyValue[fromPosition][toPosition];
     double totalAmount=rate*fromAmount;
     System.out.println(" Total converted amount="+ totalAmount);;
   } 
}
  

public class CurrencyConverter
{
   public static void main(String[] args)
   {  
       String nn[]={"Rupee","Dollar","Euro"};
            double currencyValues[][] = { 
                       {1,0.012, 0.011},{89.4, 1, 0.13},{ 90, 0.93,1}};   
      
      Currency currency = new Currency(currencyValues, nn);
         currency.display();
      Scanner sc = new Scanner(System.in);
       System.out.println("Please Enter curreny in String:");
      System.out.println("Enter 1: Rupee");
      System.out.println("Enter 2: Dollar");
      System.out.println("Enter 3: Euro");
         
       
      System.out.println("From currency---> ");
      String fromcurrency = sc.next();
     
      System.out.println("To currency---> ");
      String tocurrency = sc.next();  
      System.out.println("How much From currency---> ");
      double amt = sc.nextDouble();
      currency.convert(fromcurrency, tocurrency, amt);
      //System.out.println("Total amount from "+amt+"   "+fromcurrency+"  to  "+ tocurrency);
        
    }
    
 } /*
      double amount;
      double rupee, dollar, pound, euro, yen, ringgit;
      int choice;
 
      DecimalFormat f = new DecimalFormat("##.##");
 
      Scanner sc = new Scanner(System.in);
 
      System.out.println("Following are the Choices:");
      System.out.println("Enter 1: Ruppe");
      System.out.println("Enter 2: Dollar");
      System.out.println("Enter 3: Pound");
      System.out.println("Enter 4: Euro");
      System.out.println("Enter 5: Yen");
      System.out.println("Enter 6: Ringgit");
 
      System.out.print("\nChoose from above options: ");
      choice = sc.nextInt();
 
      System.out.println("Enter the amount you want to convert?");
      amount = sc.nextFloat();
 
      switch (choice)
      {
         case 1:  // Ruppe Conversion
            dollar = amount / 70;
            System.out.println(amount + " Rupee = " + f.format(dollar) + " Dollar");
 
            pound = amount / 88;
            System.out.println(amount + " Rupee = " + f.format(pound) + " Pound");
 
            euro = amount / 80;
            System.out.println(amount + " Rupee = " + f.format(euro) + " Euro");
 
            yen = amount / 0.63;
            System.out.println(amount + " Rupee = " + f.format(yen) + " Yen");
 
            ringgit = amount / 16;
            System.out.println(amount + " Rupee = " + f.format(ringgit) + " ringgit");
            break;
 
         case 2:  // Dollar Conversion
            rupee = amount * 70;
            System.out.println(amount + " Dollar = " + f.format(rupee) + " Ruppes");
 
            pound = amount *0.78;
            System.out.println(amount + " Dollar = " + f.format(pound) + " Pound");
 
            euro = amount *0.87;
            System.out.println(amount + " Dollar = " + f.format(euro) + " Euro");
 
            yen = amount *111.087;
            System.out.println(amount + " Dollar = " + f.format(yen) + " Yen");
 
            ringgit = amount *4.17;
            System.out.println(amount + " Dollar = " + f.format(ringgit) + " ringgit");
            break;
 
         case 3:  // Pound Conversion
            rupee = amount * 88;
            System.out.println(amount + " pound = " + f.format(rupee) + " Ruppes");
 
            dollar = amount *1.26;
            System.out.println(amount + " pound = " + f.format(dollar) + " Dollar");
 
            euro = amount *1.10;
            System.out.println(amount + " pound = " + f.format(euro) + " Euro");
 
            yen = amount *140.93;
            System.out.println(amount + " pound = " + f.format(yen) + " Yen");
 
            ringgit = amount *5.29;
            System.out.println(amount + " pound = " + f.format(ringgit) + " ringgit");
            break;
 
         case 4:  // Euro Conversion
            rupee = amount * 80;
            System.out.println(amount + " euro = " + f.format(rupee) + " Ruppes");
 
            dollar = amount *1.14;
            System.out.println(amount + " euro = " + f.format(dollar) + " Dollar");
 
            pound = amount *0.90;
            System.out.println(amount + " euro = " + f.format(pound) + " Pound");
 
            yen = amount *127.32;
            System.out.println(amount + " euro = " + f.format(yen) + " Yen");
 
            ringgit = amount *4.78;
            System.out.println(amount + " euro = " + f.format(ringgit) + " ringgit");
            break;
 
         case 5:  // Yen Conversion
            rupee = amount *0.63;
            System.out.println(amount + " yen = " + f.format(rupee) + " Ruppes");
 
            dollar = amount *0.008;
            System.out.println(amount + " yen = " + f.format(dollar) + " Dollar");
 
            pound = amount *0.007;
            System.out.println(amount + " yen = " + f.format(pound) + " Pound");
 
            euro = amount *0.007;
            System.out.println(amount + " yen = " + f.format(euro) + " Euro");
 
            ringgit = amount *0.037;
            System.out.println(amount + " yen = " + f.format(ringgit) + " ringgit");
            break;
 
         case 6:  // Ringgit Conversion
            rupee = amount *16.8;
            System.out.println(amount + " ringgit = " + f.format(rupee) + " Ruppes");
 
            dollar = amount *0.239;
            System.out.println(amount + " ringgit = " + f.format(dollar) + " dollar");
 
            pound = amount *0.188;
            System.out.println(amount + " ringgit =: " + f.format(pound) + " pound");
 
            euro = amount *0.209;
            System.out.println(amount + " ringgit = " + f.format(euro) + " euro");
 
            yen = amount *26.63;
            System.out.println(amount + " ringgit = " + f.format(yen) + " yen");
            break;
 
          //Default case
         default:
            System.out.println("Invalid Input");
      }
   }//
}*/
