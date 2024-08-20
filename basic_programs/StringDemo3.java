class StringDemo3 
{   public static void main(String args[])
    {    
       String str[] = { "one", "two", "three", "four" };
       int n= str.length;
       for(int i=0; i<n; i++)
             System.out.println("str[" + i + "]: " +str[i]);
       String temp;  
       for(int i=0;i<n;i++)
              for(int j=0; j<n-1;j++)
                  if(str[j].compareTo(str[j+1])> 0)
                  {  temp=str[j];
                     str[j]=str[j+1];
                     str[j+1]=temp;
                  }
        
       for(int i=0; i<str.length; i++)
             System.out.println("str[" + i + "]: " +str[i]);
        
    }
}