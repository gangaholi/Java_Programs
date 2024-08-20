// An enumeration of apple varieties.
enum Apple { Ooty, Nagpur, Kashmir, Shimla, Manali }

class EnumDemo 
{
   public static void main(String args[])
   {
      Apple ap;
      ap = Apple.Kashmir;
      // Output an enum value.
      System.out.println("Value of ap: " + ap);
      System.out.println();
      ap = Apple.Nagpur;
      // Compare two enum values.
      if(ap == Apple.Nagpur)
         System.out.println("ap contains Nagpur.\n");
      // Use an enum to control a switch statement.
      switch(ap) 
      {   case Nagpur:   System.out.println("Nagpur apples are red.");
                         break;
          case Ooty:     System.out.println("Ooty apple is Delicious ");
                         break;
          case Kashmir:  System.out.println("Kashmir apples are red.");
                         break;
          case Shimla:   System.out.println("Shimla apples are very tasty.");
                          break;
         case Manali:   System.out.println("Manali apples are Yellow.");
                          break;
      }
   }
}