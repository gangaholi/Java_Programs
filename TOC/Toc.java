import java.util.Scanner;

public class Toc
{  static int exp(int i, int n)
   {
      int ans,j ;
      ans=1;
      for(j=1;j<=n;j++)
         ans*=i;
      return ans; 
   }
   public static void main(String args[]) 
   {      
            Scanner input = new Scanner(System.in);
            int n, total, x,y,z; x=y=z=0;
            System.out.println("Enter n=");
            n=input.nextInt();
            total=3;
            while(true)
            {  for(x=1;x<=total-2;x++)
                  for(y=1;y<=total-x-1;y++)
                  {   z=total-x-y;
                     if(exp(x,n)+exp(y,n)==exp(z,n))
                          System.out.println( "Hello world x="+x+" y="+y+" z="+z); 
                      else
                      System.out.println( "Noo x="+x+" y="+y+" z="+z);
                  }
            total++;
            }         
      }
} 