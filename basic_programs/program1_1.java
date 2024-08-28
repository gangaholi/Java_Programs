import java.util.*;


public class program1_1
{    public static void main(String[] args) 
     {  
        int n=2;
        int matrixA[][]= new int[n][n];
        int matrixB[][]= new int[n][n];
        int matrixC[][]= new int[n][n];
        int i, j;
        
        Scanner input = new Scanner(System.in);
        
        System.out.println(" random output="+Math.random());
        System.out.println("enter A matrix of 2x2=");
        for(i=0;i<n;i++)
            for(j=0;j<n;j++)
               matrixA[i][j]=(int)(Math.random()*100);
               //matrixA[i][j]=input.nextInt();
        
        System.out.println("enter B matrix of 2x2=");
              
        for(i=0;i<n;i++)
            for(j=0;j<n;j++)
               matrixB[i][j]=(int)(Math.random()*100);
               //matrixB[i][j]=input.nextInt();
        
         System.out.println("Matrix A is ");      

         for(i=0;i<n;i++)
         {  for(j=0;j<n;j++)
            {  System.out.print(matrixA[i][j]+"  ");
            }
            System.out.println(" ");
         }   
         System.out.println("Matrix B is ");      
         for(i=0;i<n;i++)
         {  for(j=0;j<n;j++)
            {   System.out.print(matrixB[i][j]+"  ");
            }
            System.out.println(" ");
         }
         
         System.out.println("Addition of matrices is Matrix C ");     
         for(i=0;i<n;i++)
         {
            for(j=0;j<n;j++)
            {    matrixC[i][j]=matrixA[i][j] + matrixB[i][j];
            }
         }
         
         for(i=0;i<n;i++)
         {   for(j=0;j<n;j++)
             {  System.out.print(matrixC[i][j]+"  ");
             }
             System.out.println(" ");
         } 
   }
}