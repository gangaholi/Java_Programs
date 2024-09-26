class Student
{
   String name;
   String usn;
   int sem;
   double m1,m2,m3;
   Student()
   {
      name="IC";
      usn ="00";
      sem = 3;
      m1=m2=m3=0;  
   } 
   
   Student(String name, String usn, int sem, double m1,double m2,double m3)
   {
      this.name= name;
      this.usn = usn;
      this.sem = sem ;
      this.m1=m1; this.m2=m2; this.m3=m3;  
   } 
   void display()
   {
      System.out.println("Name ="+name);
      System.out.println("USN  ="+usn);
      System.out.println("Sem ="+sem);
      System.out.println("M1 = "+m1+"  M2 = "+m2+"  M3 = "+m3);
   }
   void printResult()
   {  double sum, avg;
      if(m1 < 35 || m2 < 35 || m3 < 35 ) 
      {
          System.out.println(" fail "); return;
      }
      sum=m1+m2+m3;
      avg=sum/3;
      String result;
      if(avg>=75)
         result="FCD";
      else if(avg>=60)
         result="FC";
      else if(avg>=50)
         result="SC";
      else
         result="Pass";
     
      System.out.println("Result="+result);
   }
}

class TestStudent
{
   public static void main(String[] args)
   {
      Student s1 = new Student();
      s1.display();
      s1.printResult();
      Student s2 = new Student("Amar","1KS22IC001", 3,67,90,89);
      s2.display();
      s2.printResult();
   }
}