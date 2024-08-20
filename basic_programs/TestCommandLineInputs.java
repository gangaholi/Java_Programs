public class TestCommandLineInputs 
{  public static void main(String[] args) 
   {	if(args.length <= 0)
      {
         System.out.println("Enter Command line arguments");
         return;
      }
      double sum=0;
      System.out.println("Total number of command line arguments="+args.length);     
      System.out.print("Inputs through command line arguments are\n");
      for(int i=0;i<args.length;i++)
      {
          System.out.println(args[i]+"\t");
          //int n= Integer.parseInt(args[i]);
          double  n= Double.parseDouble(args[i]);

          sum=sum+n;
      }
      System.out.println("\nSum of n numbers="+sum); 
   }
}
