/* Given below is the list of marks obtained by a class of 50 students in an annual examination.
43 65 51 27 79 11 56 61 82 09 25 36 07 49 55 63 74 81 49 37
40 49 16 75 87 91 33 24 58 78 65 56 76 67 45 54 36 63 12 21
73 49 51 19 39 49 68 93 85 59
Write a Java program to count the number of students belonging to each of following groups of marks: 0-9, 10-19, 20-29,.....,100.
*/
import java.util.Scanner;
class StaticalProblem
{
   public static void main(String args[])
   {
      int marks[]={43,65,51,27,79,11,56,61,82,99,25,36,57,49,55,63,74,81,49,37,40,49,66,75,87,91,93,24,58,78,65,56,76,67,45,54,36,63,12,21,73,49,51,19,39,49,68,93,85,59};
      int group[]=new int[10]; // by default array values are initialized with 0
      int x;
      int c90=0,c80=0, c70=0,c60=0,c50=0; int c40=0,c30=0,c20=20,c10=10,c0=0;
      for(int i=0;i<marks.length;i++)
      {  x=marks[i];
         if(x>=90) c90++; 
         else
         if(x>=80) c80++; 
         else
         if(x>=70) c70++; 
         else
         if(x>=60) c60++; 
         else
         if(x>=50) c50++; 
         else
         if(x>=40) c40++; 
         else
         if(x>=30) c30++; 
         else
         if(x>=20) c20++; 
         else
         if(x>=10) c10++; 
         else
          c0++; 
        }
        
        int i=0;
        group[i++]=c0;
        group[i++]=c10; group[i++]=c20; group[i++]=c30;
        group[i++]=c40; group[i++]=c50; group[i++]=c60;
        group[i++]=c70; group[i++]=c80; group[i++]=c90;
       
        int xx=0,y=xx+9;
        
        for(i=0;i<10;i++)
        {  
           System.out.println("Number of students in the range "+xx+ "- "+y+"="+group[i]);  
           xx=xx+10; y=y+10;       
        }
   }
}   
   