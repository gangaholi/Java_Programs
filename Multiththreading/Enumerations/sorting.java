class sorting
{

   static public void main(String args[])
   {  String temp;
      String names[]={ "abc", "abb", "ggg","ppp","grd", "ldhf"};
      int len=names.length;
      for(int i=0;i<len;i++)
         for(int j=0;j<len-i-1;j++)
         {
            if(names[j].compareTo(names[j+1])>0)
            {
               temp=names[j];
               names[j]=names[j+1];
               names[j+1]=temp;
            }
         }
     for(int i=0;i<len;i++)
        System.out.println(names[i]); 
   }
   
}    