class TestRecursion{
  int sum(int a[], int n)
  {  if(n==0) return 0;
     return a[n-1] + sum(a, n-1);   
  }
  
  public static void main(String args[])
  {  
      TestRecursion  sumob= new TestRecursion();
      int a[]= { 23,45,67,788,78};
      int n= a.length;
      for(int i=0;i<n;i++)
         System.out.println(a[i]);
      System.out.println(" sum  of array elements ="+sumob.sum(a,n));
  }
}