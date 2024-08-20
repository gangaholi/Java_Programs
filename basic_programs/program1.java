
public class program1
{    public static void main(String[] args) 
     {  
        int length=args.length;
        if(length==0)
        {  System.out.println(" No argumengt is given ");
           return; 
        }   
        int n = Integer.parseInt(args[0]);
        if(n<=1)
        {  System.out.println(" Please enter matrix size > 1  ");
           return; 
        }
        
        int matrixA[][]= new int[n][n];
        int matrixB[][]= new int[n][n];
        int matrixC[][]= new int[n][n];
        int i, j;
        for(i=0;i<n;i++)
            for(j=0;j<n;j++)
               matrixA[i][j]=(int)(Math.random()*10);

        for(i=0;i<n;i++)
            for(j=0;j<n;j++)
               matrixB[i][j]=(int)(Math.random()*10);
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