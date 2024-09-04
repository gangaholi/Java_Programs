import java.util.Scanner;
class Result
{
  public static void main(String args[])
  {  Scanner in = new Scanner(System.in);
     System.out.println(" enter n=");
     int n=in.nextInt();
     int s[] =new int[n];
     double sum=0, average;
     System.out.println(" enter 4 subject marks=");
     for (int i=0;i<n;i++)
     {
        s[i]=in.nextInt();
        sum=sum+s[i];
     }
     
     System.out.println("4 subject marks are =");
     
     for (int i=0;i<n;i++)
     {   System.out.println("Marks="+s[i]);
     }
     
     average=sum/n;
     System.out.println("Sum="+sum+" Average="+average);
     
     if(average>=70) System.out.println(" Distinction");
     else
     if(average>=60) System.out.println(" First Class");
     else
     if(average>=50) System.out.println(" Second Class");
     else
     System.out.println(" Pass");
     
     
   }
}      
    
    