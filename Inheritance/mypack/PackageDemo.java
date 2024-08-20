import java.util.Scanner;
import pack.*; 
     
public class PackageDemo
{   public static void main(String args[])
     {   Scanner in= new Scanner(System.in);  
         int m,n;
         System.out.println("Enter n for square and cube=");
         n= in.nextInt();
         System.out.println("Enter m  for gcd and lcm=");
         n= in.nextInt();
         System.out.println("Enter n for gcd and lcm=");
         m= in.nextInt();     
         System.out.println("Sqaure(4) = "+MyMath.square(n));
         System.out.println("Cube(4) = "+MyMath.cube(n));
         System.out.println("Factorial(4)="+MyMath.factorial(n));
         System.out.println("GCD(115,25)="+MyMath.gcd(m,n));
         System.out.println("LCM(15,25)="+MyMath.lcm(m,n));
      }  
} 

