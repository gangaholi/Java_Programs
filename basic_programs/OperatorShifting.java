class OperatorShifting   
{  
  public static void main(String args[])  
  {  byte x, y;  
     x=10;        y=-5;     
     System.out.println("Bitwise Left Shift: x<<2 = "+(x<<2));  
     System.out.println("Bitwise Right Shift: x>>2 = "+(x>>2));  
     y=-1;   x=1;
     System.out.println("Signed Right Shift: y>>2 = "+(y>>24)); 
     System.out.println("Bitwise Zero Fill Right Shift: x>>>2 = "+(x>>>2));
     System.out.println("Bitwise Zero Fill Right Shift: y>>>2 = "+(y>>>2));  
     for(int i=0;i<=24;i=i+2)
     {  System.out.println("Signed Right Shift: y>>2 = "+(y>>24)); 
        System.out.println("Bitwise Zero Fill Right Shift   x by "+i+" times = "+(x>>>i));
        System.out.println("Bitwise Zero Fill Right Shift: y  by "+i+" times = "+(y>>>i));
     } 
   }  
}  