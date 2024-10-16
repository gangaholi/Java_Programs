class Person
{   
 String name;
 int Id;
 String place;
 Person(String nam, int id, String plce)
 {
     name=nam; Id=id; place=plce;
 }
 void display_details()
 {
     System.out.println("Name: "+name+", Id: "+Id+", Place :"+ place); 
 }    
}

class Student extends Person
{   String department;
    int sem;
    
    Student(String nam, int id, String plce, String dept, int sm)
    {
       super(nam, id, plce);
       department=dept;
       sem=sm;
    }
    void display()
    {
      display_details();
      System.out.println("Department: "+department +", Sem: "+sem);
    }
}

class Teacher extends Person
{   String department, designation;
    Teacher(String nam, int id, String plce, String dept, String design)
    {
      super(nam, id, plce);
      department=dept;
      designation=design;
    }
    void display()
    {
      display_details();
      System.out.println("Department: "+department +", Designation: "+designation);
    }
}
  
class PersonSTDemo
{
   public static void main(String args[])
   {
        Teacher Tobj =  new Teacher("ABC", 1, "Bangalore", "ICB", "Professor");
        Tobj.display();
   
   }

}

  