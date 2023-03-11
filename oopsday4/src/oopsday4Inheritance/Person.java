package oopsday4Inheritance;

public class Person {
	private String name;
	private String gender;
	private int age;
	
	public Person() {
		// TODO Auto-generated constructor stub
	}
	public Person(String name,String gender ,int age) {
		super(); // Every class extends object class.
		this.age = age;
		this.name = name;
		this.gender = gender;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getGender() {
		return gender;
	}


	public void setGender(String gender) {
		this.gender = gender;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	@Override
	public String toString() {
		return "Person [name=" + name + ", gender=" + gender + ", age=" + age + "]";
	}

}
