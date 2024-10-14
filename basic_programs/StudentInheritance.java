	class Person {
	  String name;
	  public Person(String theName) {
	    this.name = theName;
	  }
     
     void display()
     { 
       System.out.println("Name="+name );
       
     }
	}
	
	public class StudentInheritance extends Person {
	  private int id;
     public static int nextId = 1;
	  public StudentInheritance(String theName) {
	    super(theName);
	    id = nextId++;
	  }
     void display()
     { 
       System.out.println("Name="+name+"  Id="+id);
       
     }
     
	
	  public static void main(String[] args) {
	    StudentInheritance e1 = new StudentInheritance("Alice");
	    StudentInheritance e2 = new StudentInheritance("Bob");
	    StudentInheritance e3 = new StudentInheritance("Carol");
	    StudentInheritance arrayOfPeople[] = {e1, e2, e3};
       for(int i=0;i<arrayOfPeople.length;i++)
         arrayOfPeople[i].display();
         
      
      
       Person e11 = new StudentInheritance("John");
	    Person e12 = new StudentInheritance("Max");
	    Person e13 = new StudentInheritance("Steven");
	    
       Person  People[] = {e11, e12, e13};
        for(int i=0;i<People.length;i++)
           People[i].display();
       }
	}