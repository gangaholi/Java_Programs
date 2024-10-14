// Demonstrate static variables, methods, and blocks.
class Student_ICB 
{
   static  int count;
   static String topperName;
   static int topperMarks; 
   static int id;
   String USN;
   String name;
   int marks;
   Student_ICB(String name, int marks)
   {    count++; id++;
        System.out.println("Inside Constructor...."+count +" student Object Created."+count); 
        this.USN="1KS23IC00"+id;
        this.name=name;
        this.marks=marks;
        if(marks > topperMarks)
        {   topperMarks=marks;
            topperName=name;
        }
    }
   
   void display() 
   {
      System.out.print("USN="+USN+"\t");
      System.out.print("Name="+name+"\t");
      System.out.print("Marks="+marks+"\n");   
   }
}

public class StudentCountDemo{
   
   public static void main(String args[]) 
   {  
       Student_ICB students[] = new  Student_ICB[10]; 
       int marks=500;
       String name="KS1";
        for( int i=0;i<4;i++)
        {  
           students[i]=new Student_ICB(name,marks);
           marks =marks+10;
           name="KS"+(i+2);
        }
        System.out.println(" Student Details...");
       
        for( int i=0;i<4;i++)
          students[i].display();
          
       
       System.out.println("Topper name is "+students[3].topperName);
       System.out.println("Topper marks are "+students[3].topperMarks);
   }
}

