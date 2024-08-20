// Class Person.java
import java.io.Serializable;
public class Person implements Serializable
{	private static final long serialVersionUID = 1L;
	private String name;
	private int age;
	private String gender;
	
	Person(String name, int age, String gender) {
		this.name = name;
		this.age = age;
		this.gender = gender;
	}
	@Override
	public String toString() {
		return "Name:" + name + "\nAge: " + age + "\nGender: " + gender;
	}
}
