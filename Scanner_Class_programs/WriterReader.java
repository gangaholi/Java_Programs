// WriterReader.java
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

// Class Person.java
import java.io.Serializable;
class Person implements Serializable
{	//private static final long serialVersionUID = 1L;
	private String name;
   private String usn;
	private int age;
	private String gender;
	
	Person(String usn,String name, int age, String gender) {
		this.usn = usn;
      this.name = name;
		this.age = age;
		this.gender = gender;
	} 
   void updateName(String name)
   {
     this.name=name;
   }
   String getName()
   {
      return name;
   }
   int getAge()
   {
      return age;
   }
   String getUSN()
   {
      return usn;
   }
	public String toString() {
		return "Usn: "+usn+"\t Name:" + name + "\t Age: " + age + "\t Gender: " + gender+"\n";
	}
}

public class WriterReader {
	public static void main(String[] args) {
		Person p1 = new Person("1KS22IC002","Jai", 30, "Male");
		Person p2 = new Person("1KS22IC042","Rai", 25, "Female");
		try {  
           FileOutputStream f = new FileOutputStream(new File("myObjects.txt"));
		     ObjectOutputStream o = new ObjectOutputStream(f);
			  // Write objects to file
			  o.writeObject(p1);
			  o.writeObject(p2);
			  o.close();
			  f.close();
			  FileInputStream fi = new FileInputStream(new File("myObjects.txt"));
			  ObjectInputStream oi = new ObjectInputStream(fi);
			  // Read objects
			  Person pr1 = (Person) oi.readObject();
			  Person pr2 = (Person) oi.readObject();
			  System.out.println(pr1);
			  System.out.println(pr2);
           System.out.println("USN is  ="+pr2.getUSN());
           System.out.println("Age is  ="+pr2.getAge());
           System.out.println("Name is  ="+pr2.getName());
           pr2.updateName("Ganga");
           System.out.println("Updated Name  ="+pr2.getName());
           String usn="1KS22ic002";
           if(usn.equalsIgnoreCase(pr1.getUSN()))
             System.out.println(" USN found ");
            else
            System.out.println(" USN not found ");
           oi.close();
			  fi.close();
		  } catch (FileNotFoundException e) {
			  System.out.println("File not found");
		  } catch (IOException e) {
			  System.out.println("Error initializing stream");
		  } catch (ClassNotFoundException e) {
			 e.printStackTrace();
	    }
   }
}
