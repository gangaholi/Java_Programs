class Student 
{
   private int rno;   
   private String name;
   
   void display()
   {
     System.out.println(" Rno="+rno);
     System.out.println("  Name ="+name);
   }
   void setData(int r, String nam)
   {
      rno=r;
      name=nam;
   }
}

class Student_demo
{
    public static void main(String args[])
    {
       Student s= new Student();
       System.out.println(" Hello  s="+s);
       s.display(); 
       s.setData(5, "ICB");
       s.display();
       Student s1= new Student();
       s1.setData(5, "ICB");
       s1.display();
 
    }
    
 }   