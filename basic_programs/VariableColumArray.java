import java.util.Scanner;
public class VariableColumArray
{    public static void main(String[] args) 
     {  
      Scanner input = new Scanner(System.in);
      int twoD[][] = new int[4][];
      int i,j;
      twoD[0] = new int[1];
      twoD[1] = new int[2];
      twoD[2] = new int[3];
      twoD[3] = new int[4];
      System.out.println("Enter Matrix elemnts twoD ");      
      
      for(i=0;i<4;i++)
      {  System.out.println("Enter elements="+(i+1));
         for(j=0;j<i+1;j++)
         {  twoD[i][j] =input.nextInt();
         }
      }
      System.out.println("TwoD arrays is ");      
      for(i=0;i<4;i++)
      {  for(j=0;j<i+1;j++)
         {  System.out.print(twoD[i][j]+"  ");
         }
         System.out.println(" ");
      }   
  }
}