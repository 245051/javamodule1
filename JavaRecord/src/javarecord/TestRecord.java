package javarecord;

public class TestRecord {
	public static void main(String[] args) {
		Person join = new Person("John",30);
		Person sarah = new Person("Sarah",25);
		System.out.println(join.name());//prints "John"
		System.out.println(sarah.age());
	}

}
