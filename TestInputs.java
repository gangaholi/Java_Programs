public class TestInputs 
{
  public static void main(String[] args) 
  {	
      if(args.length > 0)
      {   System.out.println("Total number of command line arguments="+args.length);
          System.out.print("Input through command line arguments are\n");
          
          for(int i=0;i<args.length;i++)
          {
              System.out.print(args[i]+"\t");
          }
      }          
  }
}

