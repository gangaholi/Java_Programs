//save by A.java  
package pack;
public class MyMath{    
  public static int square(int n)
  {
     return n*n;
  } 
  public static int cube(int n)
  {
     return n*n*n;
  }
  public static int factorial(int n)
  {  if(n<=1) return 1;
     return( n*factorial(n-1));
  }
  
  public static int sumOfDigits(int n)
  {  if (n==0) return 0;
     return ( n%10 + sumOfDigits(n/10));
  }
  
  public static int gcd(int m, int n)
  {  if(n==0) return m;
     return gcd(n, (m%n));
  }
  public static int lcm(int m, int n)
  {     return ((m*n)/gcd(m,n));
  }  
   
}  